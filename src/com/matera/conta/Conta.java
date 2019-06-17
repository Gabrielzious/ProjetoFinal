package com.matera.conta;

import com.matera.cliente.SeguroDeVida;
import com.matera.main.OlaMundo;

public class Conta {

    private int numero;
    private String titular;
    private String cpf;
    private double saldo = 200,salario;
    private double limiteespecial;
    private double saldoPoupanca;

    private static int totalDeContas;

    public static void SomaConta(){
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    public Conta(String titular, int numero, String cpf, double saldo, double salario, double limiteespecial, double saldoPoupanca) {
        this.numero = numero;
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
        this.salario = salario;
        this.limiteespecial = limiteespecial;
        this.saldoPoupanca = saldoPoupanca;
    }



    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
    public double getLimiteEspecial(){
        return this.limiteespecial;
    }
    public int getNumero() {
        return this.numero;
    }
    public String getTitular() {
        return this.titular;
    }
    public String getCpf() {
        return this.cpf;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public double getSalario() {
        return this.salario;
    }
    public double getSaldoVisivel(){
        return (this.saldo + this.limiteespecial);
    }
    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setLimiteespecial(double novoespecial){
        this.limiteespecial = novoespecial;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public void saca(double quantidade) {
        if (quantidade <= this.saldo &&  quantidade > 0) {
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
            System.out.println("sacado: " + quantidade + "\nnovo saldo: " + this.saldo + "\n");
        }
        else {

            System.out.println("Você não pode sacar esse valor");
            throw new IllegalArgumentException("Saldo Insuficiente");
            //throw new SaldoInsuficienteException("123");

        }
    }

    public void deposita (double quantidadeDeposito){

        double novoSaldoDeposito = this.saldo + quantidadeDeposito;
        this.saldo = novoSaldoDeposito;

        System.out.println("Valor do depósito recebido com sucesso \n novo valor:"
                            + this.getSaldo());

    }
    public void inserePoupanca(double valorInserido){
        if ((valorInserido < this.getSaldo()) && (valorInserido > 0)) {
            this.saldo -= valorInserido;
            this.saldoPoupanca += valorInserido;
            System.out.println("Dinheiro inserido na poupanca com sucesso");
            System.out.println("novo saldo da poupança: " + this.getSaldoPoupanca());
            System.out.println("novo saldo da conta corrente: " + this.getSaldo());
        }
        else{
            System.out.println("Impossivel Inserir esse valor");
        }
    }
    public void retiraPoupanca(double valorRetirado) {
        if (valorRetirado < this.getSaldoPoupanca()) {
            this.saldo += valorRetirado;
            this.saldoPoupanca -= valorRetirado;
            System.out.println("Dinheiro resgatado da poupanca com sucesso");
            System.out.println("novo saldo da poupança: " + this.getSaldoPoupanca());
            System.out.println("novo saldo da conta corrente: " + this.getSaldo());
        }
        else{
            System.out.println("Impossivel resgatar esse valor");
        }
    }


    void mudaCpf(String novoValor){
        this.cpf = novoValor;
        System.out.println("Cpf da conta mudado para:" + this.cpf);

    }

        }