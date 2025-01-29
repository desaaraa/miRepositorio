package netflix;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int respuesta;

		do {

			System.out.println("BIENVENIDO A NETFLIX  :)");
			System.out.println(" ");
			System.out.println("Seleccione la tarea que quiere realizar:");
			System.out.println("1. Registrar usuario");
			System.out.println("2. Iniciar sesion usuario");
			System.out.println("3. Consultar planes");
			System.out.println("4. Salir");

			respuesta = sc.nextInt();

			switch (respuesta) {
			case 1:
				Main.registrarUsuario();
				break;

			case 2:
				Main.iniciarSesionUsuario();
				break;

			case 3:
				consultarPlanes();
				break;

			case 4:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida. Por favor, intente de nuevo.");

			}

		} while (respuesta != 4);
	}

}
