package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "provincias")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Provincia extends Base{

    @Column(name = "nombre_provincia")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "fk_pais")
    private Pais pais;

}