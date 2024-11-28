package hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Crea un HashMap que contenga los nombres de estudiantes 
 * como claves y sus calificaciones como valores. Luego, escribe
 * un método que te permita buscar la calificación de un estudiante
 * dado su nombre.

 */

public class ej2_estudiantesCalificaciones {

	public static void main(String[] args) {

		HashMap<String, Integer> estudiantes = new HashMap<>();

		Scanner scanner = new Scanner(System.in);

		estudiantes.put("Juan", 90);
		estudiantes.put("Ana", 85);
		estudiantes.put("Carlos", 78);

		System.out.println(estudiantes.keySet());
		System.out.println("¿De quién quieres consultar la calificación?");
		String nombreAConsultar = scanner.nextLine();

		if (estudiantes.containsKey(nombreAConsultar)) {

			System.out.println("La nota de " + nombreAConsultar + " es: " + estudiantes.get(nombreAConsultar));
		} else {
			System.out.println("Introduce un nombre de la lista mencionada");
		}

	}

}
