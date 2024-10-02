package Programacion;

/*Declara una variable para el radio de un círculo. 
 * Utiliza la fórmula Perímetro = 2 * π * radio para calcular el perímetro del círculo e imprimirlo en la consola.
 *  Usa Math.PI para obtener el valor de π.
 */

public class act5 {

	public static void main(String[] args) {

		

		double radio = 30.5;
		double perimetro = 2 * Math.PI * radio;
		
		System.out.println ("El perimetro del circulo es "+ perimetro + " cm");
	}

}
