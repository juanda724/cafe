package com.finca.cafedb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "variedades_cafe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VariedadCafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String origen;

    private Integer altitudOptima;
}