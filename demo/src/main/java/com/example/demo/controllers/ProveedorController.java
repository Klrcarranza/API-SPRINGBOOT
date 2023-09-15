package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Proveedor;
import com.example.demo.services.ProveedorServices;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    ProveedorServices proveedorServices;

    @GetMapping()
    ArrayList<Proveedor> findAll(){
        return this.proveedorServices.findAll();
    }

    
}
