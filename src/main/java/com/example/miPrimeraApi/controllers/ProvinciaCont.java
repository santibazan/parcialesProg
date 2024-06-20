package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Provincia;
import com.example.miPrimeraApi.services.ProvinciaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaCont extends BaseCont<Provincia,Long>{

    @Autowired
    private ProvinciaServ provinciaServ;

    public ProvinciaCont(ProvinciaServ provinciaServ) {
        super(provinciaServ);
    }

    @GetMapping("/pais/{id}")
    public ResponseEntity<List<Provincia>> listarPorPais(@PathVariable Long idPais) throws Exception{
        List<Provincia> provincias = provinciaServ.listarPorPais(idPais);
        return ResponseEntity.ok(provincias);
    }
}