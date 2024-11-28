package Segundos_ejercicios;
import java.util.Scanner;

/*  Escribe un programa que pida un número entero positivo y
 *  cuente cuántos dígitos tiene. Por ejemplo, si el número es 
 *  12345, debe imprimir que tiene 5 dígitos.
 */

public class act7 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);                	 			 // Crear un objeto Scanner para leer datos por teclado
		
    		System.out.println("Introduce un numero entero positivo: ");		 // Pedir al usuario que ingrese un numero
    
    	String numero = scanner.nextLine();  					   		 		// Lee una línea completa de texto
	
    	scanner.close(); 														// Cerrar el escáner
    	
    	int largo = numero.length();
    	
    	System.out.println("El numero " + numero + " tiene " + largo + " digitos");
    	
    	
	}

}
