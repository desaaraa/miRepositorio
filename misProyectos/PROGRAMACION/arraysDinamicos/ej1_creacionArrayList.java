package arraysDinamicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Escribe un programa que:
1.	Cree un ArrayList de enteros.
2.	Permita al usuario ingresar 5 números enteros.
3.	Los agregue al ArrayList.
4.	Imprima el contenido del ArrayList después de haber ingresado los números.
Pistas:
•	Usa el método add() para agregar elementos al ArrayList.
•	Usa un bucle for o while para permitir al usuario ingresar los números.
*/

public class ej1_creacionArrayList {

	public static void main(String[] args) {
		
		List <Integer> lista = new ArrayList<>(); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 1 numero: ");
		int numero1 = sc.nextInt();
		lista.add(numero1);
		
		System.out.println("Introduzca 2 numero: ");
		int numero2 = sc.nextInt();
		lista.add(numero2);
		
		System.out.println("Introduzca 3 numero: ");
		int numero3 = sc.nextInt();
		lista.add(numero3);
		
		System.out.println("Introduzca 4 numero: ");
		int numero4 = sc.nextInt();
		lista.add(numero4);
		
		System.out.println("Introduzca 5 numero: ");
		int numero5 = sc.nextInt();
		lista.add(numero5);
		
		sc.close();
		
		for ()
	}

}
