package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.repositories.EmpleadoRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServ extends BaseServ<Empleado,Long> {

    @Autowired
    private EmpleadoRep empleadoRep;

    public EmpleadoServ(EmpleadoRep empleadoRep) {
        super(empleadoRep);
    }

    @Transactional
    public List<Empleado> listarPorSucursal(Long idSucursal) throws Exception{
        try{
            return empleadoRep.findAllBySucursal_Id(idSucursal);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
