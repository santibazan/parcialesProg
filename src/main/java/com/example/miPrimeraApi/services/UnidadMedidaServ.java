package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.UnidadMedida;
import com.example.miPrimeraApi.repositories.UnidadMedidaRep;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaServ extends BaseServ<UnidadMedida, Long>{
    public UnidadMedidaServ(UnidadMedidaRep unidadMedidaRep){
        super(unidadMedidaRep);
    }
}
