package ExerciciosModulo1;

import java.util.Scanner;

public class LacoCondicionalIf03 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		nome = leia.next();
		
		System.out.print("Digite a idade do doador:");
		idade = leia.nextInt();
		
		System.out.print("Primeira doação de sangue?");
		doacao = leia.hasNext();
		
	
		}
	}


