package ExerciciosModulo1;

import java.util.Scanner;

public class VariaveisOperadores03 {

	public static void main(String[] args) {

		float salarioBruto,adicionalNoturno,horaExtra,desconto,salarioLiquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.print("Hora Extra: ");
		horaExtra = leia.nextFloat();
		System.out.print("Descontos: ");
		desconto = leia.nextFloat();
		
		salarioLiquido= salarioBruto+adicionalNoturno+(horaExtra*5)-desconto;
		System.out.print("Salário Liquído: "+salarioBruto);
	}

}
