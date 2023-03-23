package ExerciciosModulo1;

import java.util.Scanner;

public class VariaveisOperadores02 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4;
		double media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Insira a 1° Nota: ");
		nota1 = leia.nextFloat();
		System.out.print("Insira a 2° Nota: ");
		nota2 = leia.nextFloat();
		System.out.print("Insira a 3° Nota: ");
		nota3 = leia.nextFloat();
		System.out.print("Insira a 4° Nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Média: %.2f",media);
	}
}
