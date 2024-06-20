package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Provincia;
import com.example.miPrimeraApi.repositories.ProvinciaRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServ extends BaseServ<Provincia, Long> {
    @Autowired
    private ProvinciaRep provinciaRep;

    public ProvinciaServ(ProvinciaRep provinciaRep) {
        super(provinciaRep);
    }

    @Transactional
    public List<Provincia> listarPorPais(Long idPais) throws Exception{
        try{
            return provinciaRep.findAllByPais_Id(idPais);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
