package com.campus.examenspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @Column(name = "codecountry")
    private String codeCountry;

    @Column(name = "namecountry")
    private String nameCoutry;
}
