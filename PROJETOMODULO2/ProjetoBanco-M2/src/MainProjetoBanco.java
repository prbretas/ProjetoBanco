package ProjectModulo2;

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


ContaEmpresarial clientePJ1 = new ContaEmpresarial("595950", "JS Sauro - ME",
        "Lojao do Povo","25/06/1998", "Rua 123",
        "21 97974-5994", "985985-5",15970);

clientePJ1.calcularDebitoVoid(100);
clientePJ1.calcularSaqueVoid(869.50);







    }
}
