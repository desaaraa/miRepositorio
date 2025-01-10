package netflix;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private String contraseña;
	private String fechaAlta;
	private String metodoPago;
	private String direccion;
	private String pais;
	private String rol; // administrador o usuario

	// constructores----------------------------------------------------------------------------

	public Usuario(String nombre, String contraseña, String fechaAlta, String metodoPago, String direccion, String pais,
			String rol) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.fechaAlta = fechaAlta;
		this.metodoPago = metodoPago;
		this.direccion = direccion;
		this.pais = pais;
		this.rol = rol;
	}

	public Usuario() {
	}

	// getters y
	// setters--------------------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	// metodos

	public void consultarPeliculas() {

		List<Pelicula> peliculas = new ArrayList<>();
	}

	public void consultarSeries() {
		List<Serie> peliculas = new ArrayList<>();
	}

	public void consultarJuegos() {
		List<Juego> juegos = new ArrayList<>();

	}

}
