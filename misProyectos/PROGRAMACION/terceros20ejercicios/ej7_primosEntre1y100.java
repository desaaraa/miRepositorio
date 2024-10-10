package terceros20ejercicios;

/*Escribe un programa que imprima todos los números 
 * primos entre 1 y 100 utilizando un bucle. Un número primo 
 * es aquel que solo es divisible por 1 y por sí mismo.
 */

public class ej7_primosEntre1y100 {

	public static void main(String[] args) {

		for (int cont = 1; cont <= 100; cont++) {

			int divisibles = 0;

			for (int cont2 = 1; cont2 <= cont; cont2++) {

				if (cont % cont2 == 0) {

					divisibles++;
				}

			}

			if (divisibles == 2) {
				System.out.println(cont);
			}

		}

	}

}
