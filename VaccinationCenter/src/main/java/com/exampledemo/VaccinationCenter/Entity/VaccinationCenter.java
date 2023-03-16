package com.exampledemo.VaccinationCenter.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationCenter {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;


    @Column
    private String CenterName;

    @Column
    private String centerAddress;
}
