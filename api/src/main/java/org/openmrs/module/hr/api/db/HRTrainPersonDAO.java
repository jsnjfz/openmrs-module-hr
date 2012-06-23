package org.openmrs.module.hr.api.db;

import org.openmrs.module.hr.HrTrainPerson;

import java.util.List;

public interface HRTrainPersonDAO {

    public void saveTrainPerson(HrTrainPerson trainPerson);

    public void deleteTrainPerson(HrTrainPerson trainPerson);

    public List<HrTrainPerson> findTrainPersonByExample(HrTrainPerson trainPerson);

    public HrTrainPerson getTrainPersonById( int id);
}