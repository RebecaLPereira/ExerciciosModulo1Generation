package ExerciciosModulo1;

import java.util.Scanner;
import java.util.Stack;

public class PilhaVetor {
    public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
     char opcao;

     Stack<String> pilha = new Stack<>();
     do {
         System.out.println("1 - Adicionar um novo Cliente na fila\n" +
                 "2 - Listar todos os Clientes\n" +
                 "3 - Retirar cliente da fila\n" +
                 "0 - Sair");
         opcao = leia.next().charAt(0);

         switch (opcao) {
             case '1':
                 System.out.println("Adicionar um novo livro na pilha");
                 pilha.push(leia.next());
                 break;
             case '2':
                 if (pilha.size() == 0) {
                     System.out.println("A fila está vazia");
                 } else {
                     System.out.println(pilha);
                 }
                 break;
             case '3':
                 if (pilha.isEmpty()) {
                     System.out.println("A fila já está vazia");
                 } else {
                     System.out.println(pilha.pop());
                 }
                 break;
             case '0':
                 System.out.println("Programa Finalizado!");
                 break;
             default:
                 System.out.println("Opção invalida");
                 break;
         }
     }while (opcao!='0');
    }
}
