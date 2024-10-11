package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario un
 *  número entero y, utilizando un bucle, calcule la
 *  suma de todos los dígitos de ese número. Por ejemplo,
 *  si el usuario introduce 1234, la suma será 1+2+3+4=101 + 2 + 3 + 4 = 101+2+3+4=10.
 */

public class ej12_SumaNumerosDigito {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca numero entero: ");
		int numero = sc.nextInt();
		String numeroConvertido = Integer.toString(numero);

		int largoNumero = numeroConvertido.length();
		int suma = 0;

		for (int i = 0; i <= largoNumero - 1; i++) {

			char digito = numeroConvertido.charAt(i);
			int digitoConvertido = digito - '0'; // para convertir un char a numero
			suma = suma + digitoConvertido;

		}
		System.out.println(suma);
	}

}
