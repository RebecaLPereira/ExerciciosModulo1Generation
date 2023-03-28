package Poo;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario maria = new Funcionario("Maria","Gerente",1200.00f,true, 15);
        System.out.println(maria.visualizar());
    }
}
