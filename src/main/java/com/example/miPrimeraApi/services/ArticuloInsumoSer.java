package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.repositories.ArticuloInsumoRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoSer extends BaseServ<ArticuloInsumo, Long> {

    @Autowired
    private ArticuloInsumoRep articuloInsumoRep;

    public ArticuloInsumoSer(ArticuloInsumoRep articuloInsumoRep) {
        super(articuloInsumoRep);
    }

    @Transactional
    public List<ArticuloInsumo> listarPorCategoria(Long idCategoria) throws Exception{
        try{
            return articuloInsumoRep.findAllByCategoria_Id(idCategoria);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloInsumo> listarPorUnidadMedida(Long idUnidadMedida) throws Exception{
        try{
            return articuloInsumoRep.findAllByUnidadMedida_Id(idUnidadMedida);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
