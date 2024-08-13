package com.campus.examenspring.app;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.examenspring.domain.entities.Farmacy;
import com.campus.examenspring.infraestructure.adapters.out.FarmacyRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FarmacyService {

    private final FarmacyRepository farmacyRepository;

    public List<Farmacy> findAll() {
        return farmacyRepository.findAll();
    }

    public Farmacy findById(Long id) {
        return farmacyRepository.findById(id).orElse(null);
    }

    public Farmacy save(Farmacy farmacy) {
        return farmacyRepository.save(farmacy);
    }

    public void deleteById(Long id) {
        farmacyRepository.deleteById(id);
    }   

}
