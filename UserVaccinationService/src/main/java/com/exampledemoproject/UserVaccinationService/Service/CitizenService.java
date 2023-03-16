package com.exampledemoproject.UserVaccinationService.Service;

import com.exampledemoproject.UserVaccinationService.Entity.Citizen;

import java.util.List;

public interface CitizenService {
    public Citizen addCitizen(Citizen citizen);

    public List<Citizen> getCitizenById(Integer id);
}
