package ejerciciosArrays;

import java.util.Arrays;

/*
 Crea un array de 5 números y rota sus elementos una posición 
 a la derecha. Por ejemplo, si el array es [1, 2, 3, 4, 5], el 
 resultado debe ser [5, 1, 2, 3, 4].
 •Pista: Almacena el último elemento y mueve todos los demás 
 elementos una posición hacia la derecha.
 */

public class ej10_rotacionDeUnArray {

	public static void main(String[] args) {

		int array[] = { 1, 5, 3, 6, 9 };
		System.out.println("Array sin mover: " + Arrays.toString(array));

		// Almacenar el último elemento
		int ultimoNumero = array[array.length - 1];

		// Mover los elementos una posición hacia la derecha
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		// Poner el último elemento en la primera posición
		array[0] = ultimoNumero;

		// Mostrar

		System.out.println("Array movido: " + Arrays.toString(array));
	}

}
