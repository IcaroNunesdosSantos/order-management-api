package com.example.order_management_api.service;

import com.example.order_management_api.model.Produto;
import com.example.order_management_api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto cadastrar(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() { return produtoRepository.findAll(); }
}
