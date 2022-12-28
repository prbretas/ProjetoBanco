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
        String inputNome;
        String inputSobrenome;
        String inputCpf;
        String inputDocumento;
        String inputDataDeNascimento;
        String inputEndereco;
        String inputTelefone;
        String inputCnpj;
        String inputRazaoSocial;
        String inputNomeFantasia;
        String inputDataAbertura;
        double inputSaldo;

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
                        System.out.println("Digite seu Nome:");
                        inputNome = input.next();
                        System.out.println("Digite seu Sobrenome:");
                        inputSobrenome = input.next();
                        System.out.println("Digite seu CPF:");
                        inputCpf = input.next();
                        System.out.println("Digite o Número do seu Documento:");
                        inputDocumento = input.next();
                        System.out.println("Digite sua Data de Nascimento:");
                        inputDataDeNascimento = input.next();
                        System.out.println("Digite seu Endereço:");
                        inputEndereco = input.next();
                        System.out.println("Digite seu Telefone:");
                        inputTelefone = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        inputSaldo = input.nextDouble();
                        ContaCorrente CC = new ContaCorrente(inputNome, inputSobrenome, inputCpf, inputDocumento,
                                inputDataDeNascimento, inputEndereco, inputTelefone, inputSaldo);
                        CC.imprimirDadosPFNaTela();
                        CC.mostrarOperacoes();
                        break;
                    case 2:
                        System.out.println("--------- Você selecionou Conta Poupança -------");
                        System.out.println("Digite seu Nome:");
                        inputNome = input.next();
                        System.out.println("Digite seu Sobrenome:");
                        inputSobrenome = input.next();
                        System.out.println("Digite seu CPF:");
                        inputCpf = input.next();
                        System.out.println("Digite o Número do seu Documento:");
                        inputDocumento = input.next();
                        System.out.println("Digite sua Data de Nascimento:");
                        inputDataDeNascimento = input.next();
                        System.out.println("Digite seu Endereço:");
                        inputEndereco = input.next();
                        System.out.println("Digite seu Telefone:");
                        inputTelefone = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        inputSaldo = input.nextDouble();
                        ContaPoupanca CP = new ContaPoupanca(inputNome, inputSobrenome, inputCpf, inputDocumento,
                                inputDataDeNascimento, inputEndereco, inputTelefone, inputSaldo);
                        CP.imprimirDadosPFNaTela();
                        CP.mostrarOperacoes();
                        break;
                    case 3:
                        System.out.println("---- Você selecionou Conta Investimento PF -----");
                        System.out.println("Digite seu Nome:");
                        inputNome = input.next();
                        System.out.println("Digite seu Sobrenome:");
                        inputSobrenome = input.next();
                        System.out.println("Digite seu CPF:");
                        inputCpf = input.next();
                        System.out.println("Digite o Número do seu Documento:");
                        inputDocumento = input.next();
                        System.out.println("Digite sua Data de Nascimento:");
                        inputDataDeNascimento = input.next();
                        System.out.println("Digite seu Endereço:");
                        inputEndereco = input.next();
                        System.out.println("Digite seu Telefone:");
                        inputTelefone = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        inputSaldo = input.nextDouble();
                        ContaInvestimentoPF CIPF = new ContaInvestimentoPF(inputNome, inputSobrenome, inputCpf,
                                inputDocumento, inputDataDeNascimento, inputEndereco, inputTelefone, inputSaldo);
                        CIPF.imprimirDadosPFNaTela();
                        CIPF.mostrarOperacoes();
                        break;
                    case 4:
                        System.out.println("------ Você selecionou Conta Empresarial -------");
                        System.out.println("Digite o CNPJ da sua empresa:");
                        inputCnpj = input.next();
                        System.out.println("Digite a Razão Social:");
                        inputRazaoSocial = input.next();
                        System.out.println("Digite o nome Fantasia:");
                        inputNomeFantasia = input.next();
                        System.out.println("Digite a Data de Abertura da sua empresa:");
                        inputDataAbertura = input.next();
                        System.out.println("Digite o Endereço da sua empresa:");
                        inputEndereco = input.next();
                        System.out.println("Digite o Telefone da sua empresa:");
                        inputTelefone = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        inputSaldo = input.nextDouble();
                        ContaEmpresarial CE = new ContaEmpresarial(inputCnpj, inputRazaoSocial, inputNomeFantasia,
                                inputDataAbertura, inputEndereco, inputTelefone, inputSaldo);
                        CE.imprimirDadosPJNaTela();
                        CE.mostrarOperacoes();
                        break;
                    case 5:
                        System.out.println("----- Você selecionou Conta Investimento PJ ----");
                        System.out.println("Digite o CNPJ da sua empresa:");
                        inputCnpj = input.next();
                        System.out.println("Digite a Razão Social:");
                        inputRazaoSocial = input.next();
                        System.out.println("Digite o nome Fantasia:");
                        inputNomeFantasia = input.next();
                        System.out.println("Digite a Data de Abertura da sua empresa:");
                        inputDataAbertura = input.next();
                        System.out.println("Digite o Endereço da sua empresa:");
                        inputEndereco = input.next();
                        System.out.println("Digite o Telefone da sua empresa:");
                        inputTelefone = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        inputSaldo = input.nextDouble();
                        ContaInvestimentoPJ CIPJ = new ContaInvestimentoPJ(inputCnpj, inputRazaoSocial,
                                inputNomeFantasia, inputDataAbertura, inputEndereco, inputTelefone, inputSaldo);
                        CIPJ.imprimirDadosPJNaTela();
                        CIPJ.mostrarOperacoes();
                        break;
                    case 6:
                        sair = true;
                    default:
                        System.out.println("Selecione uma opção válida");
                }
            } catch (Exception e) {
                System.out.println("Digite uma opção válida");
                sair = true;
            }
        } while (!sair);

    }
}
