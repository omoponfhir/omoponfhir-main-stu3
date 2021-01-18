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


import edu.gatech.chai.omopv5.model.entity.FPerson;
import edu.gatech.chai.omopv5.model.entity.Location;

// TODO: Auto-generated Javadoc
/**
 * The Interface FPersonService.
 */
public interface FPersonService extends IService<FPerson> {
	
	/**
	 * Search by name and location.
	 *
	 * @param familyName the family name
	 * @param given1Name the given 1 name
	 * @param given2Name the given 2 name
	 * @param location the location
	 * @return the f person
	 */
	public FPerson searchByNameAndLocation(String familyName, String given1Name, String given2Name, Location location);
}
