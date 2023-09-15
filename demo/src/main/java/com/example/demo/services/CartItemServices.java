package com.example.demo.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.CartItem;
import com.example.demo.repositories.CartItemRepository;

@Service
public class CartItemServices {
    @Autowired
    CartItemRepository cartItemRepository;

    public ArrayList<CartItem> findAll() {
        return (ArrayList<CartItem>) cartItemRepository.findAll();
    }
}
