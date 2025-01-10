package examen;

public class LibroFisico extends Libro {

	private String ubicacion;
	private int numPaginas;

	// constructores

	public LibroFisico(String titulo, String autor, String genero, String disponible, String ubicacion,
			int numPaginas) {
		super(titulo, autor, genero, disponible);
		this.ubicacion = ubicacion;
		this.numPaginas = numPaginas;
	}

	public LibroFisico() {

	}

	// getters y setters

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

	// metodo

	@Override

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Ubicacion: " + getUbicacion());
		System.out.println("Numero de paginas: " + getUbicacion());
	}
}
