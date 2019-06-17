package com.matera.cliente;


import com.matera.conta.Conta;


public class Cliente implements SeguroDeVida, Comparable<Cliente>{

    int idade, idCliente;

    static int somaConta=0;

    public Cliente(int idCliente, int idade){
        this.idCliente = idCliente;
        this.idade = idade;
    }

    public void addConta() {
       Cliente.somaConta = Cliente.somaConta + 1;
    }
    public static int getSomaConta2() {
        return somaConta;
    }
    public int getIdade() {
        return idade;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void envelhece(int quantidade){
        this.idade = quantidade + this.idade;
    }



    @Override
    public boolean elegivel(int idConta){
//        if ((this.idade <= 20 || idConta <=1000)
//            (this.idade >= 20 && idConta 666))
//        return true;
//
//        {
            return true;
//        }
    }

    @Override
    public int compareTo(Cliente o) {
        if(this.somaConta > o.somaConta) {
            return 1;
        } if (this.somaConta == o.somaConta) {
            return 0;
        } else {
            return -1;
        }
    }
}