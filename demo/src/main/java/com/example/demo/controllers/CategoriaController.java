package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Categoria;
import com.example.demo.services.CategoriaServices;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    CategoriaServices categoriaServices;

    @GetMapping()
    ArrayList<Categoria> findAll(){
        return this.categoriaServices.findAll();

    }
}
