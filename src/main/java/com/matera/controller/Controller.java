package com.matera.controller;

import com.matera.objetoFuncionario.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class Controller {

    @GetMapping("/pessoas")
    public List<Funcionario> whatever() {


        Funcionario p1 = new Funcionario("Joao");
        Funcionario p2 = new Funcionario("Pedro");
        Funcionario p3 = new Funcionario("Antonio");
        Funcionario p4 = new Funcionario("Paulo");
        Funcionario p5 = new Funcionario("Marcos");
        Funcionario p6 = new Funcionario("Ruan");
        Funcionario p7 = new Funcionario("Carlos");


        List<Funcionario> listaNego = new ArrayList<Funcionario>();
        listaNego.add(p1);
        listaNego.add(p2);
        listaNego.add(p3);
        listaNego.add(p4);
        listaNego.add(p5);
        listaNego.add(p6);
        listaNego.add(p7);

        listaNego.remove(p5);

        return listaNego;

    }

    @RequestMapping("/jesus")
            public String execute(){
        System.out.println("Executando um Spring");
        return "ok";
    }


}