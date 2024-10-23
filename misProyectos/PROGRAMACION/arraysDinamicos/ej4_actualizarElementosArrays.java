package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
1.Cree un ArrayList de enteros con 10 elementos.
2.	Permita al usuario actualizar el valor de un elemento en una posición
 específica (usando su índice).
3.	Después de cada actualización, imprime el ArrayList actualizado.
Pistas:
•	Usa el método set(index, value) para modificar el valor de un elemento 
en una posición específica.
*/

public class ej4_actualizarElementosArrays {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) { // para añadir elementos
			lista.add(i);
		}

		for (int i : lista) { // para mostrar elementos

			System.out.print(i + " ");
		}

		int indiceACambiar = 0;

		do { // hacer preguntas mientras usuario quiera
			System.out.println(" ");
			System.out.println("Para finalizar pulsa 00");
			System.out.println("¿Qué indice quiere cambiar?: ");
			indiceACambiar = sc.nextInt();

			if (indiceACambiar == 00)
				break;

			System.out.println("¿Qué valor quiere introducir?: ");
			int numACambiar = sc.nextInt();

			lista.set(indiceACambiar, numACambiar); // cambiar valores de un indice

			for (int i : lista) { // mostrar indice cambiado

				System.out.print(i + " ");
			}

		} while (indiceACambiar != 00);

	}

}
