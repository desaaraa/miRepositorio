package empleados;

public class MainPrincipal {

	public static void main(String[] args) {
		Empleado empAsalariado = new EmpleadoAsalariado("Carlos", 3000.00);
		Empleado empPorHora = new EmpleadoPorHora("Ana", 160, 15.00);

		empAsalariado.mostrarInfo();
		System.out.println("Salario: " + empAsalariado.calcularSalario());

		empPorHora.mostrarInfo();
		System.out.println("Salario: " + empPorHora.calcularSalario());
	}
}
