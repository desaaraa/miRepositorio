package ejerciciosArrays;

/*
 * Escribe un programa que reciba una matriz de 
 * enteros m x n y determine cuál es la fila con la
 * mayor suma de elementos. El programa debe devolver el índice de esa fila.
 */

public class opcional2_filaSumaAlta {

	public static void main(String[] args) {

		int matriz[][] = {

				{ 1, 2, 5 }, { 8, 9, 3 }, { 4, 6, 7 }

		};

		int suma = 0;
		int suma2 = 0;
		int suma3 = 0;

		for (int i = 0; i < 1; i++) {

			for (int j = 0; j < 3; j++) {

				suma = suma + matriz[i][j];

			}
		}

		for (int j = 1; j < 2; j++) {

			for (int k = 0; k < 3; k++) {

				suma2 = suma2 + matriz[j][k];

			}

		}

		for (int h = 2; h < 3; h++) {

			for (int m = 0; m < 3; m++) {

				suma3 = suma3 + matriz[h][m];

			}

		}

		if (suma > suma2 && suma > suma3) {

			System.out.println("La fila 1 tiene la suma mas alta que es: " + suma);
		} else if (suma2 > suma && suma2 > suma3) {

			System.out.println("La fila 2 tiene la suma mas alta que es: " + suma2);
		} else {

			System.out.println("La fila 3 tiene la suma mas alta que es: " + suma3);
		}

	}

}
