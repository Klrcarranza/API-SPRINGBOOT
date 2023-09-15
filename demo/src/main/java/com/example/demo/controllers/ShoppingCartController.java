package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.ShoppingCart;
import com.example.demo.services.ShoppingCartServices;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {
    @Autowired
    ShoppingCartServices shoppingCartServices;

    @GetMapping()
    ArrayList<ShoppingCart> findAll(){
        return this.shoppingCartServices.findAll();

    }
    
}
