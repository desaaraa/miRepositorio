package Segundos_ejercicios;
import java.util.Scanner;

/*Escribe un programa que lea tres números enteros e 
 * imprima cuál de ellos es el mayor. Si todos son iguales, 
 * imprime un mensaje indicándolo.
 * Sentencias usadas: if, else if, else.
 */


public class act2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);                			// Crear un objeto Scanner para leer datos por teclado
		
        	System.out.println("Introduce el primer numero: ");		    	// Pedir al usuario que ingrese un numero
        
        int num1 = scanner.nextInt();  					   			 		// Lee un texto
        
        	System.out.println("Introduce el segundo numero: ");
        
        int num2 = scanner.nextInt(); 
        
        	System.out.println("Introduce el tercer numero: ");
        
        int num3 = scanner.nextInt();
        
        scanner.close(); 	
        
        
        if (num1 == num2 && num2 == num3) {
        	
            System.out.println("Los tres números son iguales.");
        
        }else if (num1>num2 && num1>num3) {
        	
        	System.out.println("El numero "+ num1+ " es el mayor de todos");
        	
        }else if (num2>num1 && num2>num3) {
        	
        	System.out.println("El numero "+ num2+ " es el mayor de todos");
        	
        }else {
        
        	System.out.println("El numero "+ num3+ " es el mayor de todos");
        	
       
        }
        
	}

}
