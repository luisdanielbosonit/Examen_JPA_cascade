package com.bosonit.training.examenJPA.chuchi.dtos.oUTput;

import com.bosonit.training.examenJPA.chuchi.entity.Cliente;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CabeceraOUTputdto implements Serializable {
    private Integer id_cabecera;
    private Double importeFra;

    private Cliente cliente;
    private List<LineasOUTputDto> lineasOUTputDto;

//
//    public CabeceraOUTputdto(CabeceraFra cabeceraFra) {
//        this.id_cabecera = cabeceraFra.getId_cabecera();
//        this.importeFra = cabeceraFra.getImporteFra();
//        setCliente(new Cliente(cabeceraFra.getCliente()));
//        this.lineasOUTputDto= cambio(cabeceraFra.getLineasFactura());
//
//
//    }
//    public static List<LineasOUTputDto> cambio(List<LineasFra> lineas) {
//        List<LineasOUTputDto> lineasOUTputDtoList = new ArrayList<>();
//        for (LineasFra linea : lineas) {
//            lineasOUTputDtoList.add(new LineasOUTputDto(linea));
//        }
//        return lineasOUTputDtoList;
//    }
}



