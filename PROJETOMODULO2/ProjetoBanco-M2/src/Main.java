package Projeto2Scanner.ProjectModulo2;
/*
#APP Banco
        Crie uma aplicação que simule uma app bancária.
        Os clientes podem ser pessoa física ou jurídica, ------------------- ok
        sendo que para PJ existe a cobrança de uma taxa de 0.5% para ------- ok
        cada saque ou transferência.
Além do produto conta-corrente, os clientes PF podem abrir uma ------------- ok
 conta-poupança e conta-investimento.
 Clientes PJ não abrem poupança, mas seus rendimentos
 em conta-investimento rendem 2% a mais. ----------------------------------- ok
Crie as funcionalidades: abrir conta, sacar, depositar,
transferência, investir, consultar saldo.----------------------------------- ok

Use a classe "Aplicacao" para criar seu método "main" e
demonstrar o funcionamento do seu código.
O projeto pode ser entregue via link de
repositório Github, também no Class.
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomId = new Random();
        boolean sair;

        System.out.println();
        System.out.println("***** Olá seja Bem Vindo ao Banco LET's CODE *****");

        do {
            sair = false;
            try {
                System.out.println("--------------------------------------------------");
                System.out.println("|Qual o tipo de conta que você gostaria de abrir?|");
                System.out.println("--------------------------------------------------");
                System.out.println("|                                                |");
                System.out.println("|          1 - Conta Corrente (CC)               |");
                System.out.println("|          2 - Conta Poupança (CP)               |");
                System.out.println("|          3 - Conta Investimento PF (CIPF)      |");
                System.out.println("|          4 - Conta Empresarial (CE)            |");
                System.out.println("|          5 - Conta Investimento PJ (CIPJ)      |");
                System.out.println("|                                                |");
                System.out.println("|          6 - SAIR                              |");
                System.out.println("|                                                |");
                System.out.println("--------------------------------------------------");
                System.out.println("Selecione uma das opções acima");
                int opcoesContas = input.nextInt();
                switch (opcoesContas) {
                    case 1:
                        System.out.println("-------- Você selecionou Conta Corrente --------");
                        ContaCorrente CC = new ContaCorrente();
                        CC.perguntas();
                        CC.perguntaSaldoInicial();
                        CC.imprimirDadosPFNaTela();
                        CC.mostrarOperacoes();
                        break;
                    case 2:
                        System.out.println("--------- Você selecionou Conta Poupança -------");
                        ContaPoupanca CP = new ContaPoupanca();
                        CP.perguntas();
                        CP.perguntaSaldoInicial();
                        CP.imprimirDadosPFNaTela();
                        CP.mostrarOperacoes();
                        break;
                    case 3:
                        System.out.println("---- Você selecionou Conta Investimento PF -----");
                        ContaInvestimentoPF CIPF = new ContaInvestimentoPF();
                        CIPF.perguntas();
                        CIPF.perguntaSaldoInicial();
                        CIPF.imprimirDadosPFNaTela();
                        CIPF.mostrarOperacoes();
                        break;
                    case 4:
                        System.out.println("------ Você selecionou Conta Empresarial -------");
                        ContaEmpresarial CE = new ContaEmpresarial();
                        CE.perguntas();
                        CE.perguntaSaldoInicial();
                        CE.imprimirDadosPJNaTela();
                        CE.mostrarOperacoes();
                        break;
                    case 5:
                        System.out.println("----- Você selecionou Conta Investimento PJ ----");
                        ContaInvestimentoPJ CIPJ = new ContaInvestimentoPJ();
                        CIPJ.perguntas();
                        CIPJ.perguntaSaldoInicial();
                        CIPJ.imprimirDadosPJNaTela();
                        CIPJ.mostrarOperacoes();
                        break;
                    case 6:
                        sair = true;
                    default:
                        System.out.println("Selecione uma opção válida");
                }
            } catch (Exception e) {
                sair = true;
            }
        } while (!sair);

    }
}
