import java.util.Random;
import java.util.Scanner;

public class maquinavshombre {

	public static void main(String[] args) {
		// JUEGO MÁQUINA VS HOMBRE, GANA EL QUE SAQUE LA CARTA MÁS ALTA.

		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		Random azar = new Random();
		int numJug = azar.nextInt(40) + 1;
		int numMaq = azar.nextInt(40) + 1;

		// ZONA EJECUTIVA
		System.out.println("Tu número es:");

		// NÚMERO JUGADOR
		switch (numJug) {
		case 1:
			System.out.println("AS de Oros.");
			break;
		case 2:
			System.out.println("2 de Oros");
			break;
		case 3:
			System.out.println("3 de Oros");
			break;
		case 4:
			System.out.println("4 de Oros");
			break;
		case 5:
			System.out.println("5 de Oros");
			break;
		case 6:
			System.out.println("6 de Oros");
			break;
		case 7:
			System.out.println("7 de Oros");
			break;
		case 8:
			System.out.println("SOTA de Oros");
			break;
		case 9:
			System.out.println("CABALLO de Oros");
			break;
		case 10:
			System.out.println("REY de Oros");
			break;
		case 11:
			System.out.println("AS de Espadas");
			break;
		case 12:
			System.out.println("2 de Espadas");
			break;
		case 13:
			System.out.println("3 de Espadas");
			break;
		case 14:
			System.out.println("4 de Espadas");
			break;
		case 15:
			System.out.println("5 de Espadas");
			break;
		case 16:
			System.out.println("6 de Espadas");
			break;
		case 17:
			System.out.println("7 de Espadas");
			break;
		case 18:
			System.out.println("SOTA de Espadas");
			break;
		case 19:
			System.out.println("CABALLO de Espadas");
			break;
		case 20:
			System.out.println("REY de Espadas");
			break;
		case 21:
			System.out.println("AS de Copas");
			break;
		case 22:
			System.out.println("2 de Copas");
			break;
		case 23:
			System.out.println("3 de Copas");
			break;
		case 24:
			System.out.println("4 de Copas");
			break;
		case 25:
			System.out.println("5 de Copas");
			break;
		case 26:
			System.out.println("6 de Copas");
			break;
		case 27:
			System.out.println("7 de Copas");
			break;
		case 28:
			System.out.println("SOTA de Copas");
			break;
		case 29:
			System.out.println("CABALLO de Copas");
			break;
		case 30:
			System.out.println("REY de Copas");
			break;
		case 31:
			System.out.println("AS de Bastos");
			break;
		case 32:
			System.out.println("2 de Bastos");
			break;
		case 33:
			System.out.println("3 de Bastos");
			break;
		case 34:
			System.out.println("4 de Bastos");
			break;
		case 35:
			System.out.println("5 de Bastos");
			break;
		case 36:
			System.out.println("6 de Bastos");
			break;
		case 37:
			System.out.println("7 de Bastos");
			break;
		case 38:
			System.out.println("SOTA de Bastos");
			break;
		case 39:
			System.out.println("CABALLO de Bastos");
			break;
		case 40:
			System.out.println("REY de Bastos");
			break;
		}

		// NÚMERO MÁQUINA
		System.out.println("El número de la máquina es:");
		switch (numMaq) {
		case 1:
			System.out.println("1 de Oros.");
			break;
		case 2:
			System.out.println("2 de Oros");
			break;
		case 3:
			System.out.println("3 de Oros");
			break;
		case 4:
			System.out.println("4 de Oros");
			break;
		case 5:
			System.out.println("5 de Oros");
			break;
		case 6:
			System.out.println("6 de Oros");
			break;
		case 7:
			System.out.println("7 de Oros");
			break;
		case 8:
			System.out.println("8 de Oros");
			break;
		case 9:
			System.out.println("9 de Oros");
			break;
		case 10:
			System.out.println("10 de Oros");
			break;
		case 11:
			System.out.println("1 de Espadas");
			break;
		case 12:
			System.out.println("2 de Espadas");
			break;
		case 13:
			System.out.println("3 de Espadas");
			break;
		case 14:
			System.out.println("4 de Espadas");
			break;
		case 15:
			System.out.println("5 de Espadas");
			break;
		case 16:
			System.out.println("6 de Espadas");
			break;
		case 17:
			System.out.println("7 de Espadas");
			break;
		case 18:
			System.out.println("8 de Espadas");
			break;
		case 19:
			System.out.println("9 de Espadas");
			break;
		case 20:
			System.out.println("10 de Espadas");
			break;
		case 21:
			System.out.println("1 de Copas");
			break;
		case 22:
			System.out.println("2 de Copas");
			break;
		case 23:
			System.out.println("3 de Copas");
			break;
		case 24:
			System.out.println("4 de Copas");
			break;
		case 25:
			System.out.println("5 de Copas");
			break;
		case 26:
			System.out.println("6 de Copas");
			break;
		case 27:
			System.out.println("7 de Copas");
			break;
		case 28:
			System.out.println("8 de Copas");
			break;
		case 29:
			System.out.println("9 de Copas");
			break;
		case 30:
			System.out.println("10 de Copas");
			break;
		case 31:
			System.out.println("1 de Bastos");
			break;
		case 32:
			System.out.println("2 de Bastos");
			break;
		case 35:
			System.out.println("3 de Bastos");
			break;
		case 36:
			System.out.println("4 de Bastos");
			break;
		case 37:
			System.out.println("5 de Bastos");
			break;
		case 38:
			System.out.println("6 de Bastos");
			break;
		case 39:
			System.out.println("7 de Bastos");
			break;
		case 40:
			System.out.println("8 de Bastos");
			break;
		}

		// RESULTADO
		if (numJug > numMaq) {
			System.out.println("Gana el jugador.");
		} else if (numJug < numMaq) {
			System.out.println("Gana la máquina");
		} else if (numJug == numMaq) {
			System.out.println("Empate");
		}

	}
}
