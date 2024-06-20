package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Provincia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRep extends BaseRep<Provincia, Long> {

    List<Provincia> findAllByPais_Id(Long idPais);

}
