package ejercicios_excepciones;

import java.util.Scanner;

import exceptions.EdadInvalidaException;

/*Implementa una excepción personalizada llamada EdadInvalidaException 
 * que se lance si se intenta establecer una edad negativa en una clase Persona.
 *  Crea un método que permita establecer la edad y maneje la excepción en el main.
 */

public class ej2_excepcionPersonalizada {

	public static void main(String[] args) throws EdadInvalidaException {
		
		Scanner scanner = new Scanner(System.in);

			System.out.println("Introduzca su edad: ");
			int edad = scanner.nextInt();
			
		if (edad<0) {
			throw new EdadInvalidaException ();
		}else System.out.println("La edad introducida ha sido "+ edad);

	}

}
