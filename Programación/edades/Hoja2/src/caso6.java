import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		// SUMA DE NÚMEROS ENTEROS
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Escribe un número entero:");

		do {
			num = sc.nextInt();
			System.out.println("El número " + num + " es positivo.");
			
		} while (num > 0);
		
		/*do {
			num = sc.nextInt();
			System.out.println("El número " + num + " es negativo.");
		} while (num < 0);
*/
	}

}
