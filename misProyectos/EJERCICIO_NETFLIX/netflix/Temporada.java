package netflix;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

	private int numero;
	private int anio;
	private List<Capitulo> listaCapitulos = new ArrayList<>();

	// constructores----------------------------------------------------------------

	public Temporada() {
	}

	public Temporada(int numero, int anio, List<Capitulo> listaCapitulos) {
		this.numero = numero;
		this.anio = anio;
		this.listaCapitulos = listaCapitulos;
	}

	// getters y
	// setters--------------------------------------------------------------

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public List<Capitulo> getListaCapitulos() {
		return listaCapitulos;
	}

	public void setListaCapitulos(List<Capitulo> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Temporada{").append("numero=").append(numero).append(", anio=").append(anio).append(", capitulos=[");

		for (int i = 0; i < listaCapitulos.size(); i++) {
			sb.append(listaCapitulos.get(i).toString());
			if (i < listaCapitulos.size() - 1) {
				sb.append(", ");
			}
		}

		sb.append("]}");
		return sb.toString();
	}

}
