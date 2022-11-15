package com.bosonit.training.examenJPA.chuchi.dtos.oUTput;

import com.bosonit.training.examenJPA.chuchi.entity.Cliente;

import java.io.Serializable;

public class ClienteOUTputDtos implements Serializable {
    private Integer id_cliente;
    private String nombre;

    public ClienteOUTputDtos(Cliente cliente){
        this.id_cliente= cliente.getId_cliente();
        this.nombre= cliente.getNombre();
    }
}
