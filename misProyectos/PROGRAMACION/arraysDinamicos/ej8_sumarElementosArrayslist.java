package arraysDinamicos;

import java.util.List;

import utilidades.pedirNumerosAlUsuario;

/*Escribe un programa que:
1.	Cree un ArrayList de enteros.
2.	Llene el ArrayList con números enteros ingresados por el usuario.
3.	Sume todos los elementos y muestre el resultado.
Pistas:
•	Usa un bucle for para iterar a través del ArrayList y sumar los elementos.
*/

public class ej8_sumarElementosArrayslist {

	public static void main(String[] args) {

		List<Integer> lista = pedirNumerosAlUsuario.pedirNumerosUsuario();

		int suma = 0;

		System.out.println("Lista con elementos introducidos");
		System.out.println(lista);

		for (int i : lista) {

			suma = suma + i;
		}
		System.out.println("La suma de la lista es: " + suma);

	}

}
