package examen;

public class LibroDigital extends Libro {

	private double tamañoArchivo;
	private String formato;

	// constructores

	public LibroDigital() {

	}

	public LibroDigital(String titulo, String autor, String genero, String disponible, double tamañoArchivo,
			String formato) {
		super(titulo, autor, genero, disponible);
		this.tamañoArchivo = tamañoArchivo;
		this.formato = formato;
	}

	// getters y setters

	public double getTamañoArchivo() {
		return tamañoArchivo;
	}

	public void setTamañoArchivo(double tamañoArchivo) {
		this.tamañoArchivo = tamañoArchivo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	// metodos

	@Override
	public String mostrarInfo() {
		super.mostrarInfo();
		tamañoArchivo = getTamañoArchivo();
		String cadena = "Tamaño: ";
		return super.mostrarInfo() + cadena + getTamañoArchivo();
	}
}
