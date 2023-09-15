package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.CartItem;
import com.example.demo.services.CartItemServices;

@RestController
@RequestMapping("/cartitem")
public class CartItemController {
    @Autowired
    CartItemServices cartItemServices;

    @GetMapping()
    ArrayList<CartItem> findAll(){
        return this.cartItemServices.findAll();
    }
}
