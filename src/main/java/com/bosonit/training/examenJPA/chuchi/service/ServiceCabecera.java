package com.bosonit.training.examenJPA.chuchi.service;

import com.bosonit.training.examenJPA.chuchi.dtos.iNputDtos.LineasINputDtos;
import com.bosonit.training.examenJPA.chuchi.entity.CabeceraFra;

import java.util.List;

public interface ServiceCabecera {

    public String delete(Integer id) throws Exception; //ok

    public List<CabeceraFra> viewall();

    public CabeceraFra loadLine(LineasINputDtos lineasINputDtos )throws Exception; //ok


}
