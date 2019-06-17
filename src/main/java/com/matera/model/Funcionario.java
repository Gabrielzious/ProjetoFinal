package com.matera.model;

public class Funcionario {

    private int idade, matricula;
    private String nome;


    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;

        Funcionario that = (Funcionario) o;

        if (getIdade() != that.getIdade()) return false;
        if (getMatricula() != that.getMatricula()) return false;
        return getNome() != null ? getNome().equals(that.getNome()) : that.getNome() == null;

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idade=" + idade +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        int result = getIdade();
        result = 31 * result + getMatricula();
        result = 31 * result + (getNome() != null ? getNome().hashCode() : 0);
        return result;
    }
}



