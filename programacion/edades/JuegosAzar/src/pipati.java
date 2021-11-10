import java.util.Random;
import java.util.Scanner;

public class pipati {

	public static void main(String[] args) {
		// JUEGO PIEDRA, PAPEL Y TIJERA
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		Random azar = new Random();
		int numJug;
		int numMaq = azar.nextInt(3) + 1;

		// ZONA EJECUTIVA
		/*
		 * RONDA 1 - ELECCIÓN DEL JUGADOR
		 */
		System.out.println("RONDA 1.");
		System.out.println("Elige con qué jugar: 1. Piedra. 2. Papel. 3. Tijeras.");
		numJug = sc.nextInt();
		switch (numJug) {
		case 1:
			System.out.println("Juegas con: Piedra");
			break;
		case 2:
			System.out.println("Juegas con: Papel.");
			break;
		case 3:
			System.out.println("Juegas con: Tijeras.");
			break;
		}
		// OPCIÓN DE LA MÁQUINA
		switch (numMaq) {
		case 1:
			System.out.println("La máquina juega con: Piedra.");
			break;
		case 2:
			System.out.println("La máquina juega con: Papel.");
			break;
		case 3:
			System.out.println("La máquina juega con: Tijeras.");
			break;
		}
		// SABER QUIÉN GANA
		if (numJug == 1 && numMaq == 1) {
			System.out.println("Empate.");
		} else if (numJug == 1 && numMaq == 2) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 1 && numMaq == 3) {
			System.out.println("Gana el jugador.");
		} else if (numJug == 2 && numMaq == 1) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 2 && numMaq == 2) {
			System.out.println("Empate.");
		} else if (numJug == 2 && numMaq == 3) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 3 && numMaq == 1) {
			System.out.println("Gana el jugador.");
		} else if (numJug == 3 && numMaq == 2) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 3 && numMaq == 3) {
			System.out.println("Empate.");
		}
		/*
		 * RONDA 2 - ELECCIÓN DEL JUGADOR
		 */
		System.out.println("RONDA 2.");
		System.out.println("Elige con qué jugar: 1. Piedra. 2. Papel. 3. Tijeras.");
		numJug = sc.nextInt();
		switch (numJug) {
		case 1:
			System.out.println("Juegas con: Piedra");
			break;
		case 2:
			System.out.println("Juegas con: Papel.");
			break;
		case 3:
			System.out.println("Juegas con: Tijeras.");
			break;
		}
		switch (numMaq) {
		case 1:
			System.out.println("La máquina juega con: Piedra.");
			break;
		case 2:
			System.out.println("La máquina juega con: Papel.");
			break;
		case 3:
			System.out.println("La máquina juega con: Tijeras.");
			break;
		}
		if (numJug == 1 && numMaq == 1) {
			System.out.println("Empate.");
		} else if (numJug == 1 && numMaq == 2) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 1 && numMaq == 3) {
			System.out.println("Gana el jugador.");
		} else if (numJug == 2 && numMaq == 1) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 2 && numMaq == 2) {
			System.out.println("Empate.");
		} else if (numJug == 2 && numMaq == 3) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 3 && numMaq == 1) {
			System.out.println("Gana el jugador.");
		} else if (numJug == 3 && numMaq == 2) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 3 && numMaq == 3) {
			System.out.println("Empate.");
		}
		/*
		 * RONDA 3 - ELECCIÓN DEL JUGADOR
		 */
		System.out.println("RONDA 3.");
		System.out.println("Elige con qué jugar: 1. Piedra. 2. Papel. 3. Tijeras.");
		numJug = sc.nextInt();
		switch (numJug) {
		case 1:
			System.out.println("Juegas con: Piedra");
			break;
		case 2:
			System.out.println("Juegas con: Papel.");
			break;
		case 3:
			System.out.println("Juegas con: Tijeras.");
			break;
		}
		switch (numMaq) {
		case 1:
			System.out.println("La máquina juega con: Piedra.");
			break;
		case 2:
			System.out.println("La máquina juega con: Papel.");
			break;
		case 3:
			System.out.println("La máquina juega con: Tijeras.");
			break;
		}
		if (numJug == 1 && numMaq == 1) {
			System.out.println("Empate.");
		} else if (numJug == 1 && numMaq == 2) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 1 && numMaq == 3) {
			System.out.println("Gana el jugador.");
		} else if (numJug == 2 && numMaq == 1) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 2 && numMaq == 2) {
			System.out.println("Empate.");
		} else if (numJug == 2 && numMaq == 3) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 3 && numMaq == 1) {
			System.out.println("Gana el jugador.");
		} else if (numJug == 3 && numMaq == 2) {
			System.out.println("Gana la máquina.");
		} else if (numJug == 3 && numMaq == 3) {
			System.out.println("Empate.");
		}
	}

}
