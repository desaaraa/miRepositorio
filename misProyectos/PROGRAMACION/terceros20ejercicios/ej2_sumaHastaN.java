package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que solicite un número entero positivo N y 
 * calcule la suma de los primeros N números naturales (es decir, 
 * la suma de 1 hasta N).
 */

public class ej2_sumaHastaN {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero entero positivo: ");

		int numero = scanner.nextInt();

		scanner.close();

		int suma = 0;

		for (int i = 0; i <= numero; i++) {

			suma = i + suma;

		}

		System.out.println(suma);

	}

}
