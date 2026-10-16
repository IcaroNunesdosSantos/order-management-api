package com.example.order_management_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_produto;
    private String nome;
    private Double preco_uni;
    private Integer qtdVendida;
    private Integer fk_categoria;

    public Produto(){}

    public Produto(String nome, Double preco_uni, Integer qtdVendida, Integer fk_categoria) {
        this.nome = nome;
        this.preco_uni = preco_uni;
        this.qtdVendida = qtdVendida;
        this.fk_categoria = fk_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco_uni() {
        return preco_uni;
    }

    public void setPreco_uni(Double preco_uni) {
        this.preco_uni = preco_uni;
    }

    public Integer getQtdVendida() {
        return qtdVendida;
    }

    public void setQtdVendida(Integer qtdVendida) {
        this.qtdVendida = qtdVendida;
    }

    public Integer getFk_categoria() {
        return fk_categoria;
    }

    public void setFk_categoria(Integer fk_categoria) {
        this.fk_categoria = fk_categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id_produto=" + id_produto +
                ", nome='" + nome + '\'' +
                ", preco_uni=" + preco_uni +
                ", qtdVendida=" + qtdVendida +
                ", fk_categoria=" + fk_categoria +
                '}';
    }
}
