package ExerciciosModulo1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListaVetor {

    public static void main(String[] args) {

        char opcao;
        Scanner leia = new Scanner(System.in);


        Queue<String> fila = new LinkedList<>();

        do {


            System.out.println("1 - Adicionar um novo Cliente na fila\n" +
                    "2 - Listar todos os Clientes\n" +
                    "3 - Retirar cliente da fila\n" +
                    "0 - Sair");
            opcao = leia.next().toUpperCase().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Digite o seu nome: ");
                    String nomeCliente = leia.next();
                    fila.add(nomeCliente);
                    // ou fila.add(leia.next());
                    break;
                case '2':
                    if (fila.size()==0) {
                        System.out.println("A fila está vazia");
                        break;
                    } else{
                        System.out.println(fila);
                    }
                case '3':

                    if (fila.isEmpty()){
                        System.out.println("Fila está vazia");
                    } else{
                    System.out.println(fila.remove());
                    }
                    break;
                case '0':
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while (opcao!='0');
    }
}
