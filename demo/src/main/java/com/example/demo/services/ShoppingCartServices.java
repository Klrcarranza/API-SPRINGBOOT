package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.ShoppingCart;
import com.example.demo.repositories.ShoppingCartRepository;

@Service
public class ShoppingCartServices {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public ArrayList<ShoppingCart> findAll() {
        return  (ArrayList<ShoppingCart>) shoppingCartRepository.findAll();
    } 
}
