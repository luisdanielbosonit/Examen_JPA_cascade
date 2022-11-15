package com.bosonit.training.examenJPA.chuchi.dtos.iNputDtos;

import com.bosonit.training.examenJPA.chuchi.entity.Cliente;
import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteINputDto implements Serializable {

    private String nombre;

    public Cliente transfortIntoCliente(){
        Cliente cliente= new Cliente();
        cliente.setNombre(this.nombre);

        return cliente;
    }



}
