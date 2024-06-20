package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRep extends BaseRep<ArticuloInsumo, Long>{
    List<ArticuloInsumo> findAllByCategoria_Id(Long idCategoria);

    List<ArticuloInsumo> findAllByUnidadMedida_Id(Long idUnidadMedida);
}
