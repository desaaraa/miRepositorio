package AreasFiguras;

import java.util.Scanner;

public class Figuras {

	public static void main(String[] args) {

		Rectangulo rectangulo = new Rectangulo();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Circulo");
		System.out.println("2. Triangulo");
		System.out.println("3. Rectangulo");
		System.out.println("¿Con qué figura quieres trabajar?, introduzca un numero");
		int respuesta = sc.nextInt();

		switch (respuesta) {

		case 1:
			System.out.println("Introduzca el radio: ");
			double radio = sc.nextDouble();
			circulo.setRadio(radio);
			System.out.println("El area del circulo es: " + circulo.CalcularArea());

			break;

		case 2:

			break;

		case 3:

			break;
		}

	}

}
