package Projeto2Scanner.ProjectModulo2;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ContaPoupanca extends PessoaFisica {
    Scanner input = new Scanner(System.in);
    Random randomId = new Random();
    boolean sair;

    // GERAR NUMERO ALEATORIO PARA A CONTA
    int numeroContaAleatorio = randomId.nextInt(999999);
    private int idConta = randomId.nextInt(10);
    private String _numConta = String.valueOf(numeroContaAleatorio) + "-" + idConta;

    private Date _dataAtual = new Date();

    final private String _operacao = "013";
    final private String _agencia = "145";
    private double _saldo;

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


    //--------------------------- CONSTRUCTOR ------------------------------------------------
    public ContaPoupanca(String nome, String sobrenome, String cpf, String documento, String dataDeNascimento,
                         String endereco, String telefone, double saldo) {
        super(nome, sobrenome, cpf, documento, dataDeNascimento, endereco, telefone);

        this._saldo = saldo;
    }

    public ContaPoupanca() {

    }

    //---------------------------- TO STRING ---------------------------------------
    @Override
    public String toString() {
        return "\nContaPoupanca {" +
                "\nnome: " + get_nome() +
                "\nsobrenome:" + get_sobrenome() +
                "\ncpf: " + get_cpf() +
                "\ndocumento: " + get_documento() +
                "\ndataDeNascimento: " + get_dataDeNascimento() +
                "\nendereco: " + get_endereco() +
                "\ntelefone: " + get_telefone() +
                "\nagencia: " + get_agencia() +
                "\nopera??ao: " + get_operacao() +
                "\nnumConta: " + get_numConta() +
                "\nsaldo: " + get_saldo() +
                "\n}";
    }



    public String dadosDaConta() {
        return "\nConta Poupan??a" +
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
                "\nSaldo: " + get_saldo() ;
    }


    public void mostrarDados(){
        System.out.println(dadosDaConta());
    }

    //------------------------------ METODOS ---------------------------------------
    //------------------------ ABRIR CONTA --------------------------

    public void abrirContaPoupanca() {
        perguntas();
        System.out.println("Digite o valor do dep??sito inicial:");
        _saldo = input.nextDouble();
    }


    //------------------------ CONSULTAR SALDO --------------------------

    public void consultarSaldoVoid() {
        System.out.printf("%s - O saldo atual da Conta Poupan??a N?? %s ??: R$%.2f\n",
                getDataAtual(), get_numConta(), get_saldo());
    }

    public double consultarSaldo() {
        return get_saldo();
    }

//------------------------ CARTAO DE DEBITO --------------------------

    public double calcularDebito(double debitoValor) {
        if (get_saldo() < 0 || debitoValor > get_saldo()) {
            System.out.println("N??O AUTORIZADO. Voc?? n??o tem saldo suficiente para Pagar no Debito");
        } else {
            set_saldo(get_saldo() - debitoValor);
            System.out.printf("\nO d??bito de R$%.2f foi realizado com sucesso.\n", debitoValor);
            consultarSaldoVoid();
        }
        return debitoValor;
    }

    public void calcularDebitoVoid(double debitoValor) {
        if (get_saldo() < 0 || debitoValor > get_saldo()) {
            System.out.println("N??O AUTORIZADO. Voc?? n??o tem saldo suficiente para Pagar no Debito");
        } else {
            set_saldo(get_saldo() - debitoValor);
            System.out.printf("\nO d??bito de R$%.2f foi realizado com sucesso.\n", debitoValor);
            consultarSaldoVoid();
        }
    }

    //------------------------ FUNCAO SAQUE --------------------------
    public double calcularSaque(double saqueValor) {
        if (get_saldo() < 0 || saqueValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Sacar");
        } else {
            set_saldo(get_saldo() - saqueValor);
            System.out.printf("\nO d??bito de R$%.2f foi realizado com sucesso.\n", saqueValor);
            consultarSaldoVoid();
        }
        return saqueValor;
    }

    public void calcularSaqueVoid(double saqueValor) {
        if (get_saldo() < 0 || saqueValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Sacar");
        } else {
            set_saldo(get_saldo() - saqueValor);
            System.out.printf("\nO d??bito de R$%.2f foi realizado com sucesso.\n", saqueValor);
            consultarSaldoVoid();
        }
    }

//------------------------ DEPOSITAR --------------------------


    public double depositar(double depositoValor) {
        set_saldo(depositoValor + get_saldo());
        return depositoValor;
    }

    public void depositarVoid(double depositoValor) {
        set_saldo(depositoValor + get_saldo());
        System.out.printf("\nO dep??sito de R$%.2f foi realizado com sucesso.\n", depositoValor);
        consultarSaldoVoid();
    }

    //------------------------ TRANSFERIR --------------------------
    public double transferirValor(double transferenciaValor) {
        if (get_saldo() < 0 || transferenciaValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Transferir");
        } else {
            set_saldo(get_saldo() - transferenciaValor);
            System.out.printf("\nA transfer??ncia de R$%.2f foi realizado com sucesso.\n", transferenciaValor);
            consultarSaldoVoid();
        }
        return transferenciaValor;
    }

    public void transferirValorVoid(double transferenciaValor) {
        if (get_saldo() < 0 || transferenciaValor > get_saldo()) {
            System.out.println("Voc?? n??o tem saldo suficiente para Transferir");
        } else {
            set_saldo(get_saldo() - transferenciaValor);
            System.out.printf("\nA transfer??ncia de R$%.2f foi realizado com sucesso.\n", transferenciaValor);
            consultarSaldoVoid();
        }
    }


    //-------------------------------- AJUSTAR ERROS ----------------------------------------------------
    public void mostrarOperacoes() {
        //------------------------------- OPERA????ES CONTA ----------------------------------
        System.out.println("\n------------------------------------------------------");
        System.out.printf("  Nome: %s %s         CONTA POUPAN??A     \n", get_nome(), get_sobrenome());
        System.out.printf("  Saldo: R$%.2f                             \n", get_saldo());
        System.out.printf("  Ag??ncia: %s    Op: %s     N?? da Conta: %s            \n", get_agencia(), get_operacao(), get_numConta());
        System.out.println("-------------------------------------------------------");
        System.out.println("|          Qual opera????o voc?? deseja fazer?           |");
        System.out.println("-------------------------------------------------------");
        System.out.println("|                1 - Saque                            |");
        System.out.println("|                2 - Deposito                         |");
        System.out.println("|                3 - Transfer??ncia                    |");
        System.out.println("|                4 - Ver Saldo                        |");
        System.out.println("|                5 - Meus Dados                       |");
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
                        System.out.println("Voc?? selecionou Consultar Saldo");
                        consultarSaldoVoid();
                        continuarPrograma();
                    }
                    case 5 -> {
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
