package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que solicite una cadena de texto 
 * al usuario y, utilizando un bucle, cuente cuántas vocales 
 * tiene esa cadena.
 */

public class ej16_ContadorVocales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una cadena de texto: ");

		String texto = sc.nextLine();
		sc.close();

		int largoPalabra = texto.length();

		int contador = 0;

		for (int i = 0; i <= largoPalabra - 1; i++) {

			char caracter = texto.charAt(i);

			if (caracter == 'a') {
				contador = contador + 1;

			} else if (caracter == 'e') {
				contador = contador + 1;

			} else if (caracter == 'i') {
				contador = contador + 1;

			} else if (caracter == 'o') {
				contador = contador + 1;

			} else {
				if (caracter == 'u') {
					contador = contador + 1;
				}
			}

		}
		System.out.println("Su cadena tiene " + contador + " vocales");
	}
}
