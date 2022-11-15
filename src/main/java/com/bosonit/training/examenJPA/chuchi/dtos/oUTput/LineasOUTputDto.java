package com.bosonit.training.examenJPA.chuchi.dtos.oUTput;

import com.bosonit.training.examenJPA.chuchi.entity.LineasFra;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class LineasOUTputDto implements Serializable {

    public Integer id_lineas;
    public String proNombre;
    public Double cantidad;
    public Double precio;

    public LineasOUTputDto(LineasFra lineasFra){
        this.id_lineas=lineasFra.getId_lineas();
        this.proNombre=lineasFra.getProNombre();
        this.cantidad=lineasFra.getCantidad();
        this.precio=lineasFra.getPrecio();
    }
}
