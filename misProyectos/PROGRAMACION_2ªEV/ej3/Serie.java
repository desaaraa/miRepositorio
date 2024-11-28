package ej3;

public class Serie {

	private String nombre;
	private String genero;
	private int temporadas;

	// constructores---------------------------------------------------------------------------------

	public Serie() {
	}

	public Serie(String nombre, String genero, int temporadas) {
		this.nombre = nombre;
		this.genero = genero;
		this.temporadas = temporadas;
	}

	// getters y
	// setters------------------------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int Temporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

}
