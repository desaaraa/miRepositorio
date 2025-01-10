package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		Libro libroFisico = new LibroFisico("Titanic", "Pedro", "Tragedia", true, "estanteriaA", 600);
		Libro libroFisico2= new LibroFisico("Por ella", "Juan", "Amor", true, "estanteriaB", 200);
		Libro libroFisico3= new LibroFisico("Lagrimas de sal", "Paco", "Comedia", false, "estanteriaC", 300);

		Libro libroDigital= new LibroDigital("Furia", "Estrella", "Amor", true, 100, "avd");
		Libro libroDigital2= new LibroDigital("Inside out", "Julia", "Dibujos animados", true, 300, "avd");
		Libro libroDigital3= new LibroDigital("Vaiana2", "Sara", "Dibujos", false, 500, "avd");


		// metodos

		public void listarLibros() {

			libroDigital.mostrarInfo();
			libroDigital2.mostrarInfo();
			libroDigital3.mostrarInfo();
			
			libroFisico.mostrarInfo();
			libroFisico2.mostrarInfo();
			libroFisico3.mostrarInfo();
		}

		public String buscarLibro() {
			System.out.println("Que libro quieres buscar: ");
			String respuesta= sc.nextLine();
			
			if (respuesta== libroFisico.getTitulo()|| respuesta== libroFisico2.getTitulo()|| respuesta== libroFisico3.getTitulo() 
					|| respuesta== libroDigital.getTitulo()|| respuesta== libroDigital2.getTitulo()|| respuesta== libroDigital3.getTitulo()){
				String answer= "El libro está en la biblioteca" ;
				return answer;
			}else {
				String answer2= "El libro no está en la biblioteca";
			return answer2; 
			}
			
		}
		
		public 

	}

}
