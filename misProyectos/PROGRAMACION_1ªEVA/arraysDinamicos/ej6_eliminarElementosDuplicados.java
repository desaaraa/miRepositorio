package arraysDinamicos;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import utilidades.pedirNumerosAlUsuario;

/*1.	Cree un ArrayList de enteros y permita al usuario agregar números.
2.	Elimine todos los elementos duplicados del ArrayList.
3.	Imprima el ArrayList sin duplicados.
*/

public class ej6_eliminarElementosDuplicados {

	public static void main(String[] args) {

		List<Integer> lista = pedirNumerosAlUsuario.pedirNumerosUsuario();

		Scanner sc = new Scanner(System.in);

		System.out.println("Lista con elementos duplicados");
		System.out.println(lista);

		HashSet<Integer> listaSinDuplicados = new HashSet<>(lista);

		System.out.println("Lista con elementos sin duplicar");
		System.out.println(listaSinDuplicados);

		sc.close();

	}

}
