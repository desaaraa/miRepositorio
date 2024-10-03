package Segundos_ejercicios;

/*Escribe un programa que utilice un bucle para sumar todos los 
 * números pares entre 1 y 100 y luego imprima el resultado.
 * Sentencias usadas: for, if.
 */

public class act8 {

	public static void main(String[] args) {

		int suma = 0;
		
		for (int cont=0 ; cont<=100 ; cont= cont + 2) {
			
			suma = suma + cont;
			
		}
		
		System.out.println(suma);

	}

}
