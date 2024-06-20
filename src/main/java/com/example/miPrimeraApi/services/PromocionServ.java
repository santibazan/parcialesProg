package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Promocion;
import com.example.miPrimeraApi.repositories.PromocionRep;
import org.springframework.stereotype.Service;

@Service
public class PromocionServ extends BaseServ<Promocion, Long>{
    public PromocionServ(PromocionRep promocionRep){
        super(promocionRep);
    }
}
