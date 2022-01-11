import java.util.Scanner;

public class Caso3H1 {

	public static void main(String[] args) {
		/*
		 * Escribir un algoritmo que permita introducir números por teclado hasta que la
		 * suma de todos ellos sea mayor que 30, hay que tener en cuenta que el primer
		 * número introducido ya puede ser mayor de 30.
		 */

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int num = 0;

		// Zona Ejecutiva

		/*for (int i = 0; i <= 30; i++) {
			System.out.print("Ingresa un número: ");
			num = sc.nextInt();
			num = num + 0;
			System.out.println(num);

		}*/
		do {
			System.out.print("Ingresa un número: ");
			num = sc.nextInt();
			num = num + num;
			System.out.println(num);

		} while (num < 30);

	}

}
