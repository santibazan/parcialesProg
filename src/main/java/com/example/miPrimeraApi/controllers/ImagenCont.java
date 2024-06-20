package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.services.ImagenServ;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagenes")
public class ImagenCont extends BaseCont<Imagen,Long> {

    public ImagenCont(ImagenServ imagenServ) {
        super(imagenServ);
    }
}