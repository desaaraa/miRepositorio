package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que pida al usuario un número entero y cuente cuántos
 *  dígitos tiene el número introducido. Utiliza un bucle para realizar el cálculo.
 */

public class ej6_digitosNumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un numero entero: ");

		String numero = scanner.nextLine();

		scanner.close();

	}

}
