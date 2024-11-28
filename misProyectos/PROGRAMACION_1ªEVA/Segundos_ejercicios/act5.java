package Segundos_ejercicios;

/* Escribe un programa que utilice un bucle para sumar los números 
 * enteros del 1 al 100 y luego imprima el resultado.Sentencias usadas: for.
 */

public class act5 {

	public static void main(String[] args) {
		

		int suma = 0;
		
		for (int cont=1 ; cont<=100 ; cont++) {
			
			suma = suma + cont;
			
		}
		
		System.out.println(suma);
		
	}

}
