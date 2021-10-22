import java.util.Scanner;

public class bucles2 {

	public static void main(String[] args) {
		// Mostrar todos los números entre 1 y 100.
		// ZONA EJECUTIVA1
		/*
		 * for (int i = 1; i <= 100; i++) { System.out.println(i); } for (int j = 0; j
		 * <= 100; j++) { System.out.println(j); }
		 */

		// MOSTRAR TODOS LOS NÚMEROS PARES ENTRE 2 y 50
		/*
		 * for (int i = 2; i <= 50; i = i + 2) { System.out.println(i); }
		 */
		// CUENTRA ATRÁS
		/*
		 * for (int i = 10; i >= 1; i--) { // i-- = a i=i-1 System.out.println(i);
		 * 
		 * } System.out.println("PUM!");
		 */

		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;

		// ZONA EJECUTIVA
		System.out.println("Elige el primer número entre 1 - 10 para hacer la operación:");
		num1 = sc.nextInt();

		// TABLA 1
		if (num1 == 1 || num1 == 2 || num1 == 3 || num1 == 4 || num1 == 5) {
			for (num1 = 1; num1 <= 12; num1++) {
				System.out.println(1 + "x" + num1 + "=" + (num1 * 1));
				for (num1 = 2; num1 <= 12; num1++) {
					System.out.println(2 + "x" + num1 + "=" + (num1 * 2));
					for (num1 = 3; num1 <= 12; num1++) {
						System.out.println(3 + "x" + num1 + "=" + (num1 * 3));
					}
				}

			}
		}
	}
}
