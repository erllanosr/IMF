import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// CASO 1: Pide números al usuario hasta que el número introducido sea menor que
		// el anterior.
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int num;
		int acumulado = 0;

		// ZONA EJECUTIVA

		System.out.println("Introduce un número:");
		num = sc.nextInt();

		do {

			if (num >= acumulado) {
				acumulado = num;
				System.out.println("Introduce otro:");
				num = sc.nextInt();
			}

		} while (num >= acumulado);

		System.out.println("FIN DEL PROGRAMA");

	}
	

}
