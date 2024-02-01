package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Agência! ");

        int numero = 1021; // 1021
        String agencia = entrada.nextLine(); // 067-8
        String nomeCliente = "MARIO ANDRADE"; // MARIO ANDRADE
        double saldo = 237.48; // 237.48

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        entrada.close();
    }
}