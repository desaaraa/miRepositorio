package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 * Escribe un programa que reciba una lista de números y 
 * determine si hay algún número que se repita. Usa un HashMap 
 * para almacenar los números y su frecuencia de aparición.
 */

public class ej3_numerosRepetidos {

	public static void main(String[] args) {

		HashMap<Integer, Integer> mapa = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();

		int numero = 0;

		do {

			System.out.println("Introduzca un numero: ");
			System.out.println("Cuando quiera acabar escriba 000");
			numero = sc.nextInt();

			if (numero != 000) {
				lista.add(numero);
			}

		} while (numero != 000);

		System.out.println(lista);

		for (int i : lista) {

			if (mapa.containsKey(i)) {
				mapa.put(i, mapa.get(i) + 1);

			} else
				mapa.put(i, 1);
		}
		
		boolean hayRepetidos = false;
		for (Integer j : mapa.keySet()) {
			if (mapa.get(j) > 1) {
				System.out.println("El número " + j + " se repite " + mapa.get(j) + " veces.");
				hayRepetidos = true;
			}

		}
		if (!hayRepetidos) {
			System.out.println("No hay números repetidos.");
		}
		sc.close();
	}

}
