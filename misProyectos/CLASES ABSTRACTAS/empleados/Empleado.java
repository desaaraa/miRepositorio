package empleados;

/*1.	Crea una clase abstracta Empleado con: 
*o	Un atributo nombre.
*o	Un método abstracto calcularSalario().
*o	Un método concreto mostrarInfo() que imprima el nombre del empleado.
*2.	Implementa dos subclases: 
*o	EmpleadoAsalariado que reciba un salario fijo.
*o	EmpleadoPorHora que reciba las horas trabajadas y la tarifa por hora.
*3.	Calcula y muestra el salario de diferentes empleados.
*/

public abstract class Empleado {

	protected String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public abstract double calcularSalario();

	public void mostrarInfo() {
		System.out.println("Nombre del empleado: " + nombre);
	}
}
