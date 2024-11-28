package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;

import utilidades.pedirNumerosAlUsuario;

/*
1.Cree un ArrayList de enteros.
2.	Permita al usuario ingresar números en el ArrayList.
3.	Imprima el ArrayList en orden inverso.

 */

public class ej9_invertirElementos {

	public static void main(String[] args) {

		List<Integer> lista = pedirNumerosAlUsuario.pedirNumerosUsuario();

		List<Integer> listaInvertida = new ArrayList<>();

		for (int i = lista.size(); i > 0; i--) {
			listaInvertida.add(i);
		}
		System.out.println("Lista con elementos introducidos");
		System.out.println(lista);

		System.out.println("Lista con elementos en orden inverso");
		System.out.println(listaInvertida);
	}

}
