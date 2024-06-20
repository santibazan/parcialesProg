package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Usuario;
import com.example.miPrimeraApi.repositories.UsuarioRep;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServ extends BaseServ<Usuario, Long> {
    public UsuarioServ(UsuarioRep usuarioRep){
        super(usuarioRep);
    }
}
