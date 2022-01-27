package gestionMascotas;

public class Personas {
	private String dni;
	private String nombre;

	// Constructor
	public Personas(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	// Getters and Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// toString
	@Override
	public String toString() {
		return "Personas [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
