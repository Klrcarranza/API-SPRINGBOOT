package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Productos;
import com.example.demo.repositories.ProductosRepository;

@Service
public class ProductosServices {
    @Autowired
    ProductosRepository productosrepository;

    public ArrayList<Productos> findAll(){
        return (ArrayList<Productos>) productosrepository.findAll();
    }
}
