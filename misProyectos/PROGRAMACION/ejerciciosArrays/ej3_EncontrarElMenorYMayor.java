package ejerciciosArrays;

/*Crea un array de 10 números enteros y 
 * determina el mayor y el menor número en el array.
 * Imprime ambos valores.
 */

public class ej3_EncontrarElMenorYMayor {

	public static void main(String[] args) {

		int numeros[] = new int[10];

		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 15;
		numeros[3] = 11;
		numeros[4] = 13;
		numeros[5] = 100;
		numeros[6] = 90;
		numeros[7] = 85;
		numeros[8] = 71;
		numeros[9] = 33;

		int numeroMayor = numeros[2];
		int numeroMenor = numeros[7];

		for (int i = 0; i < 10; i++) {

			if (numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];

			}
			if (numeros[i] < numeroMenor) {
				numeroMenor = numeros[i];

			}
		}

		System.out.println("El numero mayor es: " + numeroMayor);
		System.out.println("El numero menor es: " + numeroMenor);
	}

}
