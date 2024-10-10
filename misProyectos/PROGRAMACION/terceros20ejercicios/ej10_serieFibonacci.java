package terceros20ejercicios;

import java.util.Scanner;

/*Crea un programa que genere y muestre los primeros
 *  N términos de la serie de Fibonacci. El valor de N debe 
 *  ser ingresado por el usuario. La secuencia de Fibonacci es:
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class ej10_serieFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");

		int numero = sc.nextInt();

		int primerNumero = 0;
		int segundoNumero = 1;

		System.out.println(primerNumero);
		System.out.println(segundoNumero);

		for (int i = 2; i < numero; i++) {

			int suma = primerNumero + segundoNumero;

			System.out.println(suma);

			primerNumero = segundoNumero;

			segundoNumero = suma;
		}
		sc.close();
	}

}
