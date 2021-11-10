import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// NOTAS EXÁMENES
		// ZONA DECLARATIVA
		/*
		 * Todos los ifs deben de tener un */
		Scanner sc = new Scanner(System.in);
		int nota;

		// ZONA EJECUTIVA
		System.out.println("Introduce una nota entre 1 - 10:");
		nota = sc.nextInt();

		//	INSERTAR MENSAJE DE ERROR
		if (nota >= 0 && nota <= 4) {
			System.out.println("Suspenso");
		} else {
			if (nota >= 5 && nota <= 6) {
				System.out.println("Aprobado");
			} else {
				if (nota >= 7 && nota <= 8) {
					System.out.println("Notable");
				} else {
					System.out.println("Sobresaliente");
				}
			}
		}
	}
}
