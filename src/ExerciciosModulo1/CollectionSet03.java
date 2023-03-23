package ExerciciosModulo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numero = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			System.out.print("");
			numero.add(leia.nextInt());
		}
		
		Iterator<Integer> contagemElementos=numero.iterator();
		
		while(contagemElementos.hasNext()) {
			System.out.println(contagemElementos.next());
		}
			
	}

}
