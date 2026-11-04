package com.example.order_management_api.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "item_pedido")
public class Item_Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item_pedido;
    private Long fk_produto;
    private Long fk_pedido;
    private Integer quantidade;

    public Item_Pedido(){}

    public Item_Pedido(Long fk_produto, Long fk_pedido, Integer quantidade) {
        this.fk_produto = fk_produto;
        this.fk_pedido = fk_pedido;
        this.quantidade = quantidade;
    }

    public Long getFk_produto() {
        return fk_produto;
    }

    public void setFk_produto(Long fk_produto) {
        this.fk_produto = fk_produto;
    }

    public Long getFk_pedido() {
        return fk_pedido;
    }

    public void setFk_pedido(Long fk_pedido) {
        this.fk_pedido = fk_pedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item_Pedido{" +
                "quantidade=" + quantidade +
                ", fk_pedido=" + fk_pedido +
                ", fk_produto=" + fk_produto +
                '}';
    }
}
