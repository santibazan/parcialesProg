package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.UnidadMedida;
import com.example.miPrimeraApi.services.UnidadMedidaServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidades_medidas")
public class UnidadMedidaCont extends BaseCont<UnidadMedida,Long>{

    public UnidadMedidaCont(UnidadMedidaServ unidadMedidaServ) {
        super(unidadMedidaServ);
    }
}
