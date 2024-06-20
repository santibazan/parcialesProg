package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Factura;
import com.example.miPrimeraApi.repositories.FacturaRep;
import org.springframework.stereotype.Service;

@Service
public class FacturaServ extends BaseServ<Factura, Long> {
    public FacturaServ(FacturaRep facturaRep){
        super(facturaRep);
    }
}
