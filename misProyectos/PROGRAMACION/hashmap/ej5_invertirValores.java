package hashmap;

import java.util.HashMap;

/*Escribe un programa que invierta las claves y los valores de un HashMap. 
 * Es decir, los valores se convertirán en claves y las claves se convertirán en valores.
 */

public class ej5_invertirValores {

	public static void main(String[] args) {

		HashMap<String, Integer> sinInvertir = new HashMap<>();
		HashMap<Integer, String> invertido = new HashMap<>();

		sinInvertir.put("Juan", 20);
		sinInvertir.put("Maria", 25);
		sinInvertir.put("Sara", 60);
		sinInvertir.put("Carlos", 40);

		System.out.println("Hashmap sin invertir: " + sinInvertir);

		for (String clave : sinInvertir.keySet()) {

			int valor = sinInvertir.get(clave);
			invertido.put(valor, clave);
		}
		System.out.println("Hashmap invertido: " + invertido);
	}

}
