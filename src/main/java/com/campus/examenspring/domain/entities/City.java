package com.campus.examenspring.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "city")
@Data
public class City {
    @Id
    @Column(name = "codecity")
    private String codecity;

    @Column(name = "namecity")
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "codereg", referencedColumnName = "codereg", nullable = false)
    private Region region;
}
