package ejercicios_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Crea un programa que pida al usuario que ingrese un
 *  número positivo. Si el usuario ingresa un número negativo
 *  o no numérico, debes lanzar y manejar una excepción que 
 *  imprima un mensaje de error adecuado.
 */

public class ej1_ExcepcionNumeroNegativo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Por favor, ingrese un número positivo: ");

			int numero = scanner.nextInt();

			if (numero < 0) {
				throw new IllegalArgumentException("El número no puede ser negativo.");
			} else
				System.out.println("Ha ingresado el número: " + numero);

		} catch (InputMismatchException e) {
			System.out.println("Debe introducir un numero, no caracteres");
		}

		scanner.close();
	}

}
