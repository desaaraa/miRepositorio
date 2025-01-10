package examen;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	List<Libro> libros = new ArrayList<>();

	public Biblioteca() {

		// libros fisicos

		libros.add(new LibroFisico("Titanic", "Pedro", "Tragedia", "si", "estanteriaA", 600));

		libros.add(new LibroFisico("Por ella", "Juan", "Amor", "si", "estanteriaB", 200));

		libros.add(new LibroFisico("Lagrimas de sal", "Paco", "Comedia", "no", "estanteriaC", 300));

		// libros digitales

		libros.add(new LibroDigital("Furia", "Estrella", "Amor", "si", 100, "avd"));
		libros.add(new LibroDigital("Inside out", "Julia", "Dibujos animados", "si", 300, "avd"));
		libros.add(new LibroDigital("Vaiana2", "Sara", "Dibujos", "no", 500, "avd"));

	}

	// metodos

	void listarLibros() {

		for (Libro i : libros) {

			System.out.println(i.mostrarInfo());
		}
	}

}
