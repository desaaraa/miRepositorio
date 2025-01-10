package GestionBiblioteca;

public class Libro {

	private String titulo;
	private String autor;
	private String genero;
	private boolean disponible;

	public Libro(String libro, String autor, String genero, boolean disponible) {
		this.titulo = libro;
		this.autor = autor;
		this.genero = genero;
		this.disponible = disponible;
	}

	public Libro() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String libro) {
		this.titulo = libro;
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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String mostrarInfo() {

		String cadena = " ";

		cadena += "Libro: " + getTitulo();
		cadena += "Autor: " + getAutor();
		cadena += "Genero: " + getGenero();
		cadena += "Disponible: " + isDisponible();

		return cadena;
	}

	public void prestar() {
		this.disponible = false;
	}

	public void devolver() {
		this.disponible = true;
	}

}
