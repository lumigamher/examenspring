package com.campus.examenspring.domain.entities.farmacymedicine;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class FarmacymedicinePK implements Serializable {

    private Long idEmployee; 
    private Long idConnection;
}