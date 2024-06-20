package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Empresa;
import com.example.miPrimeraApi.services.EmpresaServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresas")
public class EmpresaCont extends BaseCont<Empresa,Long>{

    public EmpresaCont(EmpresaServ empresaServ) {
        super(empresaServ);
    }
}
