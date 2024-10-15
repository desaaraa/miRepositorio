package terceros20ejercicios;

/*Escribe un programa que calcule la suma de todos 
 *los múltiplos de 3 y 5 que se encuentran entre 1 y 1000.
 */

public class ej20_sumaMultiplos3Y5 {

	public static void main(String[] args) {

		int suma = 0;

		for (int i = 1; i <= 1000; i++) {

			if (i % 3 == 0 || i % 5 == 0)
				suma = suma + i;

		}
		System.out.println("el resultado de la suma de todos los multiplos de 3 y 5 del 1 al 1000 es igual a: " + suma);
	}

}
