package Poo;

public class Cliente {
    private String nome;
    private String telefone;
    private int idade;
    private double valorConta;
    private boolean acompanhado;

    public Cliente(String nome, String telefone, int idade, double valorConta, boolean acompanhado){
        this.nome=nome;
        this.telefone=telefone;
        this.idade=idade;
        this.valorConta=valorConta;
        this.acompanhado=acompanhado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public boolean isAcompanhado() {
        return acompanhado;
    }

    public void setAcompanhado(boolean acompanhado) {
        this.acompanhado = acompanhado;
    }

    public String visualizar() {
        return "Nome = "+nome+", Telefone = "+telefone+", Idade = "+idade+", Valor da Conta = "+valorConta+", Acompanhado = "+acompanhado;
//        return "Cliente{" +
//                "nome='" + nome + '\'' +
//                ", telefone='" + telefone + '\'' +
//                ", idade=" + idade +
//                ", valorConta=" + valorConta +
//                ", acompanhado=" + acompanhado +
//                '}';
    }
}
