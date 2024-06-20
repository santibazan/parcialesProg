package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.services.ArticuloManufacturadoDetalleServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulos_manufacturados_detalles")
public class ArticuloManufacturadoDetalleCont extends BaseCont<ArticuloManufacturadoDetalle, Long>{

    @Autowired
    private ArticuloManufacturadoDetalleServ articuloManufacturadoDetalleServ;

    public ArticuloManufacturadoDetalleCont(ArticuloManufacturadoDetalleServ articuloManufacturadoDetalleServ) {
        super(articuloManufacturadoDetalleServ);
    }

    @GetMapping("/articulo_manufacturado/{id}")
    public ResponseEntity<List<ArticuloManufacturadoDetalle>> listarPorArticuloManufacturado(@PathVariable Long idArticuloManufacturado) throws Exception{
        List<ArticuloManufacturadoDetalle> articulosManufacturadoDetalles = articuloManufacturadoDetalleServ.listarPorArticuloManufacturado(idArticuloManufacturado);
        return ResponseEntity.ok(articulosManufacturadoDetalles);
    }

    @GetMapping("/articulo_insumo/{id}")
    public ResponseEntity<List<ArticuloManufacturadoDetalle>> listarPorArticuloInsumo(@PathVariable Long idArticuloInsumo) throws Exception{
        List<ArticuloManufacturadoDetalle> articulosManufacturadoDetalles = articuloManufacturadoDetalleServ.listarPorArticuloInsumo(idArticuloInsumo);
        return ResponseEntity.ok(articulosManufacturadoDetalles);
    }
}