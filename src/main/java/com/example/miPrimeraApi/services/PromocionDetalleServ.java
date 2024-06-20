package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.PromocionDetalle;
import com.example.miPrimeraApi.repositories.PromocionDetalleRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionDetalleServ extends BaseServ<PromocionDetalle,Long> {

    @Autowired
    private PromocionDetalleRep promocionDetalleRep;

    public PromocionDetalleServ(PromocionDetalleRep promocionDetalleRep) {
        super(promocionDetalleRep);
    }

    @Transactional
    public List<PromocionDetalle> listarPorPromocion(Long idPromocion) throws Exception{
        try{
            return promocionDetalleRep.findAllByPromocion_Id(idPromocion);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<PromocionDetalle> listarPorArticulo(Long idArticulo) throws Exception{
        try{
            return promocionDetalleRep.findAllByArticulo_Id(idArticulo);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}