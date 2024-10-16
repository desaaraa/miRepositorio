package ejerciciosArrays;

/*Crea un array de 5 números y crea otro 
 * array que contenga los mismos números pero en orden inverso. 
 * Imprime el nuevo array.
 */

public class ej4_invertitArray {

	public static void main(String[] args) {

		int numeros[] = new int[5];
		numeros[0] = 2;
		numeros[1] = 5;
		numeros[2] = 10;
		numeros[3] = 20;
		numeros[4] = 25;

		for (int j = 0; j < 5; j++) {

			System.out.println("numeros [" + j + "] = " + numeros[j]);
		}

		int numeros2[] = new int[5];

		for (int i = 0; i < 5; i++) {

			numeros2[i] = numeros[numeros.length - 1 - i];

		}

		for (int x = 0; x < 5; x++) {

			System.out.println("numeros2 [" + x + "] = " + numeros2[x]);

		}
	}

}
