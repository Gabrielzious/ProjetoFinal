package com.matera.controller;

import com.matera.model.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class Controller {

    @GetMapping("/funcionario")
    public List<Funcionario> returnAquisition() {

        // TODO fazer varias coisas

        Funcionario p1 = new Funcionario("Joao");
        Funcionario p2 = new Funcionario("Pedro");
        Funcionario p3 = new Funcionario("Antonio");
        Funcionario p4 = new Funcionario("Paulo");
        Funcionario p5 = new Funcionario("Marcos");
        Funcionario p6 = new Funcionario("Ruan");
        Funcionario p7 = new Funcionario("Carlos");


        List<Funcionario> listaFunc = new ArrayList<Funcionario>();
        listaFunc.add(p1);
        listaFunc.add(p2);
        listaFunc.add(p3);
        listaFunc.add(p4);
        listaFunc.add(p5);
        listaFunc.add(p6);
        listaFunc.add(p7);

        listaFunc.remove(p5);

        return listaFunc;

    }

    @RequestMapping("/requestTest")
            public String execute(){
        System.out.println("Executando um Spring");
        return "ok";
    }


}