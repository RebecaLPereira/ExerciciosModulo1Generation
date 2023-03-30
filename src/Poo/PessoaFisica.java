package Poo;

public class PessoaFisica extends Cliente{
    private String CPF;

    public PessoaFisica(String CPF, String nome, String telefone, int idade, double valorConta, boolean acompanhado) {
        super(nome, telefone, idade, valorConta, acompanhado);
        this.CPF=CPF;


    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String visualizar(){
        return "CPF = "+CPF+", Nome = "+getNome()+", Telefone = "+getTelefone()+", Idade = "+getIdade()+", Valor da Conta = "+getValorConta()+", Acompanhado = "+isAcompanhado();

    }
}
