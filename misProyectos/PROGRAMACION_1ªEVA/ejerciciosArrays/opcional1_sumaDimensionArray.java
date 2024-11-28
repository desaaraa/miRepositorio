package ejerciciosArrays;

/*
 * Escribe un programa que reciba una matriz de enteros de 
 * tamaño m x n (2 dimensiones) y devuelva la suma de todos 
 * los elementos de la matriz.
 */

public class opcional1_sumaDimensionArray {

	public static void main(String[] args) {

		int matriz[][] = {

				{ 1, 2, 5 }, { 8, 9, 3 }, { 4, 6, 7 }

		};

		int suma = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				suma = suma + matriz[i][j];

			}

		}

		System.out.println("El resultado de la suma de toda la dimensión es: " + suma);

	}

}
