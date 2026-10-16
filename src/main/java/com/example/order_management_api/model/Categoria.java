package com.example.order_management_api.model;

public class Categoria {
    private Integer id_categoria;
    private String nome;

    public Categoria() {

    }

    public Categoria(Integer id_categoria, String nome) {
        this.id_categoria = id_categoria;
        this.nome = nome;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id_categoria=" + id_categoria +
                ", nome='" + nome + '\'' +
                '}';
    }
}
