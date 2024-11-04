package hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*Escribe un programa que elimine todos los elementos 
 * de un HashMap donde el valor sea menor a un número dado.
 */

public class ej4_EliminarElementos {

	public static void main(String[] args) {

		HashMap<String, Integer> fruta = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		fruta.put("manzana", 5);
		fruta.put("banana", 2);
		fruta.put("naranja", 3);
		fruta.put("pera", 1);
		fruta.put("melon", 9);
		fruta.put("sandia", 7);

		System.out.println(fruta);
		System.out.println("¿Eliminar valores menor a qué número:?");
		int numero = sc.nextInt();

		// Eliminar elementos donde el valor es menor que el número dado
		fruta.entrySet().removeIf(entry -> entry.getValue() < numero);

		// Mostrar el HashMap después de la eliminación
		System.out.println(fruta);

		sc.close();
	}

}
