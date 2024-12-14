package Vehiculos;

public class Main_Principal {

	public static void main(String[] args) {

		Vehiculos coche = new Coche();
		Vehiculos bicicleta = new Bicicleta();
		Vehiculos avion = new Avion();

		coche.Encender();
		coche.Mover();

		bicicleta.Encender();
		bicicleta.Mover();

		avion.Encender();
		avion.Mover();
	}

}
