package ProjectModulo2;

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

public class MainProjetoBanco {
    public static void main(String[] args) {
//
//        PessoaFisica clientePF1 = new PessoaFisica();
//
//
//  ContaPoupanca clientePF2 = new ContaPoupanca(
//          "José Carlos", "da Silva Sauro", "164.497.985-85",
//                "6546836-4", "05/10/1978", "Rua dos Alfeneiros 4, Centro Rio de Janeiro-RJ CEP: 54974-264",
//                "05/02/1978", "01471-6",
//                0);
//
//        clientePF2.imprimirDadosPFNaTela();
//        clientePF2.calcularCreditoVoid(100);
//        clientePF2.calcularCreditoVoid(150);
//
//        //EXEMPLO:
//        // METODO DOUBLE RETORNANDO - DEMORA MUITO PARA ESCREVER.
//        // System.out.printf("O crédito de R$%.2f foi realizado com sucesso.\nSeu saldo é de R$%s."
//        //        ,clientePF2.calcularCredito(1358.79),clientePF2.mostrarSaldo());
//
//
//        clientePF2.imprimirDadosPFNaTela();
//        clientePF2.calcularDebitoVoid(30);
//
//        clientePF2.calcularDebitoVoid(25.79);
//        clientePF2.calcularDebitoVoid(54.37);
//        clientePF2.calcularDebitoVoid(38.68);
//
//        clientePF2.imprimirDadosPFNaTela();
//
//
//        clientePF2.calcularDebitoVoid(10);
//        clientePF2.calcularDebitoVoid(90);
//        clientePF2.calcularDebitoVoid(1);
//        clientePF2.calcularDebitoVoid(0.15);
//        clientePF2.calcularDebitoVoid(0.1);
//


        ContaInvestimentoPJ clientePJ1 = new ContaInvestimentoPJ("5959500001-01", "JS Sauro - ME",
                "Lojao do Povo", "25/06/1998", "Rua 123",
                "21 97974-5994", "985985-5", 10000);

        clientePJ1.depositarVoid(100);
        clientePJ1.transferirValorVoid(200);
        clientePJ1.calcularCreditoVoid(100);
        clientePJ1.calcularDebitoVoid(100);
        clientePJ1.calcularSaqueVoid(5000);
        clientePJ1.investirValorVoid(1127.5);
        clientePJ1.imprimirDadosPJNaTela();





        ContaPoupanca clienteCC1 = new ContaPoupanca(
          "José Carlos", "da Silva Sauro", "164.497.985-85","6546836-4",
                "05/10/1978", "Rua dos Alfeneiros 4,Centro Rio de Janeiro-RJ CEP: 54974-264",
                "05/02/1978", "01471-6", 0);

        clienteCC1.depositarVoid(100);
        clienteCC1.transferirValorVoid(50);
        clienteCC1.calcularCreditoVoid(1540);
        clienteCC1.calcularDebitoVoid(40);
        clienteCC1.calcularSaqueVoid(400);
        clienteCC1.investirValorVoid(300);
        clienteCC1.imprimirDadosPFNaTela();


    }
}
