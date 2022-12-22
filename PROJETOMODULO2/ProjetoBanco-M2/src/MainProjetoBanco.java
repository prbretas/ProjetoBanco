/*
#APP Banco
        Crie uma aplicação que simule uma app bancária.
        Os clientes podem ser pessoa física ou jurídica,
        sendo que para PJ existe a cobrança de uma taxa de 0.5% para
        cada saque ou transferência.
Além do produto conta-corrente, os clientes PF podem abrir uma
 conta-poupança e conta-investimento.
 Clientes PJ não abrem poupança, mas seus rendimentos
 em conta-investimento rendem 2% a mais.
Crie as funcionalidades: abrir conta, sacar, depositar,
transferência, investir, consultar saldo.

Use a classe "Aplicacao" para criar seu método "main" e
demonstrar o funcionamento do seu código.
O projeto pode ser entregue via link de
repositório Github, também no Class.

*/


public class MainProjetoBanco {
    public static void main(String[] args) {

        PessoaFisica clientePF1 = new PessoaFisica();


        PessoaFisica clientePF2 = new PessoaFisica(
                "98944-5", 0, "José Carlos",
                "da Silva Sauro", "179.147.658-98", "6546836-4",
                "05/02/1978", "Rua dos Alfeneiros 4, Centro Rio de Janeiro-RJ CEP: 54974-264",
                "21 3947-4597");

        clientePF2.imprimirDadosPFNaTela();
        clientePF2.calcularCreditoVoid(1455.97);
        clientePF2.calcularCreditoVoid(949.99);

        //EXEMPLO:
        // METODO DOUBLE RETORNANDO - DEMORA MUITO PARA ESCREVER.
        // System.out.printf("O crédito de R$%.2f foi realizado com sucesso.\nSeu saldo é de R$%s."
        //        ,clientePF2.calcularCredito(1358.79),clientePF2.mostrarSaldo());


        clientePF2.imprimirDadosPFNaTela();
        clientePF2.calcularDebitoVoid(12.50);
        clientePF2.calcularDebitoVoid(22.51);


    }
}
