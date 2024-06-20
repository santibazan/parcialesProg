package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.services.DetallePedidoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detalles_pedidos")
public class DetallePedidoCont extends BaseCont<DetallePedido, Long>{

    @Autowired
    private DetallePedidoServ detallePedidoServ;

    public DetallePedidoCont(DetallePedidoServ detallePedidoServ) {
        super(detallePedidoServ);
    }

    @GetMapping("/pedido/{id}")
    public ResponseEntity<List<DetallePedido>> listarPorPedido(@PathVariable Long idPedido) throws Exception{
        List<DetallePedido> detallesPedidos = detallePedidoServ.listarPorPedido(idPedido);
        return ResponseEntity.ok(detallesPedidos);
    }

    @GetMapping("/articulo/{id}")
    public ResponseEntity<List<DetallePedido>> listarPorArticulo(@PathVariable Long idArticulo) throws Exception{
        List<DetallePedido> detallesPedidos = detallePedidoServ.listarPorArticulo(idArticulo);
        return ResponseEntity.ok(detallesPedidos);
    }
}