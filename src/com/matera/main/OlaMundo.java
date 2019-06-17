package com.matera.main;
import com.matera.conta.Conta;

import com.matera.cliente.Cliente;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args)
    {
//        Conta c1;
//        c1 = new Conta("Andre",1407858,"413864955816",1500,2000,1500,0);
//        Conta.SomaConta();
//       System.out.println(c1.getTitular());
//        Conta minhaConta;
//        minhaConta = new Conta( "Jose",130385667,"77612191849",2500,3700,3000,0);
//        Conta.SomaConta();
//       System.out.println(c1.getNumero());



        Conta c2 = new Conta("Almeida",144,"413.564.8799",1000,2200,2500,0);
/////////////////////////////////////////////////////////////////////////////////////////////////







//        c2.saca(100);
//        c2.inserePoupanca(200);
//        System.out.println("\n");
//        c2.deposita(2500);
//        System.out.println("\n");
//        c2.deposita(1500);
//        System.out.println("\n");
//        c2.deposita(2000);

        try {
            c2.saca(10000);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Nao foi retirado o saldo");
        }

        try{
            c2.saca(20000);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n");
        c2.inserePoupanca(5000);
        c2.inserePoupanca(1000);
        c2.inserePoupanca(3000);
        System.out.println("\n");
        System.out.println(c2.getSaldo());
        System.out.println(c2.getSaldoPoupanca());





//        Cliente gabriel = new Cliente(465833,25);
//        Cliente.getSomaConta2();

//        System.out.println();
//        System.out.println(gabriel.getIdade());
//        gabriel.envelhece(5);
//        System.out.println(gabriel.getIdade());

//        Comparable algoComparabel = gabriel;

        //System.out.println("o numero total de contas é " + Conta.getTotalDeContas());
        //System.out.println("O saldo da sua conta é de" + minhaConta.getSaldoVisivel());
        //System.out.println(minhaConta.getNumero());



    }

}

//class TesteErro {
//    public static void main(String[] args) {
//
//        int i = 200;
//        try {
//        i = i/0;
//
//            System.out.println("olaa");
//        }
//        catch (ArithmeticException e){
//            System.out.println("erro " + e);
//        }
//
//
//        System.out.println("inicio do main");
//        try {
//            metodo1();
//        }
//        catch (NullPointerException e){
//            System.out.println("erro " + e);
//        }
//
//        System.out.println("fim do main");
//    }
//    static void metodo1() {
//        System.out.println("inicio do metodo1");
//        metodo2();
//        System.out.println("fim do metodo1");
//    }
//    static void metodo2() {
//        System.out.println("inicio do metodo2");
//        Conta cc = new Conta("Gomes", 257585, "413.864.555.95",1000,1200,2000,0);
//            for (int i = 0; i <= 15; i++) {
//                cc.deposita(i + 1000);
//                System.out.println(cc.getSaldo());
//                if (i == 5) {
//                    cc = null;
//                }
//            }
//
//        System.out.println("fim do metodo2");
//    }
//
//
//}
