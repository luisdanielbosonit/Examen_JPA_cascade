package com.bosonit.training.examenJPA.chuchi.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class LineasFra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   public Integer id_lineas;
   public String proNombre;
   public Double cantidad;
   public Double precio;


    public LineasFra(String proNombre, Double cantidad, Double precio) {
        this.proNombre = proNombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
}
