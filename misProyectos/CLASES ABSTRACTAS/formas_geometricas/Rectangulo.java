package formas_geometricas;

public class Rectangulo extends Figura {

	private double base;
	private double altura;

	// constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;

		// sobreescritura de metodos
	}

	@Override
	protected double calcularArea() {
		double area = base * altura;
		return area;
	}

	@Override
	protected double calcularPerimetro() {
		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}

	// getters y setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
