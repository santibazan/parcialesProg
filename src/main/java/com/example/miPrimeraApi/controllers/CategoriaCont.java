package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.services.CategoriaServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categorias")
public class CategoriaCont extends BaseCont<Categoria,Long>{

    @Autowired
    private CategoriaServ categoriaServ;

    public CategoriaCont(CategoriaServ categoriaServ) {
        super(categoriaServ);
    }

    @PostMapping("/{id}/subcategorias")
    public Categoria agregarSubcategoria(@PathVariable Long id, @RequestBody Categoria subcategoria) throws Exception{
        return categoriaServ.agregarSubcategoria(id, subcategoria);
    }
}