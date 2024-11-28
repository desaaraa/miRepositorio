package terceros20ejercicios;

import java.util.Scanner;
/*Escribe un programa que solicite dos números enteros A y B,
 *  y calcule la suma de todos los números entre A y B, incluyendo ambos.
 */

public class ej17_sumaEntreDosValores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("introduzca el primer numero: ");
		int numero1 = sc.nextInt();

		System.out.println("introduzca el segundo numero: ");
		int numero2 = sc.nextInt();

		sc.close();

		int suma = 0;

		for (int i = numero1; i <= numero2; i++) {

			suma = suma + i;
		}
		System.out.println(
				"El resultado de la suma entre los numeros " + numero1 + " y " + numero2 + " es igual a " + suma);
	}

}
