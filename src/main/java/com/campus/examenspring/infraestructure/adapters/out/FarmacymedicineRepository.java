package com.campus.examenspring.infraestructure.adapters.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.examenspring.domain.entities.farmacymedicine.Farmacymedicine;
import com.campus.examenspring.domain.entities.farmacymedicine.FarmacymedicinePK;

@Repository
public interface FarmacymedicineRepository extends JpaRepository<Farmacymedicine, FarmacymedicinePK>{

}
