package Segundos_ejercicios;
import java.util.Scanner;


/*Escribe un programa que reciba un número entero e 
 * imprima su tabla de multiplicar del 1 al 10.
 * 
 * 
 */

public class act6 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);                // Crear un objeto Scanner para leer datos por teclado
		
        	System.out.println("Introduce un numero entero: ");		 // Pedir al usuario que ingrese un numero
        
        int numero = scanner.nextInt();  					    // Lee una línea completa de texto
		
        scanner.close(); 										// Cerrar el escáner
        
        
        
        for (int cont = 1 ; cont<=10 ; cont++) {
        	
        	int resultado = numero*cont;
        	System.out.println(numero + " X " + cont + " = " + resultado);
        	
        }

	}

}
