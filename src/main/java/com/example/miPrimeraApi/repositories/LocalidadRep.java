package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRep extends BaseRep<Localidad, Long>{

    List<Localidad> findAllByProvincia_Id(Long idProvincia);

}
