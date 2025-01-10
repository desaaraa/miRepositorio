package Animal;

public class Main {

	public static void main(String[] args) {
		Animal perro = new Perro();
		Animal gato = new Gato();
		Animal vaca = new Vaca();

		perro.comer();
		perro.hacerSonido();

		gato.comer();
		gato.hacerSonido();

		vaca.comer();
		vaca.hacerSonido();

	}

}
