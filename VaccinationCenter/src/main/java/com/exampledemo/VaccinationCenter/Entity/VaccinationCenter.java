package com.exampledemo.VaccinationCenter.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
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


    @NotNull @NotBlank
    @Column(name = "center_name")
    private String CenterName;

    @NotNull @NotBlank
    @Column(name = "center_address")
    private String centerAddress;
}
