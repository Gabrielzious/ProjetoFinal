package com.matera.controller;

import com.matera.exceptions.FuncionarioNaoEncontradoException;
import com.matera.model.Funcionario;
import com.matera.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.*;

//link para o console: http://localhost:8080/h2-console
@RestController
public class Controller {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/funcionarios")
    public List<Funcionario> returnAquisition() {
        return funcionarioService.findAllFuncionarios();

    }

    @DeleteMapping("/funcionarios/{id}")
    public String deletaFuncionario(@PathVariable long id){
        return funcionarioService.deletaFunc(id);
    }

    /////////////////////////////////////////////

    @GetMapping("/funcionarios/{id}")
    public ResponseEntity<?> buscaPorParametro(@PathVariable(required = true) long id){
        try {
            return ResponseEntity.ok(funcionarioService.buscaPorParametro(id));
        }
        catch(FuncionarioNaoEncontradoException excecaoDeNaoEncontrado){
            return ResponseEntity.notFound().build();
        }
    }


    //////////////////////////////////////////////

//    @GetMapping("/funcionario/{id2}")
//    public ResponseEntity<?> buscaFuncionario(@PathVariable long id){
//        try {
//            return ResponseEntity.ok(funcionarioService.buscaFuncionario(id));
//        } catch (FuncionarioNaoEncontradoException excecaoDeIdNaoEncontrado) {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @GetMapping("")
    public String homePage() {
        return "Bem vindo a aplicação. O horário atual do servidor é:" + LocalDateTime.now();
    }


    @PostMapping("/funcionario")
    public String salvaFunc (@RequestBody @Valid Funcionario func) {
        return funcionarioService.salvaFunc(func);

    }

}




