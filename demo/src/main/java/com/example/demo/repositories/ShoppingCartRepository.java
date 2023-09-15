package com.example.demo.repositories;

import com.example.demo.models.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository <ShoppingCart, Long> {
    
}
