package Segundos_ejercicios;

import java.util.Scanner;

/* Escribe un programa que lea un número entero desde el teclado y 
 * determine si es par o impar. Muestra un mensaje indicando el resultado.
 * Sentencias usadas: if, else.
 */

public class act1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer datos por teclado

		System.out.println("Introduce un numero: "); // Pedir al usuario que ingrese un numero

		int numero = scanner.nextInt(); // Lee una línea completa de texto

		scanner.close(); // Cerrar el escáner

		if (numero % 2 == 0) {

			System.out.println("Su numero es par");

		} else {

			System.out.println("Su numero es impar");
		}

	}

}
