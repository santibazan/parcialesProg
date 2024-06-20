package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Domicilio;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRep extends BaseRep<Domicilio, Long>{
    List<Domicilio> findAllByLocalidad_Id(Long idLocalidad);
}
