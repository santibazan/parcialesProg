package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Localidad;
import com.example.miPrimeraApi.repositories.LocalidadRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServ extends BaseServ<Localidad, Long>{

    @Autowired
    private LocalidadRep localidadRep;

    public LocalidadServ(LocalidadRep localidadRep){
        super(localidadRep);
    }

    @Transactional
    public List<Localidad> listarPorProvincia(Long idProvincia) throws Exception{
        try {
            return localidadRep.findAllByProvincia_Id(idProvincia);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
