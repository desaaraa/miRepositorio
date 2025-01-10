package formas_geometricas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// opcion 1
		Figura cir = new Circulo(5.7);
		Figura rec = new Rectangulo(5, 8.8);
		Figura tri = new Triangulo(4, 6, 7, 7);

		// opcion 2 creando un arraylist

		List<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(5.7));
		figuras.add(new Rectangulo(5, 8.8));
		figuras.add(new Triangulo(4, 6, 7, 7));

		// recorreremos cada objeto de la lista
		for (Figura i : figuras) {
			System.out.println("Area de " + i + ": " + i.calcularArea());
			System.out.println("Perimetro de " + i + ": " + i.calcularPerimetro());
		}
		/*
		 * si queremos que salga bien por pantalla, escribiriamos en cada clase public
		 * String toString() { return "Triangulo"; }
		 */
	}

}
