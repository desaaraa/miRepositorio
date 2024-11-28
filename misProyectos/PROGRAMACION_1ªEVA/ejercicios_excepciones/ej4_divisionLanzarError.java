package ejercicios_excepciones;

import java.util.Scanner;

/*Crea un método que reciba dos números y devuelva el resultado 
 * de su división. Si el denominador es cero, lanza una excepción. 
 * En el método main, maneja la excepción y muestra un mensaje adecuado
 * sin que el programa se detenga.
 */

public class ej4_divisionLanzarError {

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
		}
	}

}
