package com.washiner.livraria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washiner.livraria.model.LivroModel;
import com.washiner.livraria.repository.Livrorepository;

@Service
public class LivroService {

    @Autowired
    private Livrorepository livrorepository;

    public List<LivroModel> listarLivros(){
        return livrorepository.findAll();
    }

    public Optional<LivroModel> listarPorId(Long id){
        return livrorepository.findById(id);
    }

    public LivroModel salvarLivro(LivroModel novoLivro){
        return livrorepository.save(novoLivro);
    }

    public void deletarLivro(Long id){
        livrorepository.deleteById(id);
    }
}
