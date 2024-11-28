package primeros_ejercicioss;

/*Declara dos variables booleanas, una con el valor true y otra con false. 
 * Imprime los resultados de aplicar las operaciones lógicas AND, OR y NOT a 
 * estas variables.
 */

public class act8 {

	public static void main(String[] args) {
		
		boolean guapo = true;
		boolean feo= false; 
		
		boolean resul = guapo && feo;
		boolean resul2 = guapo || feo;
		boolean noGuapo= !guapo;
		boolean noFeo= !feo;
		
		System.out.println("guapo = " + guapo);
		System.out.println("feo = " + feo);
		System.out.println("Guapo AND feo = "+ resul);
		System.out.println("Guapo OR feo = "+ resul2);
		System.out.println("N0 guapo = "+ noGuapo);
		System.out.println("N0 feo = "+ noFeo);
	}

}
