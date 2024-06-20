package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.services.DomicilioServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioCont extends BaseCont<Domicilio,Long>{

    @Autowired
    private DomicilioServ domicilioServ;

    public DomicilioCont(DomicilioServ domicilioServ) {
        super(domicilioServ);
    }

    @GetMapping("/localidad/{id}")
    public ResponseEntity<List<Domicilio>> listarPorLocalidad(@PathVariable Long idLocalidad) throws Exception{
        List<Domicilio> domicilios = domicilioServ.listarPorLocalidad(idLocalidad);
        return ResponseEntity.ok(domicilios);
    }
}