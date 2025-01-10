package GestionBiblioteca;

import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Libro> libros = new ArrayList<Libro>();

	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}

	public void listarLibros() {
		for (Libro l : libros) {
			System.out.println("Informacion del libro");
			System.out.println(l.mostrarInfo());
		}
	}

	public void buscarLibro(String titulo) {
		for (Libro l : libros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("El libro esta en la lista ");
				System.out.println("Y el titulo es: " + titulo);

			}
		}
	}

	public void prestarLibro(String titulo) {
		for (Libro l : libros) {
			if (l.getTitulo().equalsIgnoreCase(titulo) && l.isDisponible() == true) {
				System.out.println("cambiamos el estado del libro");
				l.setDisponible(false);

			}
		}
	}

	public void devolverLibro(String titulo) {
		for (Libro l : libros) {
			if (l.getTitulo().equalsIgnoreCase(titulo) && l.isDisponible() == false) {
				System.out.println("cambiamos el estado del libro");
				l.setDisponible(true);

			}
		}
	}

}
