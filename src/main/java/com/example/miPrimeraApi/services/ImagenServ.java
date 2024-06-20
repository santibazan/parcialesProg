package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.repositories.ImagenRep;
import org.springframework.stereotype.Service;

@Service
public class ImagenServ extends BaseServ<Imagen, Long> {
    public ImagenServ(ImagenRep imagenRep){
        super(imagenRep);
    }
}
