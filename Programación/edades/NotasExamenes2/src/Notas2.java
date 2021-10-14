import java.util.Scanner;

public class Notas2 {

	public static void main(String[] args) {
		// Nuevos métodos y mejores para Notas Exámenes
		// Zona Declarativa
		int nota;
		nota = 6;

		// Zona Ejecutiva
		if (nota < 5) {
			System.out.println("Suspenso.");
		} else if (nota < 7) {
			System.out.println("Aprobado.");
		} else if (nota < 9) {
			System.out.println("Notable.");
		} else {
			System.out.println("Sobresaliente.");
		}
	}

}
