package com.exampledemoproject.UserVaccinationService.Controller;


import com.exampledemoproject.UserVaccinationService.Entity.Citizen;
import com.exampledemoproject.UserVaccinationService.Service.CitizenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CitizenController {
    @Autowired
    private CitizenService citizenService;

    @PostMapping("citizen/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody @Valid Citizen citizen) {
        Citizen citizenNew = citizenService.addCitizen(citizen);
        return new ResponseEntity<>(citizenNew, HttpStatus.OK);
    }

    @GetMapping("citizen/id/{id}")
    public ResponseEntity<List<Citizen>> getCitizenById(@PathVariable Integer id) {
        List<Citizen> citizenList = citizenService.getCitizenById(id);
        if (citizenList != null && !citizenList.isEmpty()) {
            return new ResponseEntity<>(citizenList, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
