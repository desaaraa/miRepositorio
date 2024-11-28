package ejerciciosArrays;

/*Crea un array de enteros llamado numeros y 
 * llénalo con los valores de 1 a 10. Luego, imprime todos los elementos del array
 */
public class ej1_declaracionEIniciacion {

	public static void main(String[] args) {

		int numeros[] = new int[10];

		for (int i = 0; i < 10; i++) {
			numeros[i] = i;
			System.out.println("numeros [" + i + "] =" + numeros[i]);
		}
	}

}
