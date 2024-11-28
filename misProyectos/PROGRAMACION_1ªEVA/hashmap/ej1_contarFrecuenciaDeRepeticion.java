package hashmap;

import java.util.HashMap;

/*
 * Escribe un programa que cuente la frecuencia de cada palabra en 
 * un array de cadenas. Usa un HashMap donde la clave sea la palabra
 * y el valor sea la cantidad de veces que aparece.

 */

public class ej1_contarFrecuenciaDeRepeticion {

	public static void main(String[] args) {

		String animales[] = { "gato", "perro", "rana", "pajaro", "vaca", "perro", "gato", "rana" };

		HashMap<String, Integer> repeticiones = new HashMap<>();
		int contador = 0;

		for (String i : animales) {

			if (repeticiones.containsKey(i)) {
				repeticiones.put(i, repeticiones.get(i) + 1);

			} else
				repeticiones.put(i, 1);

		}
		// una forma de mostrar
		// for (String j : repeticiones.keySet()) {
		// System.out.println(j + ": " + repeticiones.get(j));

		System.out.println(repeticiones); // otra forma de mostrar
	}

}
