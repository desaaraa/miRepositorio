package examen;

public class Libro {

	private String titulo;
	private String autor;
	private String genero;
	private String disponible;

	// constructores

	public Libro(String titulo, String autor, String genero, String disponible) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.disponible = disponible;
	}

	public Libro() {

	}

	// getters y setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	// metodos

	String mostrarInfo() {
		titulo = "Titulo:" + getTitulo();
		autor = "Autor: " + getAutor();
		genero = "Genero: " + getGenero();
		disponible = "Disponible " + getDisponible();
		String cadena = titulo + autor + genero + disponible;
		return cadena;
	}

	public void prestar() {

		if (disponible == "si") {
			System.out.println("El libro " + getTitulo() + "ha sido prestado");
		} else
			System.out.println("El libro " + getTitulo() + "no esta prestado");
	}

	public void devolver() {

		if (disponible == "no") {
			System.out.println("El libro " + getTitulo() + "libro dejado, ya esta en la biblioteca");
		} else
			System.out.println("El libro " + getTitulo() + "ya está disponible ");
	}
}
