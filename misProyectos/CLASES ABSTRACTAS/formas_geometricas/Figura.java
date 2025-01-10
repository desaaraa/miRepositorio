package formas_geometricas;

/*1.	Crea una clase abstracta Figura con: 
o	Métodos abstractos calcularArea() y calcularPerimetro().
2.	Implementa subclases Circulo, Rectangulo y Triangulo que sobrescriban los métodos.
3.	En la clase principal, crea una lista de diferentes figuras, calcula su área y perímetro, y muéstralos.
*/

public abstract class Figura {

	protected abstract double calcularArea();

	protected abstract double calcularPerimetro();

}
