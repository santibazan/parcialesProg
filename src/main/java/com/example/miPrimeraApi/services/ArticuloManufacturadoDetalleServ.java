package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.repositories.ArticuloManufacturadoDetalleRep;
import com.example.miPrimeraApi.repositories.BaseRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoDetalleServ extends BaseServ<ArticuloManufacturadoDetalle, Long>{

    @Autowired
    private ArticuloManufacturadoDetalleRep articuloManufacturadoDetalleRep;

    public ArticuloManufacturadoDetalleServ(ArticuloManufacturadoDetalleRep articuloManufacturadoDetalleRep) {
        super(articuloManufacturadoDetalleRep);
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> listarPorArticuloManufacturado(Long idArticuloManufacturado) throws Exception{
        try{
            return articuloManufacturadoDetalleRep.findAllByArticuloManufacturado_Id(idArticuloManufacturado);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> listarPorArticuloInsumo(Long idArticuloInsumo) throws Exception{
        try{
            return articuloManufacturadoDetalleRep.findAllByArticuloInsumo_Id(idArticuloInsumo);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
