package ej3;

public class Temporada1Serie {
	
	private int numero;
	private int capitulos;
	
	//constructores---------------------------------------------------------------------------------

	
	public Temporada1Serie() {}
	
	public Temporada1Serie(int numero, int capitulos) {
		this.numero = numero;
		this.capitulos = capitulos;
	}
	
	
	//getters y setters------------------------------------------------------------------------------

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}
	

}
