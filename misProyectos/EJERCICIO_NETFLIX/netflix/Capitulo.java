package netflix;

public class Capitulo {

	private int numero;
	private int temporada;
	private String nombre;
	private int duracion;
	private String idioma;

	// constructores---------------------------------------------------------------------------

	public Capitulo(int numero, int temporada, String nombre, int duracion, String idioma) {
		this.numero = numero;
		this.temporada = temporada;
		this.nombre = nombre;
		this.duracion = duracion;
		this.idioma = idioma;
	}

	public Capitulo() {
	}

	// getters y
	// setters-------------------------------------------------------------------------

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "Capitulo{" + "numero=" + numero + ", temporada=" + temporada + ", nombre='" + nombre + '\''
				+ ", duracion=" + duracion + " minutos" + ", idioma='" + idioma + '\'' + '}';
	}

}
