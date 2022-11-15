package com.bosonit.training.examenJPA.chuchi.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class CabeceraFra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id_cabecera;
    Double importeFra;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    Cliente clienteR;

    @OneToMany(fetch=FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name="LINEAS_FRA")
    List<LineasFra> lineasFra;

    public CabeceraFra( Double importeFra, Cliente cliente) {
        this.importeFra = importeFra;
        this.clienteR = cliente;
    }

}
