package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.repositories.DomicilioRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServ extends BaseServ<Domicilio,Long>{

    @Autowired
    private DomicilioRep domicilioRep;

    public DomicilioServ(DomicilioRep domicilioRep) {
        super(domicilioRep);
    }

    @Transactional
    public List<Domicilio> listarPorLocalidad(Long idLocalidad) throws Exception{
        try{
            return domicilioRep.findAllByLocalidad_Id(idLocalidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}