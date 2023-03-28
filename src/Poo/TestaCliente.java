package Poo;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente maria = new Cliente("Maria","11951755739",20,100.00,true);
        Cliente joao = new Cliente("João","11973564732",32,200.00,false);

        System.out.println(maria.visualizar());
        System.out.println(joao.visualizar());
    }
}
