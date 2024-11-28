package ejerciciosArrays;

/*Crea dos arrays de enteros y fusionarlos en un solo array. 
 * Imprime el nuevo array resultante.
*•Pista: La longitud del nuevo array será la suma de las 
*longitudes de los dos arrays originales.
*/

public class ej8_fusionArrays {

	public static void main(String[] args) {

		int array[] = { 1, 5, 3, 6 };
		int array2[] = { 10, 15, 30, 60 };

		int fusionado[] = new int[array.length + array2.length];

		int i = 0;
		int j = 0;

		// Copiar los elementos del primer array

		for (i = 0; i < array.length; i++) {
			fusionado[i] = array[i];
			System.out.println("fusionado [" + i + "] =" + fusionado[i]);
		}

		// Copiar los elementos del segundo array

		for (j = 0; j < array2.length; j++, i++) {
			fusionado[i] = array2[j];
			System.out.println("fusionado [" + i + "] =" + fusionado[i]);
		}
	}

}
