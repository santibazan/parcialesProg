package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.services.ArticuloManufacturadoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulos_manufacturados")
public class ArticuloManufacturadoCont extends BaseCont<ArticuloManufacturado,Long>{

    @Autowired
    private ArticuloManufacturadoServ articuloManufacturadoServ;

    public ArticuloManufacturadoCont(ArticuloManufacturadoServ articuloManufacturadoServ) {
        super(articuloManufacturadoServ);
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloManufacturado>> listarPorCategoria(@PathVariable Long idCategoria) throws Exception{
        List<ArticuloManufacturado> articulosManufacturados = articuloManufacturadoServ.listarPorCategoria(idCategoria);
        return ResponseEntity.ok(articulosManufacturados);
    }

    @GetMapping("/unidad_medida/{id}")
    public ResponseEntity<List<ArticuloManufacturado>> listarPorUnidadMedida(@PathVariable Long idUnidadMedida) throws Exception{
        List<ArticuloManufacturado> articulosManufacturados = articuloManufacturadoServ.listarPorUnidadMedida(idUnidadMedida);
        return ResponseEntity.ok(articulosManufacturados);
    }
}