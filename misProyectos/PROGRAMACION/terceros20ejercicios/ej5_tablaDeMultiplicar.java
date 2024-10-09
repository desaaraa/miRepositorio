package terceros20ejercicios;

import java.util.Scanner;

/*Crea un programa que pida al usuario un número entero
 *  y muestre su tabla de multiplicar del 1 al 10.
 */

public class ej5_tablaDeMultiplicar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un numero entero: ");

		int numero = scanner.nextInt();

		scanner.close();

		for (int cont = 1; cont <= 10; cont++) {

			int resultado = numero * cont;
			System.out.println(numero + " X " + cont + " = " + resultado);

		}

	}

}
