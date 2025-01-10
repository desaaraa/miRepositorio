package netflix;

public class Plan {

	private double precio;
	private int pantallas;

	// constructores------------------------------------------------------------

	public Plan(double precio, int pantallas) {
		this.precio = precio;
		this.pantallas = pantallas;
	}

	public Plan() {
	}

	// getters y setters--------------------------------------------------------

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPantallas() {
		return pantallas;
	}

	public void setPantallas(int pantallas) {
		this.pantallas = pantallas;
	}
}
