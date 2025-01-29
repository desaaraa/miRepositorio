package netflix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();

	private static Plan planBasicoAnuncios = new Plan(5.99, 2, "basico con anuncios");
	private static Plan planBasico = new Plan(9.99, 4, "basico sin anuncios");
	private static Plan planPremium = new Plan(15.99, 7, "premium");

	private static Pelicula peli1 = new Pelicula("Titanic", "James Cameron", "Catastrofe", 1997, 197);
	private static Pelicula peli2 = new Pelicula("Inside Out", "Pete Docter", "Dibujos Animados", 2015, 190);
	private static Pelicula peli3 = new Pelicula("Loco por ella", "Dani de la Orden", "Romance", 2021, 180);

	// capitulos temporada 1 serie 1
	private static List<Capitulo> capsTemporada1Serie1 = new ArrayList<>();

	// capitulos temporada 10 serie 2

	private static List<Capitulo> capsTemporada1Serie2 = new ArrayList<>();

	// capitulos temporada 6 serie 3

	private static List<Capitulo> capsTemporada1Serie3 = new ArrayList<>();

	// creación temporadas

	private static List<Temporada> temporadasSerie1 = new ArrayList<>();
	private static List<Temporada> temporadasSerie2 = new ArrayList<>();
	private static List<Temporada> temporadasSerie3 = new ArrayList<>();

	// creación series

	private static Serie serie1 = new Serie("Accion", "Breaking Bad", temporadasSerie1);
	private static Serie serie2 = new Serie("Comedia", "Estrellas", temporadasSerie2);
	private static Serie serie3 = new Serie("Comedia", "Detrás tuya", temporadasSerie3);

	// cprivate static reación juegos

	private static Juego juego1 = new Juego("CazaFantasmas", "Terror", "Steam");
	private static Juego juego2 = new Juego("GTA_V", "Acción", "Rockstar");
	private static Juego juego3 = new Juego("HundirElBarco", "Estrategia", "Steam");

	// usuarios

	private static Usuario admin = new Usuario("admin", "patata", "14/01/2025", "cheque empresa", "C/Altamira",
			"España", "administrador", "Premium");
	private static Usuario sara = new Usuario("sara", "patata", "14/01/2025", "cheque empresa", "C/Altamira", "España",
			"administrador", "Premium");

	public static void main(String[] args) {

		// capitulos temporada 1 serie 1

		capsTemporada1Serie1.add(new Capitulo(8, 1, "Matar o morir", 50, "Español e inglés"));
		capsTemporada1Serie1.add(new Capitulo(1, 1, "El mal", 47, "Español e inglés"));
		capsTemporada1Serie1.add(new Capitulo(6, 1, "El bien", 48, "Español e inglés"));

		// capitulos temporada 10 serie 2

		capsTemporada1Serie2.add(new Capitulo(2, 1, "Mirar", 51, "Español e inglés"));
		capsTemporada1Serie2.add(new Capitulo(11, 1, "El gato", 40, "Español e inglés"));
		capsTemporada1Serie2.add(new Capitulo(3, 1, "El perro", 42, "Español e inglés"));

		// capitulos temporada 6 serie 3

		capsTemporada1Serie3.add(new Capitulo(2, 1, "Las gafas", 59, "Español e inglés"));
		capsTemporada1Serie3.add(new Capitulo(11, 1, "Los ojos", 41, "Español e inglés"));
		capsTemporada1Serie3.add(new Capitulo(3, 1, "37 dias", 43, "Español e inglés"));

		// temporadas ->

		temporadasSerie1.add(new Temporada(1, 2006, capsTemporada1Serie1));
		temporadasSerie2.add(new Temporada(1, 2021, capsTemporada1Serie2));
		temporadasSerie3.add(new Temporada(6, 2022, capsTemporada1Serie3));

		// usuarios

		listaUsuarios.add(sara);
		listaUsuarios.add(admin);

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
				registrarUsuario();
				break;

			case 2:
				iniciarSesionUsuario();
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

	public static void registrarUsuario() {

		System.out.print("Nombre de usuario: ");
		String nombre = sc.next();

		System.out.print("Contraseña: ");
		String contrasenia = sc.next();

		System.out.print("Fecha de alta: ");
		String fechaAlta = sc.next();

		System.out.print("Método de pago: ");
		String metodoPago = sc.next();

		System.out.print("Dirección: ");
		String direccion = sc.next();

		System.out.print("País: ");
		String pais = sc.next();

		System.out.print("Rol (administrador/usuario): ");
		String rol = sc.next();

		System.out.print("Plan:  basico con anuncios /basico/ premium");
		String plan = sc.next();

		Usuario usuario = new Usuario(nombre, contrasenia, fechaAlta, metodoPago, direccion, pais, rol, plan);

		listaUsuarios.add(usuario);
		System.out.println("Usuario registrado con éxito.");

		// Imprimir los detalles del usuario registrado usando getters
		System.out.println("\nUsuario registrado con éxito:");
		System.out.println("Nombre: " + usuario.getNombre());
		System.out.println("Contraseña: " + usuario.getContrasenia());
		System.out.println("Fecha de Alta: " + usuario.getFechaAlta());
		System.out.println("Método de Pago: " + usuario.getMetodoPago());
		System.out.println("Dirección: " + usuario.getDireccion());
		System.out.println("País: " + usuario.getPais());
		System.out.println("Rol: " + usuario.getRol());
		System.out.println("Plan: " + usuario.getPlan());

	}

	public static void iniciarSesionUsuario() {

		sc.nextLine();

		System.out.print("Nombre de usuario: ");
		String nombre = sc.nextLine();

		System.out.print("Contraseña: ");
		String contrasenia = sc.nextLine();

		boolean sesionIniciada = false;

		for (Usuario usuario : listaUsuarios) {
			if (usuario.getNombre() != null && usuario.getContrasenia() != null && usuario.getNombre().equals(nombre)
					&& usuario.getContrasenia().equals(contrasenia)) {

				System.out.println("Sesión iniciada con éxito.");

				sesionIniciada = true;

				menuAlIniciarSesion();

			} else if (!sesionIniciada)
				System.out.println("Nombre de usuario o contraseña incorrectos.");
		}
	}

	public static void menuAlIniciarSesion() {

		int respuesta;

		do {

			System.out.println("BIENVENIDO A TU CUENTA  :)");
			System.out.println(" ");
			System.out.println("Seleccione la tarea que quiere realizar:");
			System.out.println("1. Registrar una pelicula");
			System.out.println("2. Registrar una serie");
			System.out.println("3. Registrar un juego");
			System.out.println("4. Consultar información de tu usuario");
			System.out.println("5. Salir");

			respuesta = sc.nextInt();
			sc.nextLine();

			switch (respuesta) {
			case 1:
				registrarPelicula();
				break;

			case 2:
				registrarSerie();
				break;

			case 3:
				registrarJuego();
				break;

			case 4:
				consultarInfoUsuario();

			case 5:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida. Por favor, intente de nuevo.");

			}

		} while (respuesta != 5);

	}

	public static void consultarPlanes() {

		System.out.println("Plan básico con anuncios:" + planBasicoAnuncios.toString());
		System.out.println("Plan básico sin anuncios:" + planBasico.toString());
		System.out.println("Plan premium sin anuncios:" + planPremium.toString());

	}

	public static void registrarPelicula() {

		System.out.println(peli1.toString());
		System.out.println(peli2.toString());
		System.out.println(peli3.toString());

		List<Pelicula> listaPelis = new ArrayList<Pelicula>();
		listaPelis.add(peli1);
		listaPelis.add(peli2);
		listaPelis.add(peli3);

		System.out.println(" ");
		System.out.println("¿Qué película quieres registrar en tu cuenta?");
		String peliculaARegistrar = sc.nextLine();
		System.out.println("Introduzca su nombre de usuario:");
		String user = sc.nextLine();

		for (Usuario usuario : listaUsuarios) {

			if (user.equals(usuario.getNombre())) {

				for (Pelicula pelicula : listaPelis) {
					if (pelicula.getNombre().equals(peliculaARegistrar)) {
						usuario.setPelicula(pelicula);
						System.out.println("Película registrada con éxito.");
						return;
					}

				}

			}
		}

		System.out.println("Usuario no encontrado.");

	}

	public static void registrarSerie() {

		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());

		List<Serie> listaSeries = new ArrayList<Serie>();
		listaSeries.add(serie1);
		listaSeries.add(serie2);
		listaSeries.add(serie3);

		System.out.println(" ");
		System.out.println("¿Qué serie quieres registrar en tu cuenta?");
		String serieARegistrar = sc.nextLine();
		System.out.println("Introduzca su nombre de usuario:");
		String user = sc.nextLine();

		for (Usuario usuario : listaUsuarios) {

			if (user.equals(usuario.getNombre())) {

				for (Serie serie : listaSeries) {
					if (serie.getNombre().equals(serieARegistrar)) {
						usuario.setSeries(serie);
						System.out.println("Serie registrada con éxito.");
						return;
					}

				}

			} else
				System.out.println("Usuario no encontrado.");

		}
	}

	public static void registrarJuego() {

		System.out.println(juego1.toString());
		System.out.println(juego2.toString());
		System.out.println(juego3.toString());

		List<Juego> listaJuegos = new ArrayList<Juego>();
		listaJuegos.add(juego1);
		listaJuegos.add(juego2);
		listaJuegos.add(juego3);

		System.out.println(" ");
		System.out.println("¿Qué juego quieres registrar en tu cuenta?");
		String juegoARegistrar = sc.nextLine();
		System.out.println("Introduzca su nombre de usuario:");
		String user = sc.nextLine();

		for (Usuario usuario : listaUsuarios) {

			if (user.equals(usuario.getNombre())) {

				for (Juego juegos : listaJuegos) {
					if (juegos.getNombre().equals(juegoARegistrar)) {
						usuario.setJuegos(juegos);
						System.out.println("Juego registrado con éxito.");
						return;
					}

				}

			} else
				System.out.println("Usuario no encontrado.");

		}

	}

	public static void consultarInfoUsuario() {

		System.out.print("Introduzca tu nombre de usuario: ");
		String nombreUsuario = sc.nextLine();

		for (Usuario usuario : listaUsuarios) {
			if (usuario.getNombre().equalsIgnoreCase(nombreUsuario)) {
				System.out.println(usuario.toString());
				return;

			}

		}

		System.out.println("Usuario no encontrado.");

	}

}
