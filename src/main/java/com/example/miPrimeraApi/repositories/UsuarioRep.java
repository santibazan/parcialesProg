package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRep extends BaseRep<Usuario, Long> {
}
