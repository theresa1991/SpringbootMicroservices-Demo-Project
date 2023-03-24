package com.exampledemoproject.UserVaccinationService.Repository;

import com.exampledemoproject.UserVaccinationService.Entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
    List<Citizen> findByVaccinationCenterId(Integer id);
}
