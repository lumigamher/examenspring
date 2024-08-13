package com.campus.examenspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "region")
@Data
public class Region {
    @Id
    @Column(name = "codereg")
    private String codeReg;

    @Column(name = "namereg")
    private String nameRegion;

    @ManyToOne
    @JoinColumn(name = "codecountry", referencedColumnName = "codecountry", nullable = false)
    private Country country;
}
