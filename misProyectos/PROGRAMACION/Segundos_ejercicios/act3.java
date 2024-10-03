package Segundos_ejercicios;
import java.util.Scanner;

/*Escribe un programa que reciba una puntuación de 0 a 100 e imprima la calificación correspondiente según las siguientes reglas:
 * Puntuación >= 90: "A"
 * Puntuación >= 80: "B"
 * Puntuación >= 70: "C"
 * Puntuación >= 60: "D"
 * Puntuación < 60: "F"
 * Sentencias usadas: if, else if, else.
 * Sentencias usadas: if, else if, else.
 */


public class act3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);                						// Crear un objeto Scanner para leer datos por teclado
		
        	System.out.println("Introduzca una puntuacion del 0 al 100:");		    	// Pedir al usuario que ingrese un numero
        
        int puntuacion = scanner.nextInt();  
        
        scanner.close(); 
        
        
        if (puntuacion>=90) {
        	
        	System.out.println("Su puntuación "+ puntuacion+ " es igual a A");
        	
        }else if (puntuacion>=80) {
        	
        	System.out.println("Su puntuación "+ puntuacion+ " es igual a B");
        	
        }else if (puntuacion>=70) {
        	
        	System.out.println("Su puntuación "+ puntuacion+ " es igual a C");
        	
        }else if (puntuacion>=60) {
        	
        	System.out.println("Su puntuación "+ puntuacion+ " es igual a D");
        	
        }else {
        	
        	System.out.println("Su puntuación "+ puntuacion+ " es igual a F");
        	
        }
	}

}
