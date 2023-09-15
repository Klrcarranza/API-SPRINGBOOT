package com.example.demo.repositories;

import com.example.demo.models.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface ProveedorRepository extends CrudRepository <Proveedor, Long> {
    
}
