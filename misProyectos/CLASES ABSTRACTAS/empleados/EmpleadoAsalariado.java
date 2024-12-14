package empleados;

public class EmpleadoAsalariado extends Empleado {

	private int sueldo = 1500;

	@Override
	void calcularSalario() {
		System.out.println("Un empleado asalariado cobra: " + sueldo);
	}

}
