package com.java;

public class Conta {

    int agencia;
    int numero;
    double saldo;

    public Conta(){ //Construtor padrão

    }

    public Conta(int agencia, int numero, double saldo){ //Construtor com Parâmetros
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){ //Metodo para Deposita, não retorna
        this.saldo += valor;
    }

    public void retirar(double valor) { //Metodo para Retirar, não retorna
        this.saldo -= valor;
    }

    public double verificarSaldo(){ //Metodo para Verificar, retorna saldo
        return this.saldo;
    }
}
