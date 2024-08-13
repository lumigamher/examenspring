package com.campus.examenspring.domain.entities.farmacymedicine;

import com.campus.examenspring.domain.entities.Farmacy;
import com.campus.examenspring.domain.entities.Medicine;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "farmacymedicine")
@Data
public class Farmacymedicine {
    @EmbeddedId
    private FarmacymedicinePK id;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "idfarmacy", referencedColumnName = "id", nullable = false)
    private Farmacy farmacy;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "idmedicinefatrm", referencedColumnName = "id", nullable = false)
    private Medicine medicine;
}
