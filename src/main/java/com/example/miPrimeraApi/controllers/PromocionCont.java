package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Promocion;
import com.example.miPrimeraApi.services.PromocionServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promociones")
public class PromocionCont extends BaseCont<Promocion,Long>{

    public PromocionCont(PromocionServ promocionServ) {
        super(promocionServ);
    }
}