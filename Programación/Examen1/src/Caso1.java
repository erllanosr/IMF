import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// CASO 1: Pide números al usuario hasta que el número introducido sea menor que
		// el anterior.
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int numUsuario;
		int numAnterior;

		// Zona Ejecutiva
		
		do {
			System.out.println("Introduce números, de uno en uno:");
			numUsuario = sc.nextInt();
			numAnterior = numUsuario; // Siempre valen lo mismo. No puede ser.
			if (numUsuario > numAnterior) {
				System.out.println("Sigue introduciendo números, de uno en uno.");
			} else {
				System.out.println("PARA.");
			}
		} while (numAnterior > 0);

		System.out.println(numAnterior);
		System.out.println(numUsuario);
	}

}
