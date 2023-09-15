package com.example.demo.repositories;

import com.example.demo.models.Productos;
import org.springframework.data.repository.CrudRepository;

public interface ProductosRepository extends CrudRepository <Productos, Long> {
    
}
