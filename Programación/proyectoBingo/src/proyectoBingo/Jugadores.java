package proyectoBingo;

public class Jugadores {
	private String nombre;
	private int edad;
	private int dinero;
	private int numCartones;

	public Jugadores(String nombre, int edad, int dinero, int numCartones) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.numCartones = numCartones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getNumCartones() {
		return numCartones;
	}

	public void setNumCartones(int numCartones) {
		this.numCartones = numCartones;
	}

}
