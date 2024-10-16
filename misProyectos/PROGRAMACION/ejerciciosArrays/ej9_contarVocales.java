package ejerciciosArrays;
/*Crea un array de caracteres que contenga una cadena. 
 * Cuenta cuántas vocales hay en el array y muestra el resultado.
 *•	Pista: Puedes usar un bucle for y un contador para contar las vocales.
*/

public class ej9_contarVocales {

	public static void main(String[] args) {

		// Crear una cadena
		String cadena = "Hola que tal, me llamo Sara";

		// Convertir cadena a array de caracteres

		char array[] = cadena.toCharArray();

		// recorrer array de caracteres

		int contador = 0;

		for (char i : array) {

			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				contador++;
			}

		}
		System.out.println("en el array de caracteres hay " + contador + " vocales");
	}

}
