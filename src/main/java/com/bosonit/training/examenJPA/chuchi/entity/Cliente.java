package com.bosonit.training.examenJPA.chuchi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id_cliente;
    String nombre;

    public Cliente(String nombre) {
        this.nombre=nombre;
    }
}
