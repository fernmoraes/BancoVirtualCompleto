package com.java;

public class TesteContaCorrente {
    public static void main(String[] args) {
        // Criando um objeto da classe Conta (classe base)
        // Esse objeto pertence exclusivamente à classe Conta, sem características de ContaCorrente.
        Conta conta = new Conta(123, 1111, 1000.00, "Fernando", 12345);

        // Criando um objeto de ContaCorrente, mas referenciando-o como uma Conta (Polimorfismo)
        // Isso significa que ct só pode acessar métodos da classe Conta, mesmo sendo uma ContaCorrente.
        Conta ct = new ContaCorrente(123, 1111, 1000.00, "Fernando", 12345, "PF", 1000.00);

        // Criando um objeto de ContaCorrente normalmente, sem polimorfismo.
        // Isso permite acessar tanto os métodos de Conta quanto os métodos exclusivos de ContaCorrente.
        ContaCorrente cc = new ContaCorrente(123, 2222, 5000.00, "Fernando Navajas Moraes", 654321, "PF", 1000.00);

        // Realizando um casting explícito de Conta para ContaCorrente
        // Como o objeto ct foi instanciado como ContaCorrente, essa conversão é válida
        ContaCorrente c1 = (ContaCorrente) ct;
    }
}
