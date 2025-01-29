package netflix;

public class Plan {

	private double precio;
	private int pantallas;
	private String nombre;

	// constructores------------------------------------------------------------

	public Plan(double precio, int pantallas, String nombre) {
		this.precio = precio;
		this.pantallas = pantallas;
		this.nombre = nombre;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override

	public String toString() {
		return "Plan{" +

				"nombre='" + nombre + '\'' + ", precio=" + precio + "€, pantallas=" + pantallas + '}';
	}

}
