package ExerciciosModulo1;

import java.util.Scanner;

public class VariaveisOperadores04 {

	public static void main(String[] args) {

		float n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		n1 = leia.nextFloat();
		
		System.out.print("Número 2: ");
		n2 = leia.nextFloat();
		
		System.out.print("Número 3: ");
		n3 = leia.nextFloat();

		System.out.print("Número 4: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2)-(n3*n4);
		System.out.print("Diferença: "+diferenca);
	}
}