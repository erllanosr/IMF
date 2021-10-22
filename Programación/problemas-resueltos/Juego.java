import java.util.Random;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// juego clásico de piedra papel tijeras

		int maquina;
		int jugador;
		int contadorEmpates = 0;
		int contadorMaquina = 0;
		int contadorJugador = 0;
		Scanner sc = new Scanner(System.in);
		Random azar = new Random();

		// jugar máquina

		maquina = azar.nextInt(3) + 1; // 1-papel 2-piedra 3-tijeras

		// jugar jugador

		System.out.println("Pon 1-papel 2-piedra 3-tijeras");
		jugador = sc.nextInt();

		// evaluar

		if (maquina == jugador) {
			contadorEmpates++;// contadorEmpates=contadorEmpates+1;
		} else {
			switch (maquina) {
			case 1:
				switch (jugador) {
				case 2:
					contadorMaquina++;
					break;
				case 3:
					contadorJugador++;
				}
				break;
			case 2:
				switch (jugador) {
				case 1:
					contadorJugador++;
					break;
				case 3:
					contadorMaquina++;
				}
				break;
			case 3:
				switch (jugador) {
				case 1:
					contadorMaquina++;
					break;
				case 2:
					contadorJugador++;
				}
				break;
			}
		}
		
		
		//ESTADO PARTIDA
		
		System.out.println("La máquina saca: " + maquina + " y el jugador saca: " + jugador);
		
		// mostrar resultados
		System.out.println("Máquina gana: " + contadorMaquina);
		System.out.println("Jugador gana: " + contadorJugador);
		System.out.println("Empates: " + contadorEmpates);

		// RONDA 2

		// jugar máquina

		maquina = azar.nextInt(3) + 1; // 1-papel 2-piedra 3-tijeras

		// jugar jugador

		System.out.println("Pon 1-papel 2-piedra 3-tijeras");
		jugador = sc.nextInt();

		// evaluar

		if (maquina == jugador) {
			contadorEmpates++;// contadorEmpates=contadorEmpates+1;
		} else {
			switch (maquina) {
			case 1:
				switch (jugador) {
				case 2:
					contadorMaquina++;
					break;
				case 3:
					contadorJugador++;
				}
				break;
			case 2:
				switch (jugador) {
				case 1:
					contadorJugador++;
					break;
				case 3:
					contadorMaquina++;
				}
				break;
			case 3:
				switch (jugador) {
				case 1:
					contadorMaquina++;
					break;
				case 2:
					contadorJugador++;
				}
				break;
			}
		}
		
		//ESTADO PARTIDA
		
		System.out.println("La máquina saca: " + maquina + " y el jugador saca: " + jugador);
		
		// mostrar resultados
		System.out.println("Máquina gana: " + contadorMaquina);
		System.out.println("Jugador gana: " + contadorJugador);
		System.out.println("Empates: " + contadorEmpates);

		// RONDA 3

		// jugar máquina

		maquina = azar.nextInt(3) + 1; // 1-papel 2-piedra 3-tijeras

		// jugar jugador

		System.out.println("Pon 1-papel 2-piedra 3-tijeras");
		jugador = sc.nextInt();

		// evaluar

		if (maquina == jugador) {
			contadorEmpates++;// contadorEmpates=contadorEmpates+1;
		} else {
			switch (maquina) {
			case 1:
				switch (jugador) {
				case 2:
					contadorMaquina++;
					break;
				case 3:
					contadorJugador++;
				}
				break;
			case 2:
				switch (jugador) {
				case 1:
					contadorJugador++;
					break;
				case 3:
					contadorMaquina++;
				}
				break;
			case 3:
				switch (jugador) {
				case 1:
					contadorMaquina++;
					break;
				case 2:
					contadorJugador++;
				}
				break;
			}
		}
		
		//ESTADO PARTIDA
		
		System.out.println("La máquina saca: " + maquina + " y el jugador saca: " + jugador);
		

		// mostrar resultados
		System.out.println("Máquina gana: " + contadorMaquina);
		System.out.println("Jugador gana: " + contadorJugador);
		System.out.println("Empates: " + contadorEmpates);

	}

}
