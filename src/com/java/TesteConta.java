package com.java;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta(); //Foi criado o objeto a partir da classe Conta com o nome contaCorrente
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente.nome = "Fernando"; //foi definido o nome do objeto cliente que tem o acesso a classe DadosCliente
        contaCorrente.cliente.idade = 20;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente.nome = "Jose";
        contaPoupanca.cliente.idade = 19;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Maria";
        contaInvestimento.cliente.idade = 25;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
    }
}
