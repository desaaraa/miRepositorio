package GestionBiblioteca;

public class LibroFisico extends Libro {

	private String ubicacion;
	private int numPaginas;

	public LibroFisico(String libro, String autor, String genero, boolean disponible, String ubicacion,
			int numPaginas) {
		super(libro, autor, genero, disponible);
		this.ubicacion = ubicacion;
		this.numPaginas = numPaginas;
	}

	public LibroFisico() {
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String mostrarInfo() {

		String cadena = "";

		cadena += "Libro: " + getTitulo();
		cadena += "Autor: " + getAutor();
		cadena += "Genero: " + getGenero();
		cadena += "Disponible: " + isDisponible();
		cadena += "Ubicacion: " + getUbicacion();
		cadena += "PAginas: " + getNumPaginas();

		return cadena;

	}

}
