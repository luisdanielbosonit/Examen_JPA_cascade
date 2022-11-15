package com.bosonit.training.examenJPA.chuchi.dtos.oUTput;

import com.bosonit.training.examenJPA.chuchi.entity.Cliente;

import java.util.List;

public class FacturaOUTputDto {

    private CabeceraOUTputdto cabeceraOUTputdto;
    private Cliente cliente;
    private List<LineasOUTputDto> lineasOUTputDto;


//    public FacturaOUTputDto(CabeceraFra cabeceraFra) {
////        this.id_cabecera = cabeceraFra.getId_cabecera();
////        this.importeFra = cabeceraFra.getImporteFra();
//
////        setCliente(new Cliente(cabeceraFra.getCliente().getNombre()));
////        setLineasOUTputDto(new LineasOUTputDto(cabeceraFra.getLineasFactura().stream().map(LineasOUTputDto::new).forEach(lineasOUTputDto::add)));
////        List<LineasOUTputDto> lineasOUTputDtoList = cabeceraFra.getLineasFactura().stream().map(LineasOUTputDto::new).collect(Collectors.toList());
////        setLineasOUTputDto(lineasOUTputDtoList);
//        this.lineasOUTputDto= cambio(cabeceraFra.getLineasFactura());
//    }
//
//    public static List<LineasOUTputDto> cambio(List<LineasFra> lineas) {
//        List<LineasOUTputDto> lineasOUTputDtoList = new ArrayList<>();
//        for (LineasFra linea : lineas) {
//            lineasOUTputDtoList.add(new LineasOUTputDto(linea));
//        }
//        return lineasOUTputDtoList;
//    }
}
