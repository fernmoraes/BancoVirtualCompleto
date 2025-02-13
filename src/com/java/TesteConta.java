package com.java;

public class TesteConta {

    public static void main(String[] args) {

        Conta cc = new Conta(); // Variável de referência da classe Conta

        cc.depositar(50.0);
        cc.setAgencia(123);
        cc.setNumero(654);

        cc.depositar(1000);

        System.out.println(cc.getSaldo());

        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50);

        System.out.println(poupanca.getSaldo());


    }
}
