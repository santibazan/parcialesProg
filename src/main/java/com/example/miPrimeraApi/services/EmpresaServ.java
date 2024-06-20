package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Empresa;
import com.example.miPrimeraApi.repositories.EmpresaRep;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServ extends BaseServ<Empresa, Long> {
    public EmpresaServ(EmpresaRep empresaRep){
        super(empresaRep);
    }
}
