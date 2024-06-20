package com.example.miPrimeraApi.services;


import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.repositories.ArticuloManufacturadoRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoServ extends BaseServ<ArticuloManufacturado,Long>{

    @Autowired
    private ArticuloManufacturadoRep articuloManufacturadoRep;

    public ArticuloManufacturadoServ(ArticuloManufacturadoRep articuloManufacturadoRep) {
        super(articuloManufacturadoRep);
    }

    @Transactional
    public List<ArticuloManufacturado> listarPorCategoria(Long idCategoria) throws Exception{
        try{
            return articuloManufacturadoRep.findAllByCategoria_Id(idCategoria);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturado> listarPorUnidadMedida(Long idUnidadMedida) throws Exception{
        try{
            return articuloManufacturadoRep.findAllByUnidadMedida_Id(idUnidadMedida);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}