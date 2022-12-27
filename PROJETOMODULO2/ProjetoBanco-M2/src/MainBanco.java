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

public class MainBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomId = new Random();
        System.out.println();
        System.out.println("***** Olá seja Bem Vindo ao Banco LET's CODE *****");
        boolean sair;
        do {
            sair = false;
            try {
                System.out.println("--------------------------------------------------");
                System.out.println("|Qual o tipo de conta que você gostaria de abrir?|");
                System.out.println("--------------------------------------------------");
                System.out.println("|          1 - Conta Corrente (CC)               |");
                System.out.println("|          2 - Conta Poupança (CP)               |");
                System.out.println("|          3 - Conta Investimento PF (CIPF)      |");
                System.out.println("|          4 - Conta Empresarial (CE)            |");
                System.out.println("|          5 - Conta Investimento PJ (CIPJ)      |");
                System.out.println("|                                                |");
                System.out.println("|          6 - SAIR                              |");
                System.out.println("--------------------------------------------------");
                System.out.println("Selecione uma das opções acima");
                int opcoesContas = input.nextInt();
                switch (opcoesContas) {
                    case 1:
                        System.out.println("-------- Você selecionou Conta Corrente --------");
                        System.out.println("Digite seu Nome:");
                        String inputNomeCC = input.next();
                        System.out.println("Digite seu Sobrenome:");
                        String inputSobrenomeCC = input.next();
                        System.out.println("Digite seu CPF:");
                        String inputCpfCC = input.next();
                        System.out.println("Digite o Número do seu Documento:");
                        String inputDocumentoCC = input.next();
                        System.out.println("Digite sua Data de Nascimento:");
                        String inputDataDeNascimentoCC = input.next();
                        System.out.println("Digite seu Endereço:");
                        String inputEnderecoCC = input.next();
                        System.out.println("Digite seu Telefone:");
                        String inputTelefoneCC = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        double inputSaldoCC = input.nextDouble();
                        ContaCorrente CC = new ContaCorrente(inputNomeCC, inputSobrenomeCC, inputCpfCC, inputDocumentoCC,
                                inputDataDeNascimentoCC, inputEnderecoCC, inputTelefoneCC, inputSaldoCC);
                        System.out.println(CC.toString());
                        CC.mostrarOperacoes();
                        break;
                    case 2:
                        System.out.println("--------- Você selecionou Conta Poupança -------");
                        System.out.println("Digite seu Nome:");
                        String inputNomeCP = input.next();
                        System.out.println("Digite seu Sobrenome:");
                        String inputSobrenomeCP = input.next();
                        System.out.println("Digite seu CPF:");
                        String inputCpfCP = input.next();
                        System.out.println("Digite o Número do seu Documento:");
                        String inputDocumentoCP = input.next();
                        System.out.println("Digite sua Data de Nascimento:");
                        String inputDataDeNascimentoCP = input.next();
                        System.out.println("Digite seu Endereço:");
                        String inputEnderecoCP = input.next();
                        System.out.println("Digite seu Telefone:");
                        String inputTelefoneCP = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        double inputSaldoCP = input.nextDouble();
                        ContaPoupanca CP = new ContaPoupanca(inputNomeCP, inputSobrenomeCP, inputCpfCP, inputDocumentoCP,
                                inputDataDeNascimentoCP, inputEnderecoCP, inputTelefoneCP, inputSaldoCP);
                        System.out.println(CP.toString());
                        CP.mostrarOperacoes();
                        break;
                    case 3:
                        System.out.println("---- Você selecionou Conta Investimento PF -----");
                        System.out.println("Digite seu Nome:");
                        String inputNomeCIPF = input.next();
                        System.out.println("Digite seu Sobrenome:");
                        String inputSobrenomeCIPF = input.next();
                        System.out.println("Digite seu CPF:");
                        String inputCpfCIPF = input.next();
                        System.out.println("Digite o Número do seu Documento:");
                        String inputDocumentoCIPF = input.next();
                        System.out.println("Digite sua Data de Nascimento:");
                        String inputDataDeNascimentoCIPF = input.next();
                        System.out.println("Digite seu Endereço:");
                        String inputEnderecoCIPF = input.next();
                        System.out.println("Digite seu Telefone:");
                        String inputTelefoneCIPF = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        double inputSaldoCIPF = input.nextDouble();
                        ContaInvestimentoPF CIPF = new ContaInvestimentoPF(inputNomeCIPF, inputSobrenomeCIPF, inputCpfCIPF, inputDocumentoCIPF,
                                inputDataDeNascimentoCIPF, inputEnderecoCIPF, inputTelefoneCIPF, inputSaldoCIPF);
                        System.out.println(CIPF.toString());
                        CIPF.mostrarOperacoes();
                        break;
                    case 4:
                        System.out.println("------ Você selecionou Conta Empresarial -------");
                        System.out.println("Digite o CNPJ da sua empresa:");
                        String inputCnpjCE = input.next();
                        System.out.println("Digite a Razão Social:");
                        String inputRazaoSocialCE = input.next();
                        System.out.println("Digite o nome Fantasia:");
                        String inputNomeFantasiaCE = input.next();
                        System.out.println("Digite a Data de Abertura da sua empresa:");
                        String inputDataAberturaCE = input.next();
                        System.out.println("Digite o Endereço da sua empresa:");
                        String inputEnderecoCE = input.next();
                        System.out.println("Digite o Telefone da sua empresa:");
                        String inputTelefoneCE = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        double inputSaldoCE = input.nextDouble();
                        ContaEmpresarial CE = new ContaEmpresarial(inputCnpjCE, inputRazaoSocialCE, inputNomeFantasiaCE,
                                inputDataAberturaCE, inputEnderecoCE, inputTelefoneCE, inputSaldoCE);
                        System.out.println(CE.toString());
                        CE.mostrarOperacoes();
                        break;
                    case 5:
                        System.out.println("----- Você selecionou Conta Investimento PJ ----");
                        System.out.println("Digite o CNPJ da sua empresa:");
                        String inputCnpjCIPJ = input.next();
                        System.out.println("Digite a Razão Social:");
                        String inputRazaoSocialCIPJ = input.next();
                        System.out.println("Digite o nome Fantasia:");
                        String inputNomeFantasiaCIPJ = input.next();
                        System.out.println("Digite a Data de Abertura da sua empresa:");
                        String inputDataAberturaCIPJ = input.next();
                        System.out.println("Digite o Endereço da sua empresa:");
                        String inputEnderecoCIPJ = input.next();
                        System.out.println("Digite o Telefone da sua empresa:");
                        String inputTelefoneCIPJ = input.next();
                        System.out.println("Digite o valor do depósito inicial:");
                        double inputSaldoCIPJ = input.nextDouble();
                        ContaInvestimentoPJ CIPJ = new ContaInvestimentoPJ(inputCnpjCIPJ, inputRazaoSocialCIPJ, inputNomeFantasiaCIPJ,
                                inputDataAberturaCIPJ, inputEnderecoCIPJ, inputTelefoneCIPJ, inputSaldoCIPJ);
                        System.out.println(CIPJ.toString());
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
