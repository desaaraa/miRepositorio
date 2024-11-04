package exceptions;

public class EdadInvalidaException extends Exception {

	public EdadInvalidaException (){
		
		System.out.println("La edad introducida debe ser un numero entero");
		return;

	}

}
