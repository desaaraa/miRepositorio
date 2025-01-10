package formas_geometricas;

public class Circulo extends Figura {

	private double radio;

	// constructor

	public Circulo(double radio) {
		this.radio = radio;
	}

	// get y set

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// sobreescritura de metodos

	@Override
	protected double calcularArea() {

		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	@Override
	protected double calcularPerimetro() {

		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

}
