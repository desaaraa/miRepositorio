package ejercicios_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Desarrolla un programa que solicite al usuario dos números y realice una división. 
 * Maneja las excepciones InputMismatchException y ArithmeticException, mostrando 
 * mensajes de error específicos para cada caso y evitando que el programa se detenga 
 * por errores de entrada.
 */

public class ej5_multiplesExcepciones {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		try {
		
		System.out.println("Introduce el dividendo: ");
		int dividendo = scanner.nextInt();

		System.out.println("Introduce el divisor: ");
		int divisor = scanner.nextInt();

		double division= dividendo/divisor;
		
		System.out.println(division);
		
		}catch (ArithmeticException e) {
			System.out.println("Escribe un divisor que no sea 0");
		}catch (InputMismatchException e) {
			System.out.println("Debe introducir un numero, no caracteres");

		}

	}

}
