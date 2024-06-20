package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.services.BaseServ;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseCont <E extends Base, ID extends Serializable> {

    protected BaseServ<E, ID> baseServ;

    public BaseCont(BaseServ<E, ID> baseServ){
        this.baseServ = baseServ;
    }

    @GetMapping
    public ResponseEntity<List<E>> listar() throws Exception{
        List<E> entities = baseServ.listar();
        return ResponseEntity.ok(entities);
    }

    @GetMapping("/{id}")
    public Optional<E> buscarPorId(@PathVariable ID id) throws Exception{
        return baseServ.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<E> crear(@RequestBody E entity) throws Exception{
        E entidadCreada = baseServ.crear(entity);
        return ResponseEntity.ok(entidadCreada);
    }

    @PutMapping
    public ResponseEntity<E> actualizar(@RequestBody E entity) throws Exception{
        E entidadAct = baseServ.actualizar(entity);
        return ResponseEntity.ok(entidadAct);
    }

    @DeleteMapping
    public void eliminar(@PathVariable ID id) throws Exception{
        baseServ.eliminar(id);
    }
}
