package ej3;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pelicula pelicula = new Pelicula("El rey leon", "infantil", 1994, 88);

		Serie serie = new Serie("La reina del flow", "novela", 2);

		Temporada1Serie temporada1Serie = new Temporada1Serie(1, 94);

		Temporada2Serie temporada2Serie = new Temporada2Serie(2, 89);

		CapituloDeEjemplo capituloDeEjemplo = new CapituloDeEjemplo(94, 60);

	}

}
