package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.services.ClienteServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clientes")
public class ClienteCont extends BaseCont<Cliente, Long>{

    public ClienteCont(ClienteServ clienteServ){
        super(clienteServ);
    }
}
