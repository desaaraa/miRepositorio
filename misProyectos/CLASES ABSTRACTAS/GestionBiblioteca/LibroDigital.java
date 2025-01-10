package GestionBiblioteca;

public class LibroDigital extends Libro {

	private double tamanioArchivo;// tamanio del archivo en MB
	private String formato;// formato del archivo (PDF, EPUB ...)

	public LibroDigital(String libro, String autor, String genero, boolean disponible, double tamanioArchivo,
			String formato) {
		super(libro, autor, genero, disponible);
		this.tamanioArchivo = tamanioArchivo;
		this.formato = formato;
	}

	public LibroDigital() {
	}

	public double getTamanioArchivo() {
		return tamanioArchivo;
	}

	public void setTamanioArchivo(double tamanioArchivo) {
		this.tamanioArchivo = tamanioArchivo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String mostrarInfo() {
		String cadena = " ";

		cadena += "Libro: " + getTitulo();
		cadena += "Autor: " + getAutor();
		cadena += "Genero: " + getGenero();
		cadena += "Disponible: " + isDisponible();
		cadena += "Tamanio :" + getTamanioArchivo();
		cadena += "Formato : " + getFormato() + "";

		return cadena;
	}

}
