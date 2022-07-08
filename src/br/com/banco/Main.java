package br.com.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Informe o nome do cliente para a conta Corrente:\n");
        String clienteInformado = scanner.next();
        Cliente novoCliente = new Cliente(clienteInformado);
        Conta contaCorrente = new ContaCorrente(novoCliente);

        System.out.printf("Informe o nome do cliente para a conta Poupança:\n");
        String clienteInformadoPoupanca = scanner.next();
        Cliente novoClientePoupanca = new Cliente(clienteInformadoPoupanca);
        Conta contaPoupanca = new ContaPoupanca(novoClientePoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }

}
