package ExerciciosModulo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionList01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		List<String> cores = new ArrayList<>();
		//LEMBRAR DE IMPORTAR JAVA.ARRAYlist-JAVA.list
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o nome da cor: ");
			cores.add(leia.next());
		}
		System.out.print("\n\n");
		System.out.print(cores+"\n");
		Collections.sort(cores);
		System.out.println(cores);
	}

}
