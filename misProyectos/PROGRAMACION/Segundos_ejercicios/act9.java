package Segundos_ejercicios;
import java.util.Random;
import java.util.Scanner;

/*Escribe un programa que genere un número aleatorio entre 1 y 100. 
 * Luego, el usuario debe intentar adivinar el número. El programa 
 * debe decir si el número introducido es mayor, menor o igual al número
 *  aleatorio, y repetirse hasta que el usuario adivine correctamente.
 *  Sentencias usadas: while, if.
 */


public class act9 {

	public static void main(String[] args) {
		
		
		Random random = new Random(); 							// Crear una instancia de la clase Random
		int numeroAleatorio = random.nextInt(100) + 1;			// Generar un número aleatorio entre 1 y 100 iniciando en 1, si no lo pones empieza en 0
		
		
		
		Scanner scanner = new Scanner(System.in);                				// Crear un objeto Scanner para leer datos por teclado
		int numero=0;

		
         													
		while (numero != numeroAleatorio) {
			
				System.out.println("Adivina el numero entre 1 y 100: ");
				numero = scanner.nextInt();
		
			

			if (numero < numeroAleatorio) {
			
				System.out.println("El numero a adivinar es mas mayor que el numero introducido");
			
			
			}else if (numero > numeroAleatorio) {
			
				System.out.println("El numero a adivinar es mas pequeño que el numero introducido");
			
			}else {
				
				System.out.println("Enhorabuena a adivinado el numero");
			}
		
			
		}
		
		scanner.close();
	}

}
