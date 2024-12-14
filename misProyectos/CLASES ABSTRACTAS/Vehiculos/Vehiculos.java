package Vehiculos;

/*Ejercicio 2: Vehículos
1.	Define una clase abstracta Vehiculo con: 
o	Un método abstracto mover().
o	Un método concreto encender() que imprima "El vehículo está encendido".
2.	Crea subclases como Coche, Bicicleta y Avion, cada una con su implementación del método mover().
3.	Instancia varios vehículos y llama a sus métodos desde una clase principal.
*/
public abstract class Vehiculos {

	abstract void Mover();

	public void Encender() {
		System.out.println("El vehículo está encendido");
	}

}
