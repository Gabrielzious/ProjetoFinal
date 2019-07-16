package com.matera.service;

import com.matera.exceptions.FuncionarioNaoEncontradoException;
import com.matera.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {


    @Autowired
    private FuncionarioRepository repositorioDeFuncionarios;

    public List<Funcionario> findAllFuncionarios() {
        return (List<Funcionario>) repositorioDeFuncionarios.findAll();


    }
    public String salvaFunc (Funcionario func){
        repositorioDeFuncionarios.save(func);

        if (func != null) {
            return "Salvo o nome de usuario - " + func.getNome();
        } else {
            return "NÃO FOI SALVO, usuário -  " + func.getNome();
        }


    }

    public String deletaFunc(long id){
        repositorioDeFuncionarios.deleteById(id);
        return "funcionario deletado com sucesso";
    }

    public Funcionario buscaFuncionario(long id) throws FuncionarioNaoEncontradoException {

        Optional<Funcionario> optionalFuncionario = repositorioDeFuncionarios.findById(id);

        if(optionalFuncionario.isPresent()) {

           return optionalFuncionario.get();
        }

        else {
            throw new FuncionarioNaoEncontradoException("Id Invalido");
        }
    }
    public Funcionario buscaPorParametro(Long id) throws FuncionarioNaoEncontradoException{
        Optional<Funcionario> optionalFuncionario = repositorioDeFuncionarios.findById(id);

        if (optionalFuncionario.isPresent()) {
            return optionalFuncionario.get();
        }
        else
            throw new FuncionarioNaoEncontradoException("Não existe ninguem com esse ID");
    }
}


