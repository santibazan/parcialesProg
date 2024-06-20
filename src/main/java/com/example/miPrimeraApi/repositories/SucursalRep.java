package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Sucursal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRep extends BaseRep<Sucursal, Long>{

    List<Sucursal> findAllByEmpresa_Id(Long idEmpresa);

}
