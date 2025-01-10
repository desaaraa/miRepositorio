package netflix;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String nombre;
	private String director;
	private String genero;
	private int año;
	private int duracion;

	// constructores----------------------------------------------------------------------

	public Pelicula() {
	}

	public Pelicula(String nombre, String director, String genero, int año, int duracion) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.año = año;
		this.duracion = duracion;
	}

	// getters y setters------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// metodos--------------------------------------------------------------------

	public void mostrarPelicula() {

	}

	public void consultarUsuarios() {

		List<Usuario> usuarios = new ArrayList<>();
	}
}
