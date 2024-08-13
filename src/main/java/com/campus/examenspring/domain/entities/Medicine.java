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
@Table(name = "medicine")
@Data
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "proccedings")
    private String proccedings;

    @Column(name = "namemedicine")
    private String nameMedicine;

    @Column(name = "healtregister")
    private String healtRegister;

    @Column(name = "description")
    private String description;

    @Column(name = "descriptioshort")
    private String descriptioShort;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin", referencedColumnName = "id", nullable = false)
    private Modeadministration modeadministration;

    @ManyToOne
    @JoinColumn(name = "codeap", referencedColumnName = "idap", nullable = false)
    private Activeprinciple activeprinciple;

    @ManyToOne
    @JoinColumn(name = "codeum", referencedColumnName = "idum", nullable = false)
    private Unitmeasurment unitmeasurment;

    @Column(name = "namerol")
    private String nameRol;

    @ManyToOne
    @JoinColumn(name = "codelab", referencedColumnName = "id", nullable = false)
    private Laboratory laboratory;
}
