package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Localidad;
import com.example.miPrimeraApi.services.LocalidadServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localidades")
public class LocalidadCont extends BaseCont<Localidad, Long>{

    @Autowired
    private LocalidadServ localidadServ;

    public LocalidadCont(LocalidadServ localidadServ) {
        super(localidadServ);
    }

    @GetMapping("/provincia/{id}")
    public ResponseEntity<List<Localidad>> listarPorProvincia(@PathVariable Long idProvincia) throws Exception{
        List<Localidad> localidades = localidadServ.listarPorProvincia(idProvincia);
        return ResponseEntity.ok(localidades);
    }
}