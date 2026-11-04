package com.example.order_management_api.controller;

import com.example.order_management_api.model.Categoria;
import com.example.order_management_api.model.Produto;
import com.example.order_management_api.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria cadastrar(@RequestBody Categoria categoria){
        return categoriaService.cadastrarCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> listar(){
        return categoriaService.buscarCategorias();
    }

    @DeleteMapping("/{id}")
    public void deletarCategoria(@PathVariable Long id){
        categoriaService.deletar(id);
    }
}
