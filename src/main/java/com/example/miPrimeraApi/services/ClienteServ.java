package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.repositories.ClienteRep;
import org.springframework.stereotype.Service;

@Service
public class ClienteServ extends BaseServ<Cliente, Long>{

    private ClienteServ(ClienteRep clienteRep){
        super(clienteRep);
    }

}
