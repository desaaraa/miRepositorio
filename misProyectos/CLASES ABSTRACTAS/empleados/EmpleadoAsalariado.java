package empleados;

public class EmpleadoAsalariado extends Empleado {
	private double salarioFijo;

	public EmpleadoAsalariado(String nombre, double salarioFijo) {
		super(nombre);
		this.salarioFijo = salarioFijo;
	}

	@Override
	public double calcularSalario() {
		return salarioFijo;
	}
}
