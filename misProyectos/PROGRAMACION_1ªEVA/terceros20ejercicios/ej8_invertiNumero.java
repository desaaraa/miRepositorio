package terceros20ejercicios;

import java.util.Scanner;

/*Crea un programa que solicite un número entero y,
 *  utilizando un bucle, invierta el número (es decir,
 *   si el número es 1234, debe mostrar 4321).
 */

public class ej8_invertiNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");

		int numero = sc.nextInt();

		sc.close();

		String numeroEnString = Integer.toString(numero);

		String numeroInvertido = "";

		for (int i = numeroEnString.length() - 1; i >= 0; i--) {

			char digito = numeroEnString.charAt(i);
			numeroInvertido = numeroInvertido + digito;

		}

		System.out.println(numeroInvertido);
	}

}
