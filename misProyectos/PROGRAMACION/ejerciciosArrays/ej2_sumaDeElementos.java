package ejerciciosArrays;

/*Crea un array de 5 números enteros. Calcula 
 * la suma de todos los elementos y muestra el resultado.
 */

public class ej2_sumaDeElementos {

	public static void main(String[] args) {

		int numeros[] = new int[5];

		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 15;
		numeros[3] = 11;
		numeros[4] = 13;

		int suma = 0;

		for (int i = 0; i < 5; i++) {

			suma = suma + numeros[i];
		}
		System.out.println(suma);
	}

}
