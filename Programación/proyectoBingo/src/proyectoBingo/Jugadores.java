package proyectoBingo;
// PARA VALIDAR SI ALGUIEN TIENE LÍNEA O BINGO:

// Hay que validar después de haber aparecido 10 números para línea y 30 números para el Bingo.
// Y no se puede validar el Bingo si es que no se ha validad antes una línea.

public class Jugadores {
	private String nombre;
	private int dinero=50;
	private int numCartones;
	
	// Constructor
	public Jugadores(String nombre, int dinero, int numCartones) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
		this.numCartones = numCartones;
	}

	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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


	// toString
	@Override
	public String toString() {
		return "Jugadores [nombre=" + nombre + ", dinero=" + dinero + ", numCartones=" + numCartones + "]";
	}
	
	private static void comprar() {
		
	}
	
	

}
