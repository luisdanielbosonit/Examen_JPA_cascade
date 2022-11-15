package com.bosonit.training.examenJPA.chuchi.controller;

import com.bosonit.training.examenJPA.chuchi.dtos.iNputDtos.LineasINputDtos;
import com.bosonit.training.examenJPA.chuchi.entity.CabeceraFra;
import com.bosonit.training.examenJPA.chuchi.service.ServiceImplCabecera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerLineas {

    @Autowired
    ServiceImplCabecera serviceFactura;


    @GetMapping("/get/factura")
    public List<CabeceraFra> viewall(){
        return serviceFactura.viewall();
    }
    @DeleteMapping("/factura/{id}")
    public String deleteFac(@PathVariable Integer id) throws Exception {
        return serviceFactura.delete(id);
    }
    @PutMapping("/linea/{id}")
    public CabeceraFra addLineaFra(@RequestBody LineasINputDtos lineaInputDTO,
                                   @PathVariable Integer id) throws Exception {
        lineaInputDTO.setId_lineas(id);
        return serviceFactura.loadLine(lineaInputDTO);
    }





}
