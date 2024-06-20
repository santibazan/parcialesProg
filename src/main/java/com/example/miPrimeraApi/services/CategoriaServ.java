package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.repositories.CategoriaRep;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServ extends BaseServ<Categoria,Long>{

    @Autowired
    private CategoriaRep categoriaRep;

    public CategoriaServ( CategoriaRep categoriaRep) {
        super(categoriaRep);
    }

    @Transactional
    public Categoria agregarSubcategoria(Long idCategoriaPadre, Categoria nuevaSubcategoria) throws Exception{
        try{
            Categoria categoriaPadre = categoriaRep.findById(idCategoriaPadre).orElse(null);

            if(categoriaPadre != null){
                nuevaSubcategoria.setCategoriaPadre(categoriaPadre);

                categoriaRep.save(nuevaSubcategoria);

                return nuevaSubcategoria;
            }else{
                return null;
            }
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Transactional
    public List<Categoria> listarPorCategoriaPadre(Long idCategoriaPadre) throws Exception{
        try{
            return categoriaRep.findAllByCategoriaPadre_Id(idCategoriaPadre);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}