package arraysDinamicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*1.Cree un ArrayList de enteros y permita al usuario 
 agregar números hasta que ingrese un número negativo 
 (el número negativo no debe agregarse a la lista).
2.	Ordene el ArrayList en orden ascendente.
3.	Imprima el ArrayList ordenado.
*/

public class ej5_ordenarArrayList {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int numero = 0;

		do {

			System.out.println("Introduzca un numero a añadir al arraylist: ");
			System.out.println("Cuando quiera parar introduzca numero negativo");
			numero = sc.nextInt();

			if (numero > 0) {
				lista.add(numero);
			}

		} while (numero > 0);

		System.out.println("Lista sin ordenar");

		for (int i : lista) { // mostrar indice cambiado

			System.out.print(i + " ");
		}

		Collections.sort(lista);

		System.out.println(" ");
		System.out.println("Lista ordenada");

		for (int i : lista) { // mostrar indice cambiado

			System.out.print(i + " ");
		}
sc.close();
	}

}
