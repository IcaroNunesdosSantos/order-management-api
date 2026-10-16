package com.example.order_management_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pedido;
    private String Cliente;
    private String statuss;
    private LocalDate dt_pedido;
    private Double valor_total;

    public Pedido() {}

    public Pedido(String cliente, String statuss, LocalDate dt_pedido, Double valor_total) {
        Cliente = cliente;
        this.statuss = statuss;
        this.dt_pedido = dt_pedido;
        this.valor_total = valor_total;
    }
}
