package netflix;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private String contrasenia;
	private String fechaAlta;
	private String metodoPago;
	private String direccion;
	private String pais;
	private String rol; // administrador o usuario
	private String plan;
	private List<Juego> juegos = new ArrayList<>();
	private List<Serie> series = new ArrayList<>();
	private List<Pelicula> peliculas = new ArrayList<>();

	// constructores----------------------------------------------------------------------------

	public Usuario() {
	}

	public Usuario(String nombre, String contrasenia, String fechaAlta, String metodoPago, String direccion,
			String pais, String rol, String plan) {
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.fechaAlta = fechaAlta;
		this.metodoPago = metodoPago;
		this.direccion = direccion;
		this.pais = pais;
		this.rol = rol;
		this.plan = plan;
	}

	public Usuario(String nombre, String contrasenia, String fechaAlta, String metodoPago, String direccion,
			String pais, String rol, String plan, List<Juego> juegos, List<Serie> series, List<Pelicula> peliculas,
			List<Plan> planes) {
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.fechaAlta = fechaAlta;
		this.metodoPago = metodoPago;
		this.direccion = direccion;
		this.pais = pais;
		this.rol = rol;
		this.plan = plan;
		this.juegos = juegos;
		this.series = series;
		this.peliculas = peliculas;
	}

	// getters y
	// setters--------------------------------------------------------------------------

	public String getNombre() {
		return nombre;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contraseña) {
		this.contrasenia = contraseña;
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

	public List<Juego> getJuegos() {
		return juegos;
	}

	public void setJuegos(Juego juego) {
		juegos.add(juego);
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(Serie serie) {
		series.add(serie);
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);
	}

	@Override
	public String toString() {
		return "Usuario{" + "nombre='" + nombre + '\'' + ", contrasenia='" + contrasenia + '\'' + ", fechaAlta='"
				+ fechaAlta + '\'' + ", metodoPago='" + metodoPago + '\'' + ", direccion='" + direccion + '\''
				+ ", pais='" + pais + '\'' + ", rol='" + rol + '\'' + ", plan='" + plan + '\'' + ", juegos=" + juegos
				+ ", series=" + series + ", peliculas=" + peliculas + '}';
	}

}
