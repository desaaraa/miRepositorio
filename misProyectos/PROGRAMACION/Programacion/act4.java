package Programacion;

/*Declara una variable para una temperatura en grados Celsius.
 * Convierte esta temperatura a Fahrenheit utilizando la fórmula F = (C * 9/5) + 32 e 
 * imprime el resultado.
 */


public class act4 {

	public static void main(String[] args) {
		
		double celsius = 30.9;
		double pasarFarenheit = (celsius* 9/5) + 32;

		System.out.println(celsius + "grados celsius son "+ pasarFarenheit + " grados Farenheit");
	}

}
