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

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número desde");
		num1 = sc.nextInt();
		System.out.println("Introduce el número hasta");
		num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {

			for (int j = 0; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));

			}
			System.out.println("=================");
		}
	}
}
