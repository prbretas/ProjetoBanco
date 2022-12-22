package ProjectModulo2;

import java.util.Date;

public class ContaEmpresarial  extends PessoaJuridica {

    private Date _dataAtual = new Date();
    private String _numConta;
    private String _operacao = "058";
    private String _agencia = "145";
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
    public void mostrarSaldoVoid() {
        System.out.printf("%s - O saldo atual da conta Nº %s é: R$%.2f\n", getDataAtual(), get_numConta(), get_saldo());
    }

    public double mostrarSaldo() {
        return get_saldo();
    }


    public double calcularCredito(double credito) {
        set_saldo(credito + get_saldo() - (0.005 * credito));
        return credito;
    }
    public void calcularCreditoVoid(double credito) {
        set_saldo(credito + get_saldo()- (0.005 * credito));
        System.out.printf("\nO crédito de R$%.2f foi realizado com sucesso.\n", credito);
        mostrarSaldoVoid();
    }
    public double calcularDebito(double debito) {
        set_saldo(get_saldo() - debito - (0.005 * debito));
        return debito;
    }
    public void calcularDebitoVoid(double debito) {
        if(get_saldo() < 0 || debito > get_saldo()){
            System.out.println("Você não tem saldo suficiente");
        } else {
            set_saldo(get_saldo() - debito - (0.005 * debito));
            System.out.printf("\nO débito de R$%.2f foi realizado com sucesso.\n", debito);
            mostrarSaldoVoid();
        }
    }

    public double calcularSaque(double saque){
        set_saldo(get_saldo() - saque - (0.005 * saque));
        return saque;
    }

    public void calcularSaqueVoid(double saque){
        if(get_saldo() < 0 || saque > get_saldo()){
            System.out.println("Você não tem saldo suficiente");
        } else {
            set_saldo(get_saldo() - saque - (0.005 * saque));
            System.out.printf("\nO débito de R$%.2f foi realizado com sucesso.\n", saque);
            mostrarSaldoVoid();
        }
    }

}
