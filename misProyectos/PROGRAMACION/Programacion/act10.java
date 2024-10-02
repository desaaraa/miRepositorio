package Programacion;

/*Declara una variable para el precio de un producto
 *  y otra para el porcentaje de IVA (por ejemplo, 21%). 
 *  Calcula el precio final incluyendo el IVA e imprime el resultado.
 */

public class act10 {

	public static void main(String[] args) {
		
		double precioProducto = 30.9;
		double iva = 21.0;
		
		double precioIva = precioProducto *(iva/100);
		double precioFinal = precioProducto + precioIva;
		
		System.out.println("El precio de su articulo sin iva es "+ precioProducto+ " y con iva es "+ precioFinal);
		

	}

}
