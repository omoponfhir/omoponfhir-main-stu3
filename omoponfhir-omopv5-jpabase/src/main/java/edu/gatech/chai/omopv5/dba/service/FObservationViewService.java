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

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import edu.gatech.chai.omopv5.model.entity.FObservationView;

// TODO: Auto-generated Javadoc
/**
 * The Interface FObservationViewService.
 */
@Transactional
public interface FObservationViewService extends IService<FObservationView> {
	
	/**
	 * Find diastolic.
	 *
	 * @param conceptId the concept id
	 * @param personId the person id
	 * @param date the date
	 * @param time the time
	 * @return the f observation view
	 */
	public FObservationView findDiastolic (Long conceptId, Long personId, Date date, Date time);

}
