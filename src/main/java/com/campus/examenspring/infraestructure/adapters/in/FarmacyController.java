package com.campus.examenspring.infraestructure.adapters.in;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.examenspring.app.FarmacyService;
import com.campus.examenspring.domain.entities.Farmacy;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/Farmacy")
@AllArgsConstructor
public class FarmacyController {

    private final FarmacyService farmacyService;

    @GetMapping
    public List<Farmacy> getAllFarmacys() {
        return farmacyService.findAll();
    }

    @GetMapping("/{id}")
    public Farmacy getFarmacyById(@PathVariable Long id) {
        return farmacyService.findById(id);
    }

    @PostMapping
    public Farmacy createFarmacy(@RequestBody Farmacy farmacy) {
        return farmacyService.save(farmacy);
    }

    @PutMapping("/{id}")
    public Farmacy updateFarmacy(@PathVariable Long id, @RequestBody Farmacy farmacy) {
        farmacy.setId(id);
        return farmacyService.save(farmacy);
    }

    @DeleteMapping("/{id}")
    public void deleteFarmacy(@PathVariable Long id) {
        farmacyService.deleteById(id);
    }
}
