package ExerciciosModulo1;

import java.util.Scanner;

public class LacoCondicionalIf01 {

	public static void main(String[] args) {

		int A,B,C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		A = leia.nextInt();
		System.out.print("Digite o número B: ");
		B = leia.nextInt();
		System.out.print("Digite o número C: ");
		C = leia.nextInt();
		
		if(A+B>C) {
			System.out.print("A Soma de "+A+"+"+B+" é maior que "+C);
		}
		else if(A+B<C) {
			System.out.print("A Soma de "+A+"+"+B+" é menor que "+C);
		}
		else {
			System.out.print("A Soma de "+A+"+"+B+" é igual a "+C);
		}
	}

}
