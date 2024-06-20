package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Factura;
import com.example.miPrimeraApi.services.FacturaServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaCont extends BaseCont<Factura,Long>{

    public FacturaCont(FacturaServ facturaServ) {
        super(facturaServ);
    }
}
