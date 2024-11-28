package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que muestre un patrón de números 
 * con N filas. Por ejemplo, si N = 5, el patrón será:
 */

public class ej18_patronDeNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero de filas: ");
		int numeroFilas = sc.nextInt();

		sc.close();

		for (int cont = 1; cont <= numeroFilas; cont++) {

			for (int cont2 = 1; cont2 <= cont; cont2++) {

				System.out.print(cont);

			}
			System.out.println("");
		}

	}

}
