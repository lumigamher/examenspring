package com.campus.examenspring.infraestructure.adapters.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.examenspring.domain.entities.Farmacy;

@Repository
public interface FarmacyRepository extends JpaRepository<Farmacy, Long>{
    
}
