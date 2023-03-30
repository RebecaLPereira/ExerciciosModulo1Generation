package Poo;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente maria = new Cliente("Maria","11951755739",20,100.00,true);
        Cliente joao = new Cliente("João","11973564732",32,200.00,false);

        System.out.println(maria.visualizar());
        System.out.println(joao.visualizar());

        PessoaFisica ana = new PessoaFisica("5849380583","Ana","11951755739",20,100.00,true);
        PessoaFisica caio = new PessoaFisica("3764843743","Caio","11973564732",32,200.00,false);

        System.out.println(ana.visualizar());
        System.out.println(caio.visualizar());
    }
}
