package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.services.EmpleadoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoCont extends BaseCont<Empleado, Long>{

    @Autowired
    private EmpleadoServ empleadoServ;

    public EmpleadoCont(EmpleadoServ empleadoServ) {
        super(empleadoServ);
    }

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Empleado>> listarPorSucursal(@PathVariable Long idSucursal) throws Exception{
        List<Empleado> empleados = empleadoServ.listarPorSucursal(idSucursal);
        return ResponseEntity.ok(empleados);
    }
}