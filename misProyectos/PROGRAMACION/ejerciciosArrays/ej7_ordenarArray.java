package ejerciciosArrays;

import java.util.Arrays;
import java.util.Random;

/*Crea un array de 10 números aleatorios. Ordena el array 
 * en orden ascendente y luego imprime el resultado.
 * •Pista: Puedes implementar tu propio algoritmo de ordenamiento 
 * (como burbuja o selección) o usar el método Arrays.sort().
 */

public class ej7_ordenarArray {

	public static void main(String[] args) {

		Random random = new Random();

		int numeros[] = new int[10];

		for (int i = 0; i < 10; i++) {
			int numeroAleatorio = random.nextInt(100) + 1;
			numeros[i] = numeroAleatorio;

		}

		// Ordenar el array
		Arrays.sort(numeros);

		// Imprimir el array ordenado
		System.out.println("El array ordenado es " + Arrays.toString(numeros));
	}

}
