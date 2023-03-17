package com.exampledemo.VaccinationCenter.Controller;

import com.exampledemo.VaccinationCenter.Entity.VaccinationCenter;
import com.exampledemo.VaccinationCenter.Model.Citizen;
import com.exampledemo.VaccinationCenter.Model.RequiredResponse;
import com.exampledemo.VaccinationCenter.Service.VaccinationService;
import com.exampledemo.VaccinationCenter.UserVaccinationProxy.VaccinationProxy;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class VaccinationCenterController {

    @Autowired
    private VaccinationProxy vaccinationProxy;
    @Autowired
    private VaccinationService vaccinationService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("vaccinationcenter/add")

    public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody @Valid VaccinationCenter vaccinationCenter){
VaccinationCenter vaccinationCenter1=vaccinationService.addCitizen(vaccinationCenter);
return  new ResponseEntity<>(vaccinationCenter1, HttpStatus.OK);
    }


    @GetMapping("vaccinationcenter/id/{id}")
    public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterId(@PathVariable Integer id){

        RequiredResponse requiredResponse=new RequiredResponse();
        VaccinationCenter vaccinationCenter=vaccinationService.getAllDataBasedOnCenterId(id);
        requiredResponse.setCenter(vaccinationCenter);
        List<Citizen>listOfCitizen=restTemplate.getForObject("http://localhost:8000/citizen/id/"+id,List.class);
        requiredResponse.setCitizens(listOfCitizen);
        return new ResponseEntity<RequiredResponse>(requiredResponse,HttpStatus.OK);

    }

    @GetMapping("vaccinationcenter/id-feign/{id}")
    public ResponseEntity<RequiredResponse> getAllDataBasedOnCenterIdFeign(@PathVariable Integer id){


        RequiredResponse requiredResponse=new RequiredResponse();
        VaccinationCenter vaccinationCenter1=vaccinationService.getAllDataBasedOnCenterIdFeign(id);
        requiredResponse.setCenter(vaccinationCenter1);

        List<Citizen>listOfCitizen= vaccinationProxy.getCitizenById(id).getBody();
        requiredResponse.setCitizens(listOfCitizen);
        return new ResponseEntity<RequiredResponse>(requiredResponse,HttpStatus.OK);

    }
}
