package com.washiner.livraria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.washiner.livraria.model.LivroModel;
import com.washiner.livraria.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<LivroModel> getListAll(){
        return livroService.listarLivros();
    }

    @GetMapping("{id}")
    public Optional<LivroModel> getListById(@PathVariable Long id){
        return livroService.listarPorId(id);
    }

    @PostMapping
    public LivroModel salvarLivro(@RequestBody LivroModel novoLivro){
        return livroService.salvarLivro(novoLivro);
    }

    @PutMapping("{id}")
    public LivroModel updateLivro(@PathVariable Long id, @RequestBody LivroModel livroAtual){
        livroAtual.setId(id);
        return livroService.salvarLivro(livroAtual);
    }

    @DeleteMapping("{id}")
    public void deleteLivro(@PathVariable Long id){
       livroService.deletarLivro(id);
    }
    
}
