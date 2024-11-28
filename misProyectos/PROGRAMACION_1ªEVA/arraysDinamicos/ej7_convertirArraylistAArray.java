package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*1.	Cree un ArrayList de enteros.
2.	Llene el ArrayList con números generados aleatoriamente entre 1 y 100 (10 números).
3.	Convierta el ArrayList en un array normal de enteros y lo imprima.
Pistas:
•	Usa el método toArray() para convertir un ArrayList en un array.
*/

public class ej7_convertirArraylistAArray {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {

			lista.add(random.nextInt(100) + 1);
		}

		Integer[] array = lista.toArray(new Integer[0]);

		for (int i : array) {
			System.out.println(i);
		}
	}

}
