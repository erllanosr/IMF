package futbol;

import java.util.ArrayList;

public class Liga {
	private String campeonato;
	private ArrayList<Equipos> listaEquipos = new ArrayList<Equipos>();

	public Liga(String campeonato) {
		super();
		this.campeonato = campeonato;
	}

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}

	public ArrayList<Equipos> getListaEquipos() {
		return listaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipos> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	@Override
	public String toString() {
		return "Liga [campeonato=" + campeonato + ", listaEquipos=" + listaEquipos + "]";
	}

	// Si accedo a un atributo no poner nada en los paréntesis
	// Método para añadir Equipos
	public static void añadirEquipos() {
		
	}

}
