package com.java;

import java.util.Scanner;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaTeste = new Conta(123, 1111, 1000.00, "Fernando", 12345); // Variável de referência da classe Conta

        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Digite o número da Conta");

        int numeroConta = scanner.nextInt();

        if (numeroConta == contaTeste.getNumero()) {

            System.out.println("Conta: " + contaTeste.getNumero() + " Acessada, Digite a senha");
            int senhaConta = scanner.nextInt();

            if (senhaConta == contaTeste.getSenha()) {
                System.out.println("Acesso liberado, bem-vindo " + contaTeste.getNome());

                byte opcao = 0;
                double valor;

                while(opcao != 4) {
                    System.out.println("**************************");
                    System.out.println("Comandos");
                    System.out.println("1 - Verificar Saldo");
                    System.out.println("2 - Adicionar Saldo");
                    System.out.println("3 - Transferência");
                    System.out.println("4 - Encerrar Seção");

                    opcao = scanner.nextByte();

                    switch (opcao) {
                        case 1:
                            System.out.println(contaTeste.getSaldo());
                            break;
                        case 2:
                            System.out.println("Digite o valor a ser adicionado");
                            valor = scanner.nextDouble();
                            contaTeste.depositar(valor);
                            break;
                        case 3:
                            System.out.println("Digite o valor a ser transferido");
                            valor = scanner.nextDouble();
                            if (valor <= contaTeste.getSaldo()){
                                contaTeste.retirar(valor);
                            } else {
                                System.out.println("Você não possui fundo suficiente");
                            }
                            break;
                        case 4:
                            System.out.println("Programa encerrado!");
                            break;
                        default:
                            System.out.println("Número inválido");
                    }

                }
            } else {
                System.out.println("Senha errada, seção encerrada");
            }
        }else {
            System.out.println("Conta errada, seção encerrada");
        }
    }
}
