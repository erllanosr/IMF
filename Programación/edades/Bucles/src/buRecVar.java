import java.util.Scanner;

public class buRecVar {

	public static void main(String[] args) {
		// Pedir al usuario una nota entre 0 y 10.
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		int nota2 = 0;

		while (nota <= 0 && nota >= 10) {
			System.out.println("Nota 1: Ingresa una nota entre 0 y 10.");
			nota = sc.nextInt();
			System.out.println(nota);
		}

		/*
		 * do { System.out.println("Nota2: Ingresa una nota entre 0 y 10."); nota2 =
		 * sc.nextInt(); } while (nota2 < 0 || nota2 > 10);
		 */
	}

}
