public class PessoaFisica extends ContaBancaria {
    // -------------------------- ATRIBUTOS PF -------------------------
    private String _nome;
    private String _sobrenome;
    private String _cpf;
    private String _documento;
    private String _dataDeNascimento;
    private String _endereco;
    private String _telefone;

    // -------------------------- GET E SET -------------------------
    public String get_nome() {
        return _nome;
    }

    public void set_nome(String nome) {
        this._nome = nome;
    }

    public String get_sobrenome() {
        return _sobrenome;
    }

    public void set_sobrenome(String sobrenome) {
        this._sobrenome = sobrenome;
    }

    public String get_cpf() {
        return _cpf;
    }

    public void set_cpf(String cpf) {
        this._cpf = cpf;
    }

    public String get_documento() {
        return _documento;
    }

    public void set_documento(String documento) {
        this._documento = documento;
    }

    public String get_dataDeNascimento() {
        return _dataDeNascimento;
    }

    public void set_dataDeNascimento(String dataDeNascimento) {
        this._dataDeNascimento = dataDeNascimento;
    }

    public String get_endereco() {
        return _endereco;
    }

    public void set_endereco(String endereco) {
        this._endereco = endereco;
    }

    public String get_telefone() {
        return _telefone;
    }

    public void set_telefone(String telefone) {
        this._telefone = telefone;
    }

    // ------------------------- CONSTRUCTOR ---------------------------

    public PessoaFisica(String numConta, double saldo, String nome, String sobrenome,
                        String cpf, String documento, String dataDeNascimento, String endereco, String telefone) {
        super(numConta, saldo);
        this._nome = nome;
        this._sobrenome = sobrenome;
        this._cpf = cpf;
        this._documento = documento;
        this._dataDeNascimento = dataDeNascimento;
        this._endereco = endereco;
        this._telefone = telefone;
    }

    public PessoaFisica() {

    }

    //---------------------------------- TO STRING ---------------------------------
    @Override
    public String toString() {
        return "\nPessoaFisica: {" +
                "\nnome: " + get_nome() +
                "\nsobrenome:" + get_sobrenome() +
                "\ncpf: " + get_cpf() +
                "\ndocumento: " + get_documento() +
                "\ndataDeNascimento: " + get_dataDeNascimento() +
                "\nendereco: " + get_endereco() +
                "\ntelefone: " + get_telefone() +
                "\nagencia: " + get_agencia() +
                "\noperaçao: " + get_operacao() +
                "\nnumConta: " + get_numConta() +
                "\nsaldo: " + get_saldo() +
                "\n}";
    }

    // ----------------------- METODOS -----------------------------------------
    public void imprimirDadosPFNaTela() {
        System.out.println(toString());
    }


}
