package com.bosonit.training.examenJPA.chuchi.dtos.iNputDtos;
import com.bosonit.training.examenJPA.chuchi.entity.CabeceraFra;
import lombok.Data;

import java.io.Serializable;


@Data
public class CabeceraINputDtos implements Serializable {
    private Integer id_cabecera;
    private Double importeFra;

    public CabeceraFra transfortIntoCabecera(){
        CabeceraFra cabeceraFra= new CabeceraFra();
        cabeceraFra.setImporteFra(this.importeFra);

        return cabeceraFra;
    }
}
