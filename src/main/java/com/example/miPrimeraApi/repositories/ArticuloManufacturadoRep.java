package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoRep extends BaseRep<ArticuloManufacturado, Long>{
    List<ArticuloManufacturado> findAllByCategoria_Id(Long idCategoria);
    List<ArticuloManufacturado> findAllByUnidadMedida_Id(Long idUnidadMedida);
}
