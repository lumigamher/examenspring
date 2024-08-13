package com.campus.examenspring.infraestructure.adapters.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.examenspring.domain.entities.Unitmeasurment;

@Repository
public interface UnitmeasurmentRepository extends JpaRepository<Unitmeasurment, Long>{

}
