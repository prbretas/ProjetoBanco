package ProjectModulo2;

import java.util.Date;

public class ContaEmpresarial extends PessoaJuridica {

    private Date _dataAtual = new Date();
    private String _numConta;
    final private String _operacao = "058";
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


    public ContaEmpresarial(String cnpj, String razaoSocial, String nomeFantasia, String dataDeAbertura,
                            String endereco, String telefone, String numConta, double saldo) {
        super(cnpj, razaoSocial, nomeFantasia, dataDeAbertura, endereco, telefone);

        this._numConta = numConta;
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
                "\noperaçao: " + get_operacao() +
                "\nnumConta: " + get_numConta() +
                "\nsaldo: " + get_saldo() +
                "\n}";
    }


    //------------------------------ METODOS ---------------------------------------
    // VOID
    public void consultarSaldoVoid() {
        System.out.printf("%s - O saldo atual da conta Nº %s é: R$%.2f\n", getDataAtual(), get_numConta(), get_saldo());
    }

    public double consultarSaldo() {
        return get_saldo();
    }



    public double calcularCredito(double creditoValor) {
        set_saldo(creditoValor + get_saldo());
        return creditoValor;
    }

    public void calcularCreditoVoid(double creditoValor) {
        set_saldo(creditoValor + get_saldo());
        System.out.printf("\nO crédito de R$%.2f foi realizado com sucesso.\n", creditoValor);
        consultarSaldoVoid();
    }



    public double calcularDebito(double debitoValor) {
        set_saldo(get_saldo() - debitoValor - (0.005 * debitoValor));
        return debitoValor;
    }

    public void calcularDebitoVoid(double debitoValor) {
        if (get_saldo() < 0 || debitoValor > get_saldo()) {
            System.out.println("Você não tem saldo suficiente");
        } else {
            set_saldo(get_saldo() - debitoValor - (0.005 * debitoValor));
            System.out.printf("\nO débito de R$%.2f foi realizado com sucesso.\n", debitoValor);
            consultarSaldoVoid();
        }
    }



    public double calcularSaque(double saqueValor) {
        set_saldo(get_saldo() - saqueValor - (0.005 * saqueValor));
        return saqueValor;
    }

    public void calcularSaqueVoid(double saqueValor) {
        if (get_saldo() < 0 || saqueValor > get_saldo()) {
            System.out.println("Você não tem saldo suficiente");
        } else {
            set_saldo(get_saldo() - saqueValor - (0.005 * saqueValor));
            System.out.printf("\nO saque de R$%.2f foi realizado com sucesso.\n", saqueValor);
            consultarSaldoVoid();
        }
    }

    //------------------------ TERMINAR AS FUNÇÕES --------------------------

    public void abrirConta() {

    }


    public double depositar(double depositoValor) {
        set_saldo(depositoValor + get_saldo());
        return depositoValor;
    }

    public void depositarVoid(double depositoValor) {
        set_saldo(depositoValor + get_saldo());
        System.out.printf("\nO depósito de R$%.2f foi realizado com sucesso.\n", depositoValor);
        consultarSaldoVoid();
    }


    public double transferirValor(double transferenciaValor) {
        set_saldo(get_saldo() - transferenciaValor - (0.005 * transferenciaValor));
        return transferenciaValor;
    }

    public void transferirValorVoid(double transferenciaValor) {
        if (get_saldo() < 0 || transferenciaValor > get_saldo()) {
            System.out.println("Você não tem saldo suficiente");
        } else {
            set_saldo(get_saldo() - transferenciaValor - (0.005 * transferenciaValor));
            System.out.printf("\nA transferência de R$%.2f foi realizado com sucesso.\n", transferenciaValor);
            consultarSaldoVoid();
        }
    }

    public double investirValor(double investirValor) {
        set_saldo(investirValor + get_saldo());
        return investirValor;
    }

    public void investirValorVoid(double investimentoValor) {
        set_saldo(investimentoValor + get_saldo());
        System.out.printf("\nO investimento de R$%.2f foi realizado com sucesso.\n", investimentoValor);
        consultarSaldoVoid();
    }

}
