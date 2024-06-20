package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.services.PedidoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoCont extends BaseCont<Pedido,Long> {

    @Autowired
    private PedidoServ pedidoService;
    @Autowired
    private PedidoServ pedidoServ;

    public PedidoCont(PedidoServ pedidoServ) {
        super(pedidoServ);
    }

    @GetMapping("/domicilio/{id}")
    public ResponseEntity<List<Pedido>> listarPorDomicilio(@PathVariable Long idDomicilio) throws Exception{
        List<Pedido> pedidos = pedidoServ.listarPorDomicilio(idDomicilio);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Pedido>> listarPorSucursal(@PathVariable Long idSucursal) throws Exception{
        List<Pedido> pedidos = pedidoServ.listarPorSucursal(idSucursal);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/empleado/{id}")
    public ResponseEntity<List<Pedido>> listarPorEmpleado(@PathVariable Long idEmpleado) throws Exception{
        List<Pedido> pedidos = pedidoServ.listarPorEmpleado(idEmpleado);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<Pedido>> listarPorCliente(@PathVariable Long idCliente) throws Exception{
        List<Pedido> pedidos = pedidoServ.listarPorCliente(idCliente);
        return ResponseEntity.ok(pedidos);
    }

    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido) throws Exception{
        Pedido pedido_aux = pedidoServ.calcularTotalPedido(pedido);
        return Optional.ofNullable(pedido_aux);
    }
}