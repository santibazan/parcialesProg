package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Pais;
import com.example.miPrimeraApi.repositories.PaisRep;
import org.springframework.stereotype.Service;

@Service
public class PaisServ extends BaseServ<Pais, Long> {
    public PaisServ(PaisRep paisRep){
        super(paisRep);
    }
}
