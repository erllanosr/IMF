import java.util.Random;

public class listaClase {

	public static void main(String[] args) {
		// Elegir aleatoriamente una persona de clase
		// Zona declarativa
		Random azar = new Random();
		int alumno = azar.nextInt(14) + 1; // Entre 1 y 14.
		// Zona ejecutiva
		switch (alumno) {
		case 1:
			System.out.println("Jorge");
			break;
		case 2:
			System.out.println("Elena");
			break;
		case 3:
			System.out.println("Adrián");
			break;
		case 4:
			System.out.println("Carlos");
			break;
		case 5:
			System.out.println("José");
			break;
		case 6:
			System.out.println("Amir");
			break;
		case 7:
			System.out.println("Miguel");
			break;
		case 8:
			System.out.println("Tania");
			break;
		case 9:
			System.out.println("Paula P.");
			break;
		case 10:
			System.out.println("Paula R.");
			break;
		case 11:
			System.out.println("Piero");
			break;
		case 12:
			System.out.println("Erick");
			break;
		case 13:
			System.out.println("David");
			break;
		case 14:
			System.out.println("Hillary");
			break;
		default:
			System.out.println("Extraño");
			break;
		}

	}

}
