package futbol;

import java.util.ArrayList;

public class Equipos {
	private String nombre;
	private ArrayList<Jugadores> listaJugadores = new ArrayList<Jugadores>();
	private ArrayList<Liga> listaLigas = new ArrayList<Liga>();
	public Equipos(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Jugadores> getListaJugadores() {
		return listaJugadores;
	}
	public void setListaJugadores(ArrayList<Jugadores> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	public ArrayList<Liga> getListaLigas() {
		return listaLigas;
	}
	public void setListaLigas(ArrayList<Liga> listaLigas) {
		this.listaLigas = listaLigas;
	}
	@Override
	public String toString() {
		return "Equipos [nombre=" + nombre + ", listaJugadores=" + listaJugadores + ", listaLigas=" + listaLigas + "]";
	}

	

}
