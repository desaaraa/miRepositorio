package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;

import utilidades.pedirNumerosAlUsuario;

/*
 * 1.	Cree un ArrayList de enteros.
2.	Permita al usuario agregar números.
3.	Cree dos nuevos ArrayList: uno para los números pares y otro para los números impares.
4.	Imprima ambos ArrayList por separado.
Pistas:
•	Usa un bucle para iterar sobre el ArrayList original y separa los números en los dos nuevos ArrayList según si son pares o impares.
 */

public class ej10_paresEImpares {

	public static void main(String[] args) {

		List<Integer> lista = pedirNumerosAlUsuario.pedirNumerosUsuario();

		List<Integer> listaPares = new ArrayList<>();
		List<Integer> listaImpares = new ArrayList<>();

		System.out.println("Lista introducida");
		System.out.println(lista);

		for (int i : lista) {

			if (i % 2 == 0) {
				listaPares.add(i);
			} else
				listaImpares.add(i);
		}

		System.out.println("Lista con numeros pares");
		System.out.println(listaPares);

		System.out.println("Lista con numeros impares");
		System.out.println(listaImpares);
	}

}
