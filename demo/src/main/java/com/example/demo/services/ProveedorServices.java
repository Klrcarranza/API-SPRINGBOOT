package com.example.demo.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Proveedor;
import com.example.demo.repositories.ProveedorRepository;

@Service
public class ProveedorServices {
    @Autowired
    ProveedorRepository proveedorRepository;

    public ArrayList<Proveedor> findAll() {
        return (ArrayList<Proveedor>) proveedorRepository.findAll();
    }  
}
