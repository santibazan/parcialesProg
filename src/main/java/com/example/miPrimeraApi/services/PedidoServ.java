package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.repositories.PedidoRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServ extends BaseServ<Pedido, Long>{

    @Autowired
    private PedidoRep pedidoRep;

    @Autowired
    private DetallePedidoServ detallePedidoServ;

    public PedidoServ(PedidoRep pedidoRep) {
        super(pedidoRep);
    }

    @Transactional
    public List<Pedido> listarPorDomicilio(Long idDomicilio) throws Exception{
        try{
            return pedidoRep.findAllByDomicilio_Id(idDomicilio);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPorSucursal(Long idSucursal) throws Exception{
        try{
            return pedidoRep.findAllBySucursal_Id(idSucursal);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPorEmpleado(Long idEmpleado) throws Exception{
        try{
            return pedidoRep.findAllByEmpleado_Id(idEmpleado);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Pedido> listarPorCliente(Long idCliente) throws Exception{
        try{
            return pedidoRep.findAllByCliente_Id(idCliente);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Pedido calcularTotalPedido(Pedido pedido) throws Exception{
        try{
            List<DetallePedido> detallesPedidos = detallePedidoServ.listarPorPedido(pedido.getId());
            Double total = 0.0;
            if (detallesPedidos != null && !detallesPedidos.isEmpty()){

                for (int i = 0; i < detallesPedidos.toArray().length; i++){
                    total += detallesPedidos.get(i).getSubTotal();
                }

            }

            pedido.setTotal(total);
            return pedidoRep.save(pedido);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception {
        try{
            calcularTotalPedido(pedido);
            return pedidoRep.save(pedido);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}