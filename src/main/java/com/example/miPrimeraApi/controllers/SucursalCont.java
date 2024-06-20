package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.services.SucursalServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalCont extends BaseCont<Sucursal,Long>{

    @Autowired
    private SucursalServ sucursalServ;

    public SucursalCont(SucursalServ sucursalServ) {
        super(sucursalServ);
    }

    @GetMapping("/empresa/{id}")
    public ResponseEntity<List<Sucursal>> listarPorEmpresa(@PathVariable Long idEmpresa) throws Exception{
        List<Sucursal> sucursales = sucursalServ.listarPorEmpresa(idEmpresa);
        return ResponseEntity.ok(sucursales);
    }
}