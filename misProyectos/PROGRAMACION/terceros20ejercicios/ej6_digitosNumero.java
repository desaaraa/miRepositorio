package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que pida al usuario un número entero y cuente cuántos
 *  dígitos tiene el número introducido. Utiliza un bucle para realizar el cálculo.
 */

public class ej6_digitosNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un numero entero: ");

		int numero = scanner.nextInt();

		scanner.close();

		int digitos = 0;

		if (numero == 0) {

			digitos = 1;

		} else {

			while (numero > 0) {

				numero = numero / 10;

				digitos++;

			}
		}

		System.out.println("El numero tiene " + digitos + " digitos");
	}

}
