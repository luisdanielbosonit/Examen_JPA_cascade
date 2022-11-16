package com.bosonit.training.examenJPA.chuchi.service;

import com.bosonit.training.examenJPA.chuchi.dtos.iNputDtos.LineasINputDtos;
import com.bosonit.training.examenJPA.chuchi.entity.CabeceraFra;
import com.bosonit.training.examenJPA.chuchi.entity.LineasFra;
import com.bosonit.training.examenJPA.chuchi.exceptions.EntityNotFoundException;
import com.bosonit.training.examenJPA.chuchi.repository.RepositoryCabeceraFra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImplCabecera implements ServiceCabecera{

    @Autowired
    RepositoryCabeceraFra repositoryCabeceraFra;




    @Override
    public String delete(Integer id) throws Exception {
            CabeceraFra cabeceraFra= repositoryCabeceraFra.findById(id).orElseThrow(()-> {throw new EntityNotFoundException("The person with Id: "+id+" does not exist in the database", HttpStatus.FOUND,new Date());});

        repositoryCabeceraFra.delete(cabeceraFra);
            return "Borrado";
    }
    @Override
    public List<CabeceraFra> viewall() {
        return Streamable.of(repositoryCabeceraFra.findAll()).toList();
    }
    @Override
    public CabeceraFra loadLine(LineasINputDtos lineasINputDtos) throws RuntimeException {

        Optional<CabeceraFra> factura = repositoryCabeceraFra.findById(lineasINputDtos.getId_lineas());
        if(factura.isEmpty()){
            {throw new EntityNotFoundException("The invoice with Id:  does not exist in the database", HttpStatus.FOUND,new Date());}
        }
        List<LineasFra> listaLineas = factura.get().getLineasFra();
        LineasFra linea = new LineasFra(lineasINputDtos.getProNombre(),
                                        lineasINputDtos.getCantidad(),
                                        lineasINputDtos.getPrecio());
        listaLineas.add(linea);
        factura.get().setLineasFra(listaLineas);
        return repositoryCabeceraFra.save(factura.get());
    }

    }

