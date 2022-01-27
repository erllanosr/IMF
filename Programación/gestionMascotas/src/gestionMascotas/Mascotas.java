package gestionMascotas;

public class Mascotas {
	private String tipo;
	private String nombre;

	// Constructor
	public Mascotas(String tipo, String nombre) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
	}

	// Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Mascotas [tipo=" + tipo + ", nombre=" + nombre + "]";
	}

}
