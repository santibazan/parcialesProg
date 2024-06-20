package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.ArticuloManufacturadoDetalle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoDetalleRep extends BaseRep<ArticuloManufacturadoDetalle, Long> {
    List<ArticuloManufacturadoDetalle> findAllByArticuloManufacturado_Id(Long idarticuloManufacturado);

    List<ArticuloManufacturadoDetalle> findAllByArticuloInsumo_Id(Long idArticuloInsumo);
}
