package ExerciciosModulo1;

import java.util.Scanner;

public class LacoCondicionalIf02 {

	public static void main(String[] args) {

		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero%2==0 && numero>0) {
			System.out.print("O número "+numero+" é par e positivo!");
		}
		else if (numero%2!=0 && numero<0) {
			System.out.print("O número "+numero+" é ímpar e negativo!");
		}
		else if (numero%2==0 && numero<0) {
			System.out.print("O número "+numero+" é par e negativo!");
		}
		else {
			System.out.print("O número "+numero+" é ímpar e positivo!");
		}
			
	}

}
