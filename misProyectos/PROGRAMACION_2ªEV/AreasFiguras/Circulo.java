package AreasFiguras;

public class Circulo {

	private double radio;
	private int exponente = 2;
	private double pi = 3.1416;

	// constructores-------------------------------------

	public Circulo() {

	}

	public Circulo(double radio, double pi) {
		this.radio = radio;
		this.pi = pi;
	}

	// getters y setters----------------------------------

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	// metodos area y permietro

	public void CalcularPerimetro() {

		double perimetro = 2 * pi * radio;

		System.out.println("El perímetro del círculo es: " + perimetro + " cm");

	}

	public void CalcularArea() {

		double resultadoPotencia = Math.pow(radio, exponente);

		double area = pi * resultadoPotencia;

		System.out.println("El perímetro del círculo es: " + area + " cm2");

	}

}
