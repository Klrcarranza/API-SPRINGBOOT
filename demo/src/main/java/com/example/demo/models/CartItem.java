package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cartitem")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Getter
    @Setter
    private Long id_cart_item;

    @Getter
    @Setter
    private Long id_cart;

    @Getter
    @Setter
    private Long id_product;

    @Getter
    @Setter
    private int quantity;
}
