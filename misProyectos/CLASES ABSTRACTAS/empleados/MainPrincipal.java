package empleados;

public class MainPrincipal {

	public static void main(String[] args) {

		Empleado empAsalariado = new EmpleadoAsalariado();
		Empleado empHora = new EmpleadoPorHora();

		empAsalariado.mostrarInfo();
		empAsalariado.calcularSalario();

		empHora.mostrarInfo();
		empHora.calcularSalario();
	}

}
