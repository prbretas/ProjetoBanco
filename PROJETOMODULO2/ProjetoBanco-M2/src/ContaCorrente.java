package Projeto2Scanner.ProjectModulo2;

import AulasClass.Encapsulamento.Conta;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ContaCorrente extends PessoaFisica {
    //--------------------------- IMPORTS ---------------------------------------------------
    Scanner input = new Scanner(System.in);
    Random randomId = new Random();

    boolean sair;

    //-------------------------- ATRIBUTOS ----------------------------------------------------

    // GERAR NUMERO ALEATORIO PARA A CONTA
    int numeroContaAleatorio = randomId.nextInt(999999); // NUMERO DA CONTA CORRENTE
    private int digitoConta = randomId.nextInt(10); // DIGITO DA CONTA CORRENTE
    private String _numConta = String.valueOf(numeroContaAleatorio) + "-" + digitoConta;

    //------------------------- OUTROS ATRIBUTOS ------------------------------------------
    private Date _dataAtual = new Date();
    final private String _operacao = "001";
    final private String _agencia = "145";
    private double _saldo;

    // ----------- PRE ABERTURA DA CONTA INVESTIMENTO ---------------
    ContaInvestimentoPF CIPF = new ContaInvestimentoPF(get_nome(), get_sobrenome(),
            get_cpf(), get_documento(), get_dataDeNascimento(), get_endereco(),
            get_telefone(), get_contaInvestimento());
    private double _contaInvestimento;

    //--------------------------- GET E SET ------------------------------------------------

    public String get_numConta() {
        return _numConta;
    }

    public void set_numConta(String numConta) {
        this._numConta = numConta;
    }

    public double get_saldo() {
        return _saldo;
    }

    public void set_saldo(double saldo) {
        this._saldo = saldo;
    }

    public String get_operacao() {
        return _operacao;
    }

    public String get_agencia() {
        return _agencia;
    }

    public Date getDataAtual() {
        return _dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this._dataAtual = dataAtual;
    }

    public double get_contaInvestimento() {
        return _contaInvestimento;
    }

    public void set_contaInvestimento(double contaInvestimento) {
        this._contaInvestimento = contaInvestimento;
    }

    //--------------------------- CONSTRUCTOR ------------------------------------------------
    public ContaCorrente(String nome, String sobrenome, String cpf, String documento, String dataDeNascimento,
                         String endereco, String telefone, double saldo) {
        super(nome, sobrenome, cpf, documento, dataDeNascimento, endereco, telefone);
        this._saldo = saldo;
    }

    public ContaCorrente() {

    }

    //------------------------------ TO STRING ----------------------------------

    @Override
    public String toString() {
        return "\nContaCorrente {" +
                "\nagencia: " + get_agencia() +
                "\nopera??ao: " + get_operacao() +
                "\nnumConta: " + get_numConta() +
                "\nnome: " + get_nome() +
                "\nsobrenome:" + get_sobrenome() +
                "\ncpf: " + get_cpf() +
                "\ndocumento: " + get_documento() +
                "\ndataDeNascimento: " + get_dataDeNascimento() +
                "\nendereco: " + get_endereco() +
                "\ntelefone: " + get_telefone() +
                "\nsaldo: R$" + get_saldo() +
                "\ncontaInvestimento: R$" + get_contaInvestimento() +
                "\n}";
    }

    public String dadosDaConta() {
        return "\nConta Corrente" +
                "\nNome: " + get_nome() +
                "\nSobrenome:" + get_sobrenome() +
                "\nCPF: " + get_cpf() +
                "\nDocumento: " + get_documento() +
                "\nData de Nascimento: " + get_dataDeNascimento() +
                "\nEndere??o: " + get_endereco() +
                "\nTelefone: " + get_telefone() +
                "\nAg??ncia: " + get_agencia() +
                "\nOpera??ao: " + get_operacao() +
                "\nN?? da Conta: " + get_numConta() +
                "\nSaldo: " + get_saldo() +
        "\nConta Investimento: R$" + get_contaInvestimento() ;
    }


    public void mostrarDados(){
        System.out.println(dadosDaConta());
    }


    //------------------------------ METODOS ---------------------------------------

    //-------------------------------- ABRIR CONTA ----------------------
    public void abrirContaCorrente() {
        perguntas();
        System.out.println("Digite o valor do dep??sito inicial:");
        _saldo = input.nextDouble();
    }

    //------------------------ CONSULTAR SALDO ------------------------------
    public void consultarSaldoVoid() {
         System.out.printf("%s - O saldo atual da Conta Corrente N?? %s ??: R$%.2f\n",
                getDataAtual(), get_numConta(), get_saldo());
    }

    public double consultarSaldo() {
        return get_saldo();
    }


    //---------------------- FUNCAO CARTAO DE CREDITO  -------------------------------
    public double calcularCredito(double creditoValor) {
        if (get_saldo() < 0 || creditoValor > get_saldo()) {
            System.out.println("N??O AUTORIZADO. Voc?? n??o tem saldo suficiente para Pagar no Credito");
        } else {
            set_saldo(get_saldo() - creditoValor - (creditoValor * 0.0299));
        }
        return creditoValor;
    }

    public void calcularCreditoVoid(double creditoValor) {

        if (get_saldo() < 0 || creditoValor > get_saldo()) {
            System.out.println("N??O AUTORIZADO. Voc?? n??o tem saldo suficiente para Pagar no Credito");
        } else {
            set_saldo(get_saldo() - creditoValor - (creditoValor * 0.0299));
            System.out.printf("\nO pagamento em cr??dito, no valor de R$%.2f foi realizado com sucesso.\n", creditoValor);
            consultarSaldoVoid();
        }
    }

    //---------------------- FUNCAO CARTAO DE DEBITO  -------------------------------

    public double calcularDebito(double debitoValor) {
        if (get_saldo() < 0 || debitoValor > get_saldo()) {
            System.out.println("N??O AUTORIZADO. Voc?? n??o tem saldo suficiente para Pagar no Debito");
        } else {
            set_saldo(get_saldo() - debitoValor);
            System.out.printf("\nO pagamento em d??bito no valor de R$%.2f foi realizado com sucesso.\n", debitoValor);
            consultarSaldoVoid();
        }
        return debitoValor;
    }

    public void calcularDebitoVoid(double debitoValor) {
        if (get_saldo() < 0 || debitoValor > get_saldo()) {
            System.out.println("N??O AUTORIZADO. Voc?? n??o tem saldo suficiente para Pagar no Debito");
        } else {
            set_saldo(get_saldo() - debitoValor);
            System.out.printf("\nO pagamento em d??bito no valor de R$%.2f foi realizado com sucesso.\n", debitoValor);
            consultarSaldoVoid();
        }
    }

    //---------------------- FUNCAO SAQUE  -------------------------------

    public double calcularSaque(double saqueValor) {
        if (get_saldo() < 0 || saqueValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Sacar");
        } else {
            set_saldo(get_saldo() - saqueValor);
            System.out.printf("\nO saque no valor de R$%.2f foi realizado com sucesso.\n", saqueValor);
            consultarSaldoVoid();
        }
        return saqueValor;
    }

    public void calcularSaqueVoid(double saqueValor) {
        if (get_saldo() < 0 || saqueValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Sacar");
        } else {
            set_saldo(get_saldo() - saqueValor);
            System.out.printf("\nO saque no valor de R$%.2f foi realizado com sucesso.\n", saqueValor);
            consultarSaldoVoid();
        }
    }

    //---------------------- FUNCAO DEPOSITAR  -------------------------------

    public double depositar(double depositoValor) {
        set_saldo(depositoValor + get_saldo());
        return depositoValor;
    }

    public void depositarVoid(double depositoValor) {
        set_saldo(depositoValor + get_saldo());
        System.out.printf("\nO dep??sito de R$%.2f foi realizado com sucesso.\n", depositoValor);
        consultarSaldoVoid();
    }

    //---------------------- FUNCAO TRANSFERIR  -------------------------------
    public double transferirValor(double transferenciaValor) {
        if (get_saldo() < 0 || transferenciaValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Transferir");
        } else {
            set_saldo(get_saldo() - transferenciaValor);
            consultarSaldoVoid();
        }
        return transferenciaValor;
    }

    public void transferirValorVoid(double transferenciaValor) {
        if (get_saldo() < 0 || transferenciaValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Transferir");
        } else {
            set_saldo(get_saldo() - transferenciaValor);
            System.out.printf("\nA transfer??ncia  de R$%.2f foi realizado com sucesso.\n", transferenciaValor);
            consultarSaldoVoid();
        }
    }

    //---------------------- FUNCAO INVESTIR  -------------------------------
    public double investirValor(double investimentoValor) {
        if (get_saldo() < 0 || investimentoValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Investir");
        } else {
            set_saldo(get_saldo() - investimentoValor);
            CIPF.set_saldo(CIPF.get_saldo() + investimentoValor);
            System.out.printf("\nO investimento de R$%.2f foi realizado com sucesso.\n" +
                    "O n??mero da sua Conta Investimento PF ??: %s\n", investimentoValor, CIPF.get_numConta());
            set_contaInvestimento(CIPF.get_saldo());
            CIPF.consultarSaldoVoid();
            consultarSaldoVoid();

        }
        return investimentoValor;
    }

    public void investirValorVoid(double investimentoValor) {
        if (get_saldo() < 0 || investimentoValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Investir");
        } else {
            set_saldo(get_saldo() - investimentoValor);
            CIPF.set_saldo(CIPF.get_saldo() + investimentoValor);
            System.out.printf("\nO investimento de R$%.2f foi realizado com sucesso.\n" +
                    "O n??mero da sua Conta Investimento PF ??: %s\n", investimentoValor, CIPF.get_numConta());
            set_contaInvestimento(CIPF.get_saldo());
            CIPF.consultarSaldoVoid();
            consultarSaldoVoid();

        }
    }

    public void mostrarOperacoes() {
        //------------------------------- OPERA????ES CONTA ----------------------------------
        System.out.println("\n------------------------------------------------------");
        System.out.printf("  Nome: %s %s          CONTA CORRENTE   \n", get_nome(), get_sobrenome());
        System.out.printf("  Saldo: R$%.2f                             \n", get_saldo());
        System.out.printf("  Ag??ncia: %s    Op: %s     N?? da Conta: %s            \n", get_agencia(), get_operacao(), get_numConta());

        System.out.println("-------------------------------------------------------");
        System.out.println("|          Qual opera????o voc?? deseja fazer?           |");
        System.out.println("-------------------------------------------------------");
        System.out.println("|                1 - Saque                            |");
        System.out.println("|                2 - Deposito                         |");
        System.out.println("|                3 - Transfer??ncia                    |");
        System.out.println("|                4 - Investimento                     |");
        System.out.println("|                5 - Ver Saldo                        |");
        System.out.println("|                6 - Meus Dados                       |");
        System.out.println("|                                                     |");
        System.out.println("|                0 - SAIR                             |");
        System.out.println("-------------------------------------------------------");
        System.out.println("Selecione uma das op????es acima");
        realizarOperacao();
    }

    public void realizarOperacao() {
        int operacao = input.nextInt();

        do {
            sair = false;
            try {
                switch (operacao) {
                    case 1 -> {
                        System.out.println("Voc?? selecionou Saque");
                        System.out.println("Digite abaixo o valor que deseja Sacar:");
                        double valor = input.nextDouble();
                        calcularSaqueVoid(valor);
                        continuarPrograma();
                    }
                    case 2 -> {
                        System.out.println("Voc?? selecionou Dep??sito");
                        System.out.println("Digite abaixo o valor que deseja Depositar:");
                        double valor = input.nextDouble();
                        depositarVoid(valor);
                        continuarPrograma();
                    }
                    case 3 -> {
                        System.out.println("Voc?? selecionou Transfer??ncia");
                        System.out.println("Digite abaixo a AG??NCIA DA CONTA que deseja transferir:");
                        String agTrasf = input.next();
                        System.out.println("Digite abaixo a OPERA????O DA CONTA que deseja transferir:");
                        String opTransf = input.next();
                        System.out.println("Digite abaixo o N??MERO DA CONTA que deseja transferir:");
                        String contaTransf = input.next();
                        System.out.println("Digite abaixo o valor que deseja Transferir:");
                        double valor = input.nextDouble();
                        System.out.printf("\nVoc?? tentou transferir R$%.2f para a conta de numero: AG %s OP %s CONTA %s.\n", valor, agTrasf, opTransf, contaTransf);
                        transferirValorVoid(valor);
                        continuarPrograma();
                    }
                    case 4 -> {
                        System.out.println("Voc?? selecionou Investimento");
                        System.out.println("Digite abaixo o valor que deseja Investir:");
                        double valor = input.nextDouble();
                        investirValorVoid(valor);
                        continuarPrograma();
                    }
                    case 5 -> {
                        System.out.println("Voc?? selecionou Consultar Saldo");
                        consultarSaldoVoid();
                        continuarPrograma();
                    }
                    case 6 -> {
                        System.out.println("Voc?? selecionou Mostrar Meus Dados");
                        mostrarDados();
                        continuarPrograma();
                    }
                    case 0 -> {
                        System.out.println("Voc?? selecionou SAIR");
                        sair = true;
                    }
                    default -> {
                        System.out.println("Digite uma op????o v??lida");
                        mostrarOperacoes();
                    }
                }
            } catch (Exception e) {
                System.out.println("ERRO - Selecione uma op????o v??lida");
                sair = true;
            }
        } while (!sair);
    }

    public void continuarPrograma() {
        do {
            System.out.println("-------------------------------------------");
            System.out.println("|   Deseja realizar mais alguma opera????o? |");
            System.out.println("|             1 - Sim                     |");
            System.out.println("|             2 - N??o                     |");
            System.out.println("-------------------------------------------");
            try {
                int continuarOp = input.nextInt();
                if (continuarOp == 1) {
                    sair = false;
                    mostrarOperacoes();
                } else if (continuarOp == 2) {
                    sair = true;
                } else {
                    System.out.println("Digite 1 para SIM ou 2 para N??O");
                }
            } catch (Exception e) {
                System.out.println("ERRO: ESSA OP????O N??O EXISTE");
                sair = true;
            }
        } while (!sair);
    }


}


