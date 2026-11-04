package com.example.order_management_api.service;

import com.example.order_management_api.model.Categoria;
import com.example.order_management_api.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> buscarCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria cadastrarCategoria(String categoria){
        List<Categoria> categorias = buscarCategorias();
        Categoria cate = null;
        Boolean exists = false;


        for (Categoria cat : categorias) {
            if(categoria.equals(cat.getNome())){
                cate = cat;
                exists = true;
                break;
            }
        }

        if(exists){
            return cate;
        }else{
            Categoria c1 = new Categoria(categoria);
            return categoriaRepository.save(c1);
        }

    }


}
