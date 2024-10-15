package terceros20ejercicios;

import java.util.Random;
import java.util.Scanner;

/*Crea un programa en el que el ordenador genere un número aleatorio
 *entre 1 y 100, y el usuario tenga un máximo de 5 intentos para adivinarlo. 
 *Si el usuario no lo adivina en esos 5 intentos, el programa debe mostrar el número.
 */

public class ej19_adivinanzaConIntentosLimitados {

	public static void main(String[] args) {

		Random random = new Random();
		int numAleatorio = random.nextInt(100) + 1;

		Scanner sc = new Scanner(System.in);

		int intentos = 5;
		int numero = 0;

		do {

			System.out.println("introduzca un numero, tiene " + intentos + " intentos: ");
			numero = sc.nextInt();
			intentos = intentos - 1;

			if (numero < numAleatorio) {
				System.out.println("el numero a adivinar es mas grande");

			} else if (numero > numAleatorio) {

				System.out.println("el numero a adivinar es mas pequeño");
			} else {

				System.out.println("Enhorabuena ha adivinado el numero");
			}

		} while (intentos != 0 && numero != numAleatorio);

		if (intentos == 0) {
			System.out.println("el numero a adivinar era " + numAleatorio);
		}

		sc.close();
	}

}
