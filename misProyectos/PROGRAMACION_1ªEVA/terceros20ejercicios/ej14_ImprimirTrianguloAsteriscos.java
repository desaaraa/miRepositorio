package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que pida al usuario un número 
 * entero positivo N y, utilizando un bucle, imprima un 
 * triángulo de asteriscos con N filas. Por ejemplo, si el
 * usuario introduce 5, el triángulo será:
 */

public class ej14_ImprimirTrianguloAsteriscos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero entero: ");
		int numero = sc.nextInt();
		sc.close();

		for (int cont = 1; cont <= numero; cont++) {

			for (int cont2 = 1; cont2 <= cont; cont2++) {
				System.out.print("*"); // Cambiar a print para imprimir en la misma línea
			}
			System.out.println(""); // Salto de línea al final de cada fila
		}

	}

}
