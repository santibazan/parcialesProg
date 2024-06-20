package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Pais;
import com.example.miPrimeraApi.services.PaisServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisCont extends BaseCont<Pais,Long>{

    public PaisCont(PaisServ paisServ) {
        super(paisServ);
    }
}