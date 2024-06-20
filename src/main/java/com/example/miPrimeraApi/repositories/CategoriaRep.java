package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRep extends BaseRep<Categoria, Long> {
    List<Categoria> findAllByCategoriaPadre_Id(Long idCategoriaPadre);

}
