package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que pida al usuario un número entero 
 * positivo y calcule su factorial utilizando un bucle.
 */

public class ej4_factorialDeUnNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un numero entero positivo: ");

		int numero = scanner.nextInt();

		scanner.close();

		int factorial = 1;

		for (int i = 1; i <= numero; i++) {

			factorial = factorial * i;
		}

		System.out.println(factorial);
	}

}
