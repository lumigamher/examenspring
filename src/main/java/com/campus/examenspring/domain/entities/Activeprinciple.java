package com.campus.examenspring.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "activeprinciple")
@Data
public class Activeprinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idap")
    private long idap;

    @Column(name = "nameap")
    private String nameap;
}
