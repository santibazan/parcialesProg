package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Base;
import com.example.miPrimeraApi.repositories.BaseRep;
import jakarta.transaction.Transactional;


import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class BaseServ <E extends Base, ID extends Serializable> {
    protected BaseRep<E, ID> baseRep;


    public BaseServ(BaseRep<E, ID> baseRep){
        this.baseRep = baseRep;

    }

    @Transactional
    public List<E> listar() throws Exception{
        try{
            return baseRep.findAll();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public Optional<E> buscarPorId(ID id) throws Exception{
        try{
            return Optional.ofNullable(baseRep.findById(id).orElse(null));
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public E crear(E entity) throws Exception{
        try{
            return baseRep.save(entity);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public E actualizar(E entity) throws Exception{
        try{
            return baseRep.save(entity);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public void eliminar(ID id) throws Exception{
        try{
            baseRep.deleteById(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
