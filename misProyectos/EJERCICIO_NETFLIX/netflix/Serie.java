package netflix;

import java.util.ArrayList;
import java.util.List;

public class Serie {

	private String genero;
	private String nombre;
	private List<Temporada> listaTemporadas = new ArrayList<>();

	// constructores--------------------------------------------------------------------

	public Serie() {
	}

	public Serie(String genero, String nombre, List<Temporada> listaTemporadas) {
		this.genero = genero;
		this.nombre = nombre;
		this.listaTemporadas = listaTemporadas;
	}

	// getters y
	// setters-----------------------------------------------------------------

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Temporada> getListaTemporadas() {
		return listaTemporadas;
	}

	public void setListaTemporadas(List<Temporada> listaTemporadas) {
		this.listaTemporadas = listaTemporadas;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Serie: ").append(nombre).append("\n");
		sb.append("Género: ").append(genero).append("\n");
		sb.append("Temporadas: \n");
		for (Temporada temporada : listaTemporadas) {
			sb.append(temporada.toString()).append("\n");
		}
		return sb.toString();

	}

}
