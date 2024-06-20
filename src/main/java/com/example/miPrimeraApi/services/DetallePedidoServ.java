package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.repositories.DetallePedidoRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoServ extends BaseServ<DetallePedido,Long>{

    @Autowired
    private DetallePedidoRep detallePedidoRep;

    public DetallePedidoServ(DetallePedidoRep detallePedidoRep) {
        super(detallePedidoRep);
    }

    @Transactional
    public List<DetallePedido> listarPorPedido(Long idPedido) throws Exception{
        try{
            return detallePedidoRep.findAllByPedido_Id(idPedido);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<DetallePedido> listarPorArticulo(Long idArticulo) throws Exception{
        try{
            return detallePedidoRep.findAllByArticulo_Id(idArticulo);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}