package ExerciciosModulo1;

import java.util.Scanner;

public class VariaveisOperadores01 {

	public static void main(String[] args) {
		
		float abono,salario,salarioAtualizado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário Atual: R$ ");
		salario = leia.nextFloat();
		System.out.print("Abono: R$ ");
		abono = leia.nextFloat();
		
		salarioAtualizado = salario+abono;
		System.out.print("Valor do Salário atualizado: R$ "+salario);
	}
}
