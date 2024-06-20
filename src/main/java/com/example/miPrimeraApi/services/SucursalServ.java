package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.repositories.SucursalRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServ extends BaseServ<Sucursal, Long>{
    @Autowired
    private SucursalRep sucursalRep;

    public SucursalServ(SucursalRep sucursalRep) {
        super(sucursalRep);
    }

    @Transactional
    public List<Sucursal> listarPorEmpresa(Long idEmpresa) throws Exception{
        try{
            return sucursalRep.findAllByEmpresa_Id(idEmpresa);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
