package ejerciciosArrays;

import java.util.HashSet;

/*Crea un array de 10 números enteros. Escribe 
 * un programa que imprima todos los números que 
 * están repetidos en el array.
 * •Pista: Puedes usar un segundo array o un conjunto 
 * (HashSet) para almacenar los números que ya has visto.
 */

public class ej5_comprobarNumeroRepetido {

	public static void main(String[] args) {

		int numeros[] = { 1, 4, 6, 9, 4, 5, 2, 7, 5, 2 };

		HashSet<Integer> repetidos = new HashSet<>();
		HashSet<Integer> noRepetidos = new HashSet<>();

		for (int i : numeros) {
			if (!noRepetidos.add(i)) {
				repetidos.add(i);
			}
		}

		System.out.println("Los números que hay repetidos son: " + repetidos);
	}

}
