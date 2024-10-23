package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*1.	Cree un ArrayList de cadenas (String).
2.	Permita al usuario agregar nombres al ArrayList hasta que ingrese la palabra "fin".
3.	Después de eso, imprima todos los nombres ingresados.
4.	Permita al usuario eliminar un nombre específico y vuelva a mostrar la lista actualizada.
*/

public class ej1_creacionArrayList {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		String nombre = "";

		do {

			System.out.println("Introduzca un nombre: ");
			System.out.println("Cuando quiera acabar escriba fin");
			nombre = sc.nextLine();

			if (!nombre.equals("fin")) {
				lista.add(nombre);
			}

		} while (!nombre.equals("fin"));
		{

			for (String i : lista) {

				System.out.println(i);
			}

			System.out.println("¿Quiere borrar un usuario? Introduzca si o no:");
			String respuesta = sc.nextLine();

			if (respuesta.equals("si")) {

				System.out.println("¿Qué nombre quiere borrar?");
				String nomBorrado = sc.nextLine();
				lista.remove(nomBorrado);
			}

			for (String i : lista) {

				System.out.println(i);
			}
		}
		sc.close();
	}

}
