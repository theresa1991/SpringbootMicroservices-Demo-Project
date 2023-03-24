package com.exampledemo.VaccinationCenter.Service;

import com.exampledemo.VaccinationCenter.Entity.VaccinationCenter;

public interface VaccinationService {
    public VaccinationCenter addCitizen(VaccinationCenter vaccinationCenter);

    public VaccinationCenter getAllDataBasedOnCenterId(Integer id);

    public VaccinationCenter getAllDataBasedOnCenterIdFeign(Integer id);

}
