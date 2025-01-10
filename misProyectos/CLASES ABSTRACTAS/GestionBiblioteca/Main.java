package GestionBiblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Biblioteca bilbio = new Biblioteca();

		LibroDigital ld1 = new LibroDigital("El Quijote", "Cervantes", "Aventuras", true, 200, "PDF");
		LibroDigital ld2 = new LibroDigital();
		ld2.setAutor("CArlos Ruiz Zafon");
		ld2.setDisponible(true);
		ld2.setFormato("WORD");
		ld2.setGenero("Comedia");
		ld2.setTitulo("Manolito gafotas");
		ld2.setTamanioArchivo(1000);

		LibroFisico lf1 = new LibroFisico("Rebeldse", "marianico el corto", "Thriller", false, "Barcelona", 500);
		LibroFisico lf2 = new LibroFisico();
		lf2.setAutor("Bill gates");
		lf2.setDisponible(false);
		lf2.setGenero("Comedia");
		lf2.setNumPaginas(1000);
		lf2.setTitulo("Como hacerse rico en 2 minutos");
		lf2.setUbicacion("Madrid");

		bilbio.agregarLibro(ld1);
		bilbio.agregarLibro(ld2);
		bilbio.agregarLibro(lf1);
		bilbio.agregarLibro(lf2);

		Scanner leer = new Scanner(System.in);

		System.out.println("elija una de las siguientes opciones: ");
		System.out.println("1. Agregar un libro ");
		System.out.println("2. Listar libros ");
		System.out.println("3. Buscar un libro por un titulo");
		System.out.println("4. Prestar un libro");
		System.out.println("5. Devovler un libro ");
		System.out.println("6. Salir");

		int opcion = leer.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Introduzca de que tipo quiere introducir el libro ");
			System.out.println("Pulse 1 para fisico, 2 para digital");

			int opcionLibroFisicoODigital = leer.nextInt();

			if (opcionLibroFisicoODigital == 1) {// creamos un libro Fisico
				LibroFisico lf3 = new LibroFisico();
				System.out.println("Introduzca los datos del libro fisico");
				/*
				 * String libro, String autor, String genero, boolean disponible, String
				 * ubicacion, int numPaginas
				 */
				System.out.println("Introduzca el titulo");
				String titulo = leer.nextLine();
				System.out.println("Introduzca el autor");
				String autor = leer.nextLine();
				System.out.println("Introduzca el genero");
				String genero = leer.nextLine();
				System.out.println("Introduzca si esta disponible, 1 para si, 2 para no");
				int dispo = leer.nextInt();
				leer.nextLine();

				System.out.println("Introduzca la ubicacion del libro");
				String ubicacion = leer.nextLine();
				System.out.println("Introduzca las paginas del libro");
				int paginas = leer.nextInt();
				leer.nextLine();

				lf3.setTitulo(titulo);
				lf3.setAutor(autor);
				lf3.setGenero(genero);
				if (dispo == 1) {
					lf3.setDisponible(true);
				} else if (dispo == 2)
					lf3.setDisponible(false);
				lf3.setUbicacion(ubicacion);
				lf3.setNumPaginas(paginas);

				bilbio.agregarLibro(lf3);

			} else if (opcionLibroFisicoODigital == 2) {// creamos un libro digital

				System.out.println("Introduzca el titulo");
				String titulo = leer.nextLine();
				System.out.println("Introduzca el autor");
				String autor = leer.nextLine();
				System.out.println("Introduzca el genero");
				String genero = leer.nextLine();
				System.out.println("Introduzca el tamanio");
				int tamanio = leer.nextInt();
				leer.nextLine();
				System.out.println("Introduzca el formato");
				String foramto = leer.nextLine();
				LibroDigital ld3 = new LibroDigital(titulo, autor, genero, false, tamanio, foramto);

				bilbio.agregarLibro(ld3);

			} else
				System.out.println("Opcion incorrecta");

			bilbio.agregarLibro(lf2);
			break;
		case 2:
			bilbio.listarLibros();
			break;
		case 3:
			System.out.println("Introduzca el libro que quiere buscar");
			String titulo = leer.nextLine();
			bilbio.buscarLibro(titulo);
			break;
		case 4:
			System.out.println("Introduzca el libro que quiere prestar");
			titulo = leer.nextLine();
			bilbio.prestarLibro(titulo);
			break;
		case 5:
			System.out.println("Introduzca el libro que quiere devolver");
			titulo = leer.nextLine();
			bilbio.prestarLibro(titulo);
			break;
		default:
			System.out.println("Gracias por utilizar nuestro sistema. Hasta pronto");
		}

		leer.close();

	}

}
