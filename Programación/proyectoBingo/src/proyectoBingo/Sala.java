package proyectoBingo;

import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
	private int numJugadores;
	private ArrayList<Jugadores> listaJugadores;

	// Método para crear jugadores.
	private void crearNumJugadores() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el número de jugadores:");
		numJugadores = sc.nextInt();
	}

}
