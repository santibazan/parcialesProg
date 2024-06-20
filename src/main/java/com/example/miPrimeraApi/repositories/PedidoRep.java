package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Pedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRep extends BaseRep<Pedido, Long> {

    List<Pedido> findAllByDomicilio_Id(Long idDomicilio);

    List<Pedido> findAllByEmpleado_Id(Long idEmpleado);

    List<Pedido> findAllBySucursal_Id(Long idSucursal);

    List<Pedido> findAllByCliente_Id(Long idCliente);

}
