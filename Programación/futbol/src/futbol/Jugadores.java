package futbol;

public class Jugadores {
	private String nombreJugador;
	private int dorsal;
	private String posicion;

	public Jugadores(String nombreJugador, int dorsal, String posicion) {
		super();
		this.nombreJugador = nombreJugador;
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugadores [nombreJugador=" + nombreJugador + ", dorsal=" + dorsal + ", posicion=" + posicion + "]";
	}

	// Método para añadir jugadores
	public static void anadirJugadores() {

	}

}
