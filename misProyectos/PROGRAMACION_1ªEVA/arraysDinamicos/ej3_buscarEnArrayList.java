package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1.	Cree un ArrayList de enteros y permita al usuario agregar 10 números.
2.	Le pida al usuario un número a buscar en el ArrayList.
3.	Si el número existe, imprima el índice en el que se encuentra. Si no, muestra 
un mensaje indicando que no está presente.
Pistas:
•	Usa el método indexOf() para encontrar el índice de un elemento.
•	Usa el método contains() si solo quieres verificar si un número está presente.
*/

public class ej3_buscarEnArrayList {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) { // para introducir 10 nums

			System.out.println("Introduzca el numero " + i + ":");
			int numero = sc.nextInt();
			lista.add(numero);
		}

		System.out.println("¿Qué número quiere buscar?: ");
		int numABuscar = sc.nextInt();

		boolean contiene;
		if (contiene = lista.contains(numABuscar)) {
			System.out.println("Su numero está en la posición " + lista.indexOf(numABuscar));

		} else {
			System.out.println("Su numero no está en el ArrayList");
		}
		sc.close();
	}

}
