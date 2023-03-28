package Poo;

public class Funcionario {
    private String nomeFuncionario;
    private String cargo;
    private float salario;
    private boolean CLT;
    private int tempoServico;

    public Funcionario(String nomeFuncionario, String cargo, float salario, boolean CLT, int tempoServico) {
        this.nomeFuncionario = nomeFuncionario;
        this.cargo = cargo;
        this.salario = salario;
        this.CLT = CLT;
        this.tempoServico = tempoServico;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public boolean isCLT() {
        return CLT;
    }

    public void setCLT(boolean CLT) {
        this.CLT = CLT;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
    public String visualizar(){
        return "Nome = "+nomeFuncionario+", Cargo = "+cargo+", Salário = "+salario+", Carteira Assinada = "+CLT+", Tempo de Serviço = "+tempoServico;
    }
}
