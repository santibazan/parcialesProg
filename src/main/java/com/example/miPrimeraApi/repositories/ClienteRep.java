package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRep extends BaseRep<Cliente, Long> {
}
