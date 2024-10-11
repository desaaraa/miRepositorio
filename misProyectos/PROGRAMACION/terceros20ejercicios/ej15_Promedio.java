package terceros20ejercicios;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario una 
 * cantidad de números N y luego pida que introduzca 
 * esos N números. Al final, el programa debe mostrar el
 * promedio de esos números.
 */

public class ej15_Promedio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos numeros quiere introducir?: ");

		int cantidad = sc.nextInt();
		double suma = 0;
		int i = 0;

		for (i = 1; i <= cantidad; i++) {
			System.out.println("Introduzca el numero " + i);
			int numero = sc.nextInt();
			suma = suma + numero;

		}

		double media = suma / cantidad;
		System.out.println(" La media de los numeros introducidos es : " + media);

		sc.close();
	}

}
