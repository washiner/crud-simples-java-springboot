package com.washiner.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.washiner.livraria.model.LivroModel;

public interface Livrorepository extends JpaRepository<LivroModel, Long>{
    
}
