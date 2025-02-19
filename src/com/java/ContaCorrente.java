package com.java;

public class ContaCorrente extends Conta {

    private String tipo;
    private Double chequeEspecial;

    // Construtor padrão
    public ContaCorrente() {
        super(); // Chama o construtor padrão da classe Conta
    }

    // Construtor com parâmetros
    public ContaCorrente(int agencia, int numero, double saldo, String nome, int senha, String tipo, Double chequeEspecial) {
        super(agencia, numero, saldo, nome, senha); // Chama o construtor da classe Conta
        this.tipo = tipo;
        this.chequeEspecial = chequeEspecial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel() {
        return super.getSaldo() + chequeEspecial;
    }
}
