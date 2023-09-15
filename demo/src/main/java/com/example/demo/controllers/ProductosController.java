package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Productos;
import com.example.demo.services.ProductosServices;

@RestController
@RequestMapping("/productos")
public class ProductosController {
    @Autowired
    ProductosServices productosServices;

    @GetMapping()
    ArrayList<Productos> findAll(){
        return this.productosServices.findAll();
    }
}