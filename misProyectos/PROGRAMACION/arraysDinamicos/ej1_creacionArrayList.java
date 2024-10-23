package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1.Cree un ArrayList de enteros.
2.	Permita al usuario ingresar 5 números enteros.
3.	Los agregue al ArrayList.
4.	Imprima el contenido del ArrayList después de haber ingresado los números.
*/

public class ej1_creacionArrayList {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Introduzca un numero: ");
			int numero = sc.nextInt();
			lista.add(numero);
		}

		for (int i : lista) {

			System.out.println(i);
		}
		sc.close();
	}

}
