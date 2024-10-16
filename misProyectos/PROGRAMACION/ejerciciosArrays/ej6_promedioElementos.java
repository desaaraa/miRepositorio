package ejerciciosArrays;

/*Crea un array de 6 números flotantes. Calcula el promedio 
 * de los números y muestra el resultado.
 *•	Pista: La suma total se puede dividir entre la cantidad de elementos del array.
*/

public class ej6_promedioElementos {

	public static void main(String[] args) {

		float numeros[] = { 54.4f, 23.3f, 21.899f, 34.8f, 89.9f, 31.8f };
		float suma = 0;
		float promedio = 0;

		for (float i : numeros) {
			suma = i + suma;
		}
		promedio = suma / numeros.length;

		System.out.println("El resultado promedio es: " + promedio);
	}

}
