import java.util.Scanner;

public class caso18 {

	public static void main(String[] args) {
		// Programa lector de notas
		float nota;
		int numeroNotas = 3;
		Scanner lector = new Scanner(System.in);

		for (int i = 1; i <= numeroNotas; i++) {
			do {
				System.out.println("Introduce una nota " + i);
				nota = lector.nextFloat();
			} while (nota < 0 || nota > 10);

		}

	}

}
