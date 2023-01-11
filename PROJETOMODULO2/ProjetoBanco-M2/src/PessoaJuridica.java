package Projeto2Scanner.ProjectModulo2;

import java.util.Scanner;

public abstract class PessoaJuridica {
    Scanner input = new Scanner(System.in);
    // -------------------------- ATRIBUTOS PJ -------------------------
    private String _cnpj;
    private String _razaoSocial;
    private String _nomeFantasia;
    private String _dataDeAbertura;
    private String _endereco;
    private String _telefone;

    //private String _nomeSocioProprietario;

    // -------------------------- GET E SET -------------------------
    public String get_cnpj() {
        return _cnpj;
    }

    public void set_cnpj(String cnpj) {
        this._cnpj = cnpj;
    }

    public String get_razaoSocial() {
        return _razaoSocial;
    }

    public void set_razaoSocial(String razaoSocial) {
        this._razaoSocial = razaoSocial;
    }

    public String get_nomeFantasia() {
        return _nomeFantasia;
    }

    public void set_nomeFantasia(String nomeFantasia) {
        this._nomeFantasia = nomeFantasia;
    }

    public String get_dataDeAbertura() {
        return _dataDeAbertura;
    }

    public void set_dataDeAbertura(String dataDeAbertura) {
        this._dataDeAbertura = dataDeAbertura;
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

//    public String get_nomeSocioProprietario() {
//        return _nomeSocioProprietario;
//    }
//
//    public void set_nomeSocioProprietario(String nomeSocioProprietario) {
//        this._nomeSocioProprietario = nomeSocioProprietario;
//    }

    // ------------------------- CONSTRUCTOR ---------------------------


    public PessoaJuridica(String cnpj, String razaoSocial, String nomeFantasia,
                          String dataDeAbertura, String endereco, String telefone) {
        this._cnpj = cnpj;
        this._razaoSocial = razaoSocial;
        this._nomeFantasia = nomeFantasia;
        this._dataDeAbertura = dataDeAbertura;
        this._endereco = endereco;
        this._telefone = telefone;
    }

    public PessoaJuridica() {
    }

    //---------------------------------- TO STRING ---------------------------------
    @Override
    public String toString() {
        return "\nPessoaJurídica: {" +
                "\ncnpj: " + get_cnpj() +
                "\nrazaoSocial: " + get_razaoSocial() +
                "\nnomeFantasia: " + get_nomeFantasia() +
                "\ndataDeAbertura: " + get_dataDeAbertura() +
                "\nendereco: " + get_endereco() +
                "\ntelefone: " + get_telefone() +
                "\n}";
    }

    // ----------------------- METODOS -----------------------------------------
    public void imprimirDadosPJNaTela() {
        System.out.println(toString());
    }


    public void perguntas(){
        System.out.println("Digite o CNPJ da sua empresa:");
        _cnpj = input.next();
        System.out.println("Digite a Razão Social:");
        _razaoSocial = input.next();
        System.out.println("Digite o nome Fantasia:");
        _nomeFantasia = input.next();
        System.out.println("Digite a Data de Abertura da sua empresa:");
        _dataDeAbertura = input.next();
        System.out.println("Digite o Endereço da sua empresa:");
        _endereco = input.next();
        System.out.println("Digite o Telefone da sua empresa:");
        _telefone = input.next();
    }

}
