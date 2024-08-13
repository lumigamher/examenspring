package com.campus.examenspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "farmacy")
@Data
public class Farmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "namefarmacy")
    private String nameFarmacy;

    @Column(name = "addressfarmacy")
    private String addressFarmacy;

    @Column(name = "long")
    private double longFarmacy;

    @Column(name = "latfarmacy")
    private double latfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecityfarm", referencedColumnName = "codecity", nullable = false)
    private City city;

    @Column(name = "logofarmacy")
    private String logoFarmacy;
}
