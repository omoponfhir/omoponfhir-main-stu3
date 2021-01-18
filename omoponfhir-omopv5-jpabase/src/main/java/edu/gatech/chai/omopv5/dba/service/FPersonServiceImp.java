/*******************************************************************************
 * Copyright (c) 2019 Georgia Tech Research Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *******************************************************************************/
package edu.gatech.chai.omopv5.dba.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.gatech.chai.omopv5.jpa.dao.FPersonDao;
import edu.gatech.chai.omopv5.model.entity.FPerson;
import edu.gatech.chai.omopv5.model.entity.Location;

// TODO: Auto-generated Javadoc
/**
 * The Class FPersonServiceImp.
 */
@Service
public class FPersonServiceImp extends BaseEntityServiceImp<FPerson, FPersonDao> implements FPersonService {

	/**
	 * Instantiates a new f person service imp.
	 */
	public FPersonServiceImp() {
		super(FPerson.class);
	}
	
	/* (non-Javadoc)
	 * @see edu.gatech.chai.omopv5.dba.service.FPersonService#searchByNameAndLocation(java.lang.String, java.lang.String, java.lang.String, edu.gatech.chai.omopv5.model.entity.Location)
	 */
	@Transactional(readOnly = true)
	public FPerson searchByNameAndLocation(String familyName, String given1Name, String given2Name, Location location) {
		EntityManager em = getEntityDao().getEntityManager();
		String queryString = "SELECT t FROM FPerson t WHERE";
		
		// Construct where clause here.
		String where_clause = "";
		if (familyName != null)  {
			where_clause = "familyName like :fname";
		}
		if (given1Name != null) {
			if (where_clause == "") where_clause = "givenName1 like :gname1";
			else where_clause += " AND givenName1 like :gname1";
		}
		if (given2Name != null) {
			if (where_clause == "") where_clause = "givenName2 like :gname2";
			else where_clause += " AND givenName2 like :gname2";
		}
		
		if (location != null) {
			if (where_clause == "") where_clause = "location = :location";
			else where_clause += " AND location = :location";
		}
		
		queryString += " "+where_clause;
		System.out.println("Query for FPerson"+queryString);
		
		TypedQuery<? extends FPerson> query = em.createQuery(queryString, FPerson.class);
		if (familyName != null) query = query.setParameter("fname", familyName);
		if (given1Name != null) query = query.setParameter("gname1", given1Name);
		if (given2Name != null) query = query.setParameter("gname2", given2Name);
		if (location != null) query = query.setParameter("location", location);
		
		System.out.println("family:"+familyName+" gname1:"+given1Name+" gname2"+given2Name);
		List<? extends FPerson> results = query.getResultList();
		if (results.size() > 0) {
			return results.get(0);
		} else
			return null;	
		}

}
