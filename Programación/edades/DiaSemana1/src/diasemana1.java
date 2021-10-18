import java.util.Scanner;

public class diasemana1 {

	public static void main(String[] args) {
		// Día de la semana
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int dia;

		// ZONA EJECUTIVA
		System.out.println("Introduce un número (1-7) para saber qué día de la semana es.");
		dia = sc.nextInt();

		/*
		 * CON ELSE IF if (dia == 1) { System.out.println("Lunes"); } else if (dia == 2)
		 * { System.out.println("Martes"); } else if (dia == 3) {
		 * System.out.println("Miércoles"); } else if (dia == 4) {
		 * System.out.println("Jueves"); } else if (dia == 5) {
		 * System.out.println("Viernes"); } else if (dia == 6) {
		 * System.out.println("Sábado"); } else { // Poner else if o solo else¿? Porque
		 * solo hay 7 días. Si escribe 8, 9, etc. el syso sigue siendo domingo
		 * System.out.println("Domingo"); }
		 */
		// CON SWITCH
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}

}
