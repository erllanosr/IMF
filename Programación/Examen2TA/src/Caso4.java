import java.util.ArrayList;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		/*
		 * Entra un número entre con 5 dígitos, sale un booleano que determina si todos
		 * los dígitos son diferentes. Por ejemplo 12345 tiene todos sus dígitos
		 * diferentes, 12234 no tiene sus dígitos diferentes porque se repite el 2.
		 */
		numeroRepetido(0);

	}

	// Método para ver si un número se repite dentro de otro número.
	private static int numeroRepetido(int numero) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeroFinal = new ArrayList<Integer>();
		int num = 0;
		boolean seRepite = false;

		numeroFinal.add(1);
		numeroFinal.add(2);
		numeroFinal.add(3);
		numeroFinal.add(4);
		numeroFinal.add(5);

		System.out.print("Introduce un número para ver si está repetido:");
		num = sc.nextInt();
		System.out.println(numeroFinal);

		for (int i = 0; i < numeroFinal.size(); i++) {
			if (num == numeroFinal.get(i)) {
				seRepite = true;
				i++;
			}

		}
		if (seRepite) {
			System.out.println("El número se repite");

		} else {
			System.out.println("El número no se repite.");
		}

		System.out.println(seRepite);

		return num;

	}
	// metodo para hacer el bucle for

}
