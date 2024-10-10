package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario 10 números y luego calcule
 *  la suma de los números pares y la suma de los números impares por separado.
 */

public class ej9_sumaParesEimPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sumaPar = 0;
		int sumaImpar = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Introduzca el " + i + " numero: ");

			int numero = sc.nextInt();

			if (numero % 2 == 0) {

				sumaPar = sumaPar + numero;
			} else {
				sumaImpar = sumaImpar + numero;

			}
		}

		System.out.println("La suma de numeros pares = " + sumaPar);
		System.out.println("La suma de numeros impares = " + sumaPar);

		sc.close();
	}

}
