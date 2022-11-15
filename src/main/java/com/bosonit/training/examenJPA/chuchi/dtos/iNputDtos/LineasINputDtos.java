package com.bosonit.training.examenJPA.chuchi.dtos.iNputDtos;

import com.bosonit.training.examenJPA.chuchi.entity.LineasFra;
import lombok.Data;

import java.io.Serializable;

@Data
public class LineasINputDtos implements Serializable {
    public Integer id_lineas;
    public String proNombre;
    public Double cantidad;
    public Double precio;

    public LineasFra transforIntoLineas(){
        LineasFra lineasFra = new LineasFra();
    lineasFra.setProNombre(this.proNombre);
    lineasFra.setCantidad(this.cantidad);
    lineasFra.setPrecio(this.precio);

    return lineasFra;
    }
}
