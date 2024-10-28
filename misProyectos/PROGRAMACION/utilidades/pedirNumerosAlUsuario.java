package utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pedirNumerosAlUsuario {

	public static void main(String[] args) {

		pedirNumerosUsuario();

	}

	public static List<Integer> pedirNumerosUsuario() {
		List<Integer> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int numero = 0;

		do {

			System.out.println("Introduzca un numero a añadir al arraylist: ");
			System.out.println("Cuando quiera parar introduzca 000");
			numero = sc.nextInt();

			if (numero != 000) {
				lista.add(numero);
			}

		} while (numero != 000);

		sc.close();
		return lista;

	}

}
