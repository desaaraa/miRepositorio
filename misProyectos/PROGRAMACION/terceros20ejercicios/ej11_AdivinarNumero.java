package terceros20ejercicios;

import java.util.Random;
import java.util.Scanner;

/*Escribe un programa en el que el ordenador genere un número 
 * aleatorio entre 1 y 100. El usuario debe intentar adivinar el número. 
 * El programa debe dar pistas diciendo si el número es mayor o menor que 
 * el introducido. El bucle continuará hasta que el usuario adivine el número.
 */

public class ej11_AdivinarNumero {

	public static void main(String[] args) {

		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);
		int numero = 0;

		do {

			System.out.println("Adivina el numero: ");
			numero = sc.nextInt();

			if (numero < numeroAleatorio) {
				System.out.println("el numero a adivinar es mas grande");

			} else if (numero > numeroAleatorio) {

				System.out.println("el numero a adivinar es mas pequeño");
			} else {

				System.out.println("Enhorabuena ha adivinado el numero");
			}
		} while (numero != numeroAleatorio);

		sc.close();

	}

}
