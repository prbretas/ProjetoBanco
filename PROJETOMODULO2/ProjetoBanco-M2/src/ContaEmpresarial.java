package Projeto2Scanner.ProjectModulo2;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//Conta Corrente Empresarial - Conta PJ
public class ContaEmpresarial extends PessoaJuridica {
    Scanner input = new Scanner(System.in);
    Random randomId = new Random();

    boolean sair;

    // GERAR NUMERO ALEATORIO PARA A CONTA
    int numeroContaAleatorio = randomId.nextInt(999999);
    private int idConta = randomId.nextInt(10);
    private String _numConta = String.valueOf(numeroContaAleatorio) + "-" + idConta;

    private Date _dataAtual = new Date();

    final private String _operacao = "058";
    final private String _agencia = "145";
    private double _saldo;


    // ----------- PRE ABERTURA DA CONTA INVESTIMENTO ---------------
    ContaInvestimentoPJ CIPJ = new ContaInvestimentoPJ(get_cnpj(), get_razaoSocial(), get_nomeFantasia(),
            get_dataDeAbertura(), get_endereco(), get_telefone(), get_contaInvestimento());

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

    public void set_saldo(double _saldo) {
        this._saldo = _saldo;
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


    public ContaEmpresarial(String cnpj, String razaoSocial, String nomeFantasia, String dataDeAbertura,
                            String endereco, String telefone, double saldo) {
        super(cnpj, razaoSocial, nomeFantasia, dataDeAbertura, endereco, telefone);
        this._saldo = saldo;
    }

    public ContaEmpresarial() {

    }

    //--------------------------------- TO STRING ---------------------------------------

    @Override
    public String toString() {
        return "\nContaEmpresarial {" +
                "\ncnpj: " + get_cnpj() +
                "\nrazaoSocial: " + get_razaoSocial() +
                "\nnomeFantasia: " + get_nomeFantasia() +
                "\ndataDeAbertura: " + get_dataDeAbertura() +
                "\nendereco: " + get_endereco() +
                "\ntelefone: " + get_telefone() +
                "\nagencia: " + get_agencia() +
                "\nopera??ao: " + get_operacao() +
                "\nnumConta: " + get_numConta() +
                "\nsaldo: R$" + get_saldo() +
                "\ncontaInvestimento: R$" + get_contaInvestimento() +
                "\n}";
    }
    public String dadosDaConta() {
        return "\nConta Investimento PJ" +
                "\nCNPJ: " + get_cnpj() +
                "\nRaz??o Social: " + get_razaoSocial() +
                "\nNome Fantasia: " + get_nomeFantasia() +
                "\nData De Abertura: " + get_dataDeAbertura() +
                "\nEndere??o: " + get_endereco() +
                "\nTelefone: " + get_telefone() +
                "\nAg??ncia: " + get_agencia() +
                "\nOpera??ao: " + get_operacao() +
                "\nN?? da Conta: " + get_numConta() +
                "\nSaldo: " + get_saldo();
    }

    public void mostrarDados(){
        System.out.println(dadosDaConta());
    }

    //------------------------------ METODOS ---------------------------------------
    //------------------------ ABRIR CONTA --------------------------

    public void abrirContaEmpresarial() {
        perguntas();
        System.out.println("Digite o valor do dep??sito inicial:");
        _saldo = input.nextDouble();
    }
    //------------------------ CONSULTAR SALDO --------------------------
    public void consultarSaldoVoid() {
        System.out.printf("%s - O saldo atual da Conta Corrente PJ N?? %s ??: R$%.2f\n",
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
            set_saldo(get_saldo() - creditoValor - (creditoValor * 0.0145));
        }
        return creditoValor;
    }

    public void calcularCreditoVoid(double creditoValor) {

        if (get_saldo() < 0 || creditoValor > get_saldo()) {
            System.out.println("N??O AUTORIZADO. Voc?? n??o tem saldo suficiente para Pagar no Credito");
        } else {
            set_saldo(get_saldo() - creditoValor - (creditoValor * 0.0145));
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
            set_saldo(get_saldo() - saqueValor -(saqueValor * 0.005));
            System.out.printf("\nO saque no valor de R$%.2f foi realizado com sucesso.\n", saqueValor);
            consultarSaldoVoid();
        }
        return saqueValor;
    }

    public void calcularSaqueVoid(double saqueValor) {
        if (get_saldo() < 0 || saqueValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Sacar");
        } else {
            set_saldo(get_saldo() - saqueValor -(saqueValor * 0.005));
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
            set_saldo(get_saldo() - transferenciaValor - (transferenciaValor * 0.0005));
            consultarSaldoVoid();
        }
        return transferenciaValor;
    }

    public void transferirValorVoid(double transferenciaValor) {
        if (get_saldo() < 0 || transferenciaValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Transferir");
        } else {
            set_saldo(get_saldo() - transferenciaValor - (transferenciaValor * 0.0005));
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
            CIPJ.set_saldo(CIPJ.get_saldo() + investimentoValor+ (investimentoValor * 0.02));
            System.out.printf("\nO investimento de R$%.2f foi realizado com sucesso.\n" +
                    "O n??mero da sua Conta Investimento ??: %s\n", investimentoValor, CIPJ.get_numConta());
            CIPJ.consultarSaldoVoid();
            consultarSaldoVoid();
        }
        return investimentoValor;
    }
    public void investirValorVoid(double investimentoValor) {

        if (get_saldo() < 0 || investimentoValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Investir");
        } else {

            set_saldo(get_saldo() - investimentoValor);
            CIPJ.set_saldo(CIPJ.get_saldo() + investimentoValor+ (investimentoValor * 0.02));
            System.out.printf("\nO investimento de R$%.2f foi realizado com sucesso.\n" +
                    "O n??mero da sua Conta Investimento PJ ??: %s\n", investimentoValor, CIPJ.get_numConta());
            set_contaInvestimento(CIPJ.get_saldo());
            CIPJ.consultarSaldoVoid();
            consultarSaldoVoid();
        }
    }

    //-------------------------------- AJUSTAR ERROS ----------------------------------------------------
    public void mostrarOperacoes() {
        //------------------------------- OPERA????ES CONTA ----------------------------------
        System.out.println("\n------------------------------------------------------");
        System.out.printf("  Nome: %s          CONTA EMPRESARIAL   \n", get_razaoSocial());
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
        sair = false;
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
