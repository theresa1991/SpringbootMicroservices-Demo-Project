package com.exampledemoproject.UserVaccinationService.ServiceImpl;

import com.exampledemoproject.UserVaccinationService.Entity.Citizen;
import com.exampledemoproject.UserVaccinationService.Repository.CitizenRepository;
import com.exampledemoproject.UserVaccinationService.Service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CitizenServiceImpl implements CitizenService {


    @Autowired
    private CitizenRepository citizenRepository;
    @Override
    public Citizen addCitizen(Citizen citizen) {
            return citizenRepository.save(citizen);
    }

    @Override
    public List<Citizen> getCitizenById(Integer id) {
        return citizenRepository.findByVaccinationCenterId(id);
    }
}
