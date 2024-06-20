package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.DetallePedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRep extends BaseRep<DetallePedido, Long>{
    List<DetallePedido> findAllByPedido_Id(Long idPedido);

    List<DetallePedido> findAllByArticulo_Id(Long articulo);
}
