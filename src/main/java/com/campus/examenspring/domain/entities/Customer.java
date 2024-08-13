package com.campus.examenspring.domain.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcustomer")
    private long idCustomer;

    @Column(name = "namecustomer")
    private String nameCustomer;

    @Column(name = "lastnamecustomer")
    private String lastNameCustomer;

    @JoinColumn(name = "codecitycustomer", referencedColumnName = "codecity", nullable = false)
    private long codecitycustomer;

    @Column(name = "emailcustomer")
    private String emailCustomer;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "long")
    private double longCustomer;

    @Column(name = "lat")
    private double latCustomer;
}
