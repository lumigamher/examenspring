package com.campus.examenspring.domain.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @Column(name = "idcustomer")
    private String idCustomer;

    @Column(name = "namecustomer")
    private String nameCustomer;

    @Column(name = "lastnamecustomer")
    private String lastNameCustomer;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer", referencedColumnName = "codecity", nullable = false)
    private City city;

    @Column(name = "emailcustomer")
    private String emailCustomer;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "longt")
    private double longCustomer;

    @Column(name = "lat")
    private double latCustomer;
}
