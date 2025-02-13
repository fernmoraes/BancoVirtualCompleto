package com.java;

import java.io.Serial;
import java.io.Serializable;

public class Conta implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int agencia;
    private int numero;
    private double saldo;
    private String nome;
    private int senha;

    public Conta(){ //Construtor padrão

    }

    public Conta(int agencia, int numero, double saldo, String nome, int senha){ //Construtor com Parâmetros
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
        this.senha = senha;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo(){ //Metodo para Verificar, retorna saldo
        return this.saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void depositar(double valor){ //Metodo para Deposita, não retorna
        this.saldo += valor;
    }

    public void retirar(double valor) { //Metodo para Retirar, não retorna
        this.saldo -= valor;
    }

}
