package com.exampledemoproject.UserVaccinationService.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    @NotBlank
    @Column(name = "citizen_name")
    private String name;
    @NotNull
    @Min(1)
    @Column(name = "vaccinationCenter_id")
    private int vaccinationCenterId;
}
