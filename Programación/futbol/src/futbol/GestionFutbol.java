package futbol;

import java.util.ArrayList;

public class GestionFutbol {

	public static void main(String[] args) {

		Jugadores misJugadores = new Jugadores("Roberto Carlos", 3, "Defensa");
		Equipos Rayo = new Equipos("Rayo Vallecano");
		Jugadores pepe = new Jugadores("pepe", 3, "defensa", Rayo);
		Jugadores carlos = new Jugadores("Carlos", 2, "defensa");
		Liga listaLiga = new Liga("Campeonato 2022");


	}

}
