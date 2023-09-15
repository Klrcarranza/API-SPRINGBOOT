package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.Categoria;

public interface CategoriaRepository extends CrudRepository <Categoria, Long>{
    
}
