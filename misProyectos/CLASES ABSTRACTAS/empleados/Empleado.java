package empleados;

import java.util.Scanner;

public abstract class Empleado {

	Scanner sc = new Scanner(System.in);

	protected String nombre;

	abstract void calcularSalario();

	public void mostrarInfo() {
		System.out.println("Introduzca el nombre del empleado: ");
		nombre = sc.nextLine();
	}

}
