package Programacion;

/*Declara dos variables enteras con diferentes valores. 
 * Intercambia sus valores sin usar una tercera variable temporal e
 *  imprime los resultados antes y después del intercambio.
 */

public class act6 {

	public static void main(String[] args) {

		int A = 20;
		int B = 40;
		
		System.out.println("A = " + A +" y B = "+ B);
		
		A = A + B;
		B = A - B;
		A= A - B;
		
		System.out.println("A = " + A +" y B = "+ B);
		

	}

}
