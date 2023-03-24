package com.exampledemo.VaccinationCenter.ServiceImpl;

import com.exampledemo.VaccinationCenter.Entity.VaccinationCenter;
import com.exampledemo.VaccinationCenter.Repository.VaccinationCenterRepository;
import com.exampledemo.VaccinationCenter.Service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationServiceImpl implements VaccinationService {
    @Autowired
    private VaccinationCenterRepository vaccinationCenterRepository;

    @Override
    public VaccinationCenter addCitizen(VaccinationCenter vaccinationCenter) {
        return vaccinationCenterRepository.save(vaccinationCenter);
    }

    @Override
    public VaccinationCenter getAllDataBasedOnCenterId(Integer id) {
        return vaccinationCenterRepository.findById(id).get();
    }

    @Override
    public VaccinationCenter getAllDataBasedOnCenterIdFeign(Integer id) {
        return vaccinationCenterRepository.findById(id).get();
    }

}
