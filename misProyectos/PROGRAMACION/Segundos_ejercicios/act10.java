package Segundos_ejercicios;

import java.util.Scanner;

/*Escribe un programa que muestre un menú con las siguientes opciones:
 * Copiar código
 * 1. Sumar dos números
 * 2. Restar dos números
 * 3. Multiplicar dos números
 * 4. Dividir dos números
 * 5. Salir
 * El usuario debe poder elegir una opción y realizar la operación correspondiente. Si selecciona la opción 5, el programa debe terminar.
 * Sentencias usadas: switch, while.
 */

public class act10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("Introduzca el numero 1 distinto de 0:");
			int num1 = scanner.nextInt();

			System.out.println("Introduzca el numero 2 distinto de 0:");
			int num2 = scanner.nextInt();

			System.out.println("Introduzca una opcion:");
			System.out.println("1. Sumar los dos números");
			System.out.println("2. Restar los dos números");
			System.out.println("3. Multiplicar los dos números");
			System.out.println("4. Dividir los dos números");
			System.out.println("5. Salir");

			opcion = scanner.nextInt();

			switch (opcion) {

			case 1:
				int suma = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + suma);
				break;

			case 2:
				int resta = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + resta);
				break;

			case 3:
				int mult = num1 * num2;
				System.out.println(num1 + " X " + num2 + " = " + mult);
				break;

			case 4:
				int div = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + div);
				break;

			default:
				System.out.println("Usted ha salido de la calculadora");
				break;
			}

		} while (opcion != 5);

		scanner.close();
	}

}
