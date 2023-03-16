package com.exampledemo.VaccinationCenter.UserVaccinationProxy;

import com.exampledemo.VaccinationCenter.Model.Citizen;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "CITIZEN-SERVICE",url = "localhost:8000")
public interface VaccinationProxy {

    @GetMapping("citizen/id/{id}")
    public ResponseEntity<List<Citizen>> getCitizenById(@PathVariable Integer id);
}
