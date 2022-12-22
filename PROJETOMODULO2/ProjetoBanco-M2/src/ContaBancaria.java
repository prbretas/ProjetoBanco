package ProjectModulo2;


import java.util.Date;

public abstract class ContaBancaria {
    private Date _dataAtual = new Date();
    private String _numConta;
    private String _operacao = "001";
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
    public ContaBancaria(String numConta, double saldo) {
        this._numConta = numConta;
        this._saldo = saldo;
    }

    public ContaBancaria() {

    }

    //---------------------------- TO STRING ---------------------------------------
    @Override
    public String toString() {
        return "\nContaBancaria {" +
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
        set_saldo(credito + get_saldo());
        return credito;
    }

    public void calcularCreditoVoid(double credito) {
        set_saldo(credito + get_saldo());
        System.out.println("\nO crédito foi realizado com sucesso.");
        System.out.printf("O crédito foi de R$%.2f.\n", credito);
        mostrarSaldoVoid();
    }

    public double calcularDebito(double debito) {
        set_saldo(get_saldo()-debito);
        return debito;
    }

    public void calcularDebitoVoid(double debito) {
        set_saldo(get_saldo()-debito);
        System.out.println("\nO débito foi realizado com sucesso.");
        System.out.printf("O débito foi de R$%.2f.\n", debito);
        mostrarSaldoVoid();

    }

//
//    if(get_saldo() <= 0){
//        _saldo = 0;
//        System.out.println("Você não tem saldo suficiente");
//    } else{
//
//    }


}
