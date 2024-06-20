package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.PromocionDetalle;
import com.example.miPrimeraApi.services.PromocionDetalleServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detalles_promociones")
public class PromocionDetalleCont extends BaseCont<PromocionDetalle,Long>{

    @Autowired
    private PromocionDetalleServ promocionDetalleServ;

    public PromocionDetalleCont(PromocionDetalleServ promocionDetalleServ) {
        super(promocionDetalleServ);
    }

    @GetMapping("/promocion/{id}")
    public ResponseEntity<List<PromocionDetalle>> listarPorPromocion(@PathVariable Long idPromocion) throws Exception{
        List<PromocionDetalle> promocionDetalles = promocionDetalleServ.listarPorPromocion(idPromocion);
        return ResponseEntity.ok(promocionDetalles);
    }

    @GetMapping("/articulo/{id}")
    public ResponseEntity<List<PromocionDetalle>> listarPorArticulo(@PathVariable Long idArticulo) throws Exception{
        List<PromocionDetalle> promocionDetalles = promocionDetalleServ.listarPorArticulo(idArticulo);
        return ResponseEntity.ok(promocionDetalles);
    }
}