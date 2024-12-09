package AreasFiguras;

public class Rectangulo {

	private double base;
	private double altura;

	// constructores---------------------------------------------

	public Rectangulo() {

	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// getters and setters------------------------------------------

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

	// metodos area y perimetro----------------------------------------

	public void CalcularPerimetro() {

		double perimetro = (base * 2) + (altura * 2);
		System.out.println("El perimetro del rectangulo es: " + perimetro + " cm");

	}

	public void CalcularArea() {
		double area = base * altura;
		System.out.println("El área del rectangulon es: " + area + " cm2");
	}

}
