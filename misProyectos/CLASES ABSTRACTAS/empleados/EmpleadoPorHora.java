package empleados;

public class EmpleadoPorHora extends Empleado {

	private int horasTrabajadas = 160;
	private double precioHora = 11.6;
	private double sueldo = horasTrabajadas * precioHora;

	@Override
	void calcularSalario() {
		System.out.println("Un empleado por horas cobra: " + sueldo);
	}

}
