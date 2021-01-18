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
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.gatech.chai.omopv5.jpa.dao.DrugExposureDao;
import edu.gatech.chai.omopv5.model.entity.DrugExposure;

// TODO: Auto-generated Javadoc
/**
 * The Class DrugExposureServiceImp.
 */
@Service
public class DrugExposureServiceImp extends BaseEntityServiceImp<DrugExposure, DrugExposureDao>
		implements DrugExposureService {
	final static Logger logger = LoggerFactory.getLogger(DrugExposureServiceImp.class);
			
	/**
	 * Instantiates a new drug exposure service imp.
	 */
	public DrugExposureServiceImp() {
		super(DrugExposure.class);
	}
}
