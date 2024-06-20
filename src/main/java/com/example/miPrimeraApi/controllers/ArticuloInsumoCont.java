package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.services.ArticuloInsumoSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulos_insumos")
public class ArticuloInsumoCont extends BaseCont<ArticuloInsumo,Long> {

    @Autowired
    private ArticuloInsumoSer articuloInsumoSer;

    public ArticuloInsumoCont(ArticuloInsumoSer articuloInsumoSer) {
        super(articuloInsumoSer);
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<List<ArticuloInsumo>> listarPorCategoria(@PathVariable Long idCategoria) throws Exception {
        List<ArticuloInsumo> articulosInsumos = articuloInsumoSer.listarPorCategoria(idCategoria);
        return ResponseEntity.ok(articulosInsumos);
    }

    @GetMapping("/unidad_medida/{id}")
    public ResponseEntity<List<ArticuloInsumo>> listarPorUnidadMedida(@PathVariable Long idUnidadMedida) throws Exception {
        List<ArticuloInsumo> articulosInsumos = articuloInsumoSer.listarPorUnidadMedida(idUnidadMedida);
        return ResponseEntity.ok(articulosInsumos);
    }
}