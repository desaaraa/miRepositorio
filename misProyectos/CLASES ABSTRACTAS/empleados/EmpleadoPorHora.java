package empleados;

public class EmpleadoPorHora extends Empleado {
	private int horasTrabajadas;
	private double tarifaPorHora;

	public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifaPorHora) {
		super(nombre);
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaPorHora = tarifaPorHora;
	}

	@Override
	public double calcularSalario() {
		return horasTrabajadas * tarifaPorHora;
	}
}
