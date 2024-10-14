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

		char A = 'a';
		char E = 'e';
		char I = 'i';
		char O = 'o';
		char U = 'u';

		int largoPalabra = texto.length();

		int contador = 0;

		for (int i = 0; i <= largoPalabra - 1; i++) {

			char caracter = texto.charAt(i);

			if (i == A) {
				contador = contador + 1;
			} else if (i == E) {
				contador = contador + 1;
			}

		}
	}

}
