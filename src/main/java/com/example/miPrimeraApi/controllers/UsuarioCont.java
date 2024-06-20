package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Usuario;
import com.example.miPrimeraApi.services.UsuarioServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioCont extends BaseCont<Usuario,Long> {

    public UsuarioCont(UsuarioServ usuarioServ) {
        super(usuarioServ);
    }
}