import java.util.Scanner;

public class algSuma {

	public static void main(String[] args) {
		// SUMA DE NÚMEROS HASTA 30
		Scanner sc = new Scanner(System.in);
		int num;
		int suma = 0;

		while (suma < 30) {
			System.out.println("Introduce un número:");
			num = sc.nextInt();
			System.out.println("La suma es: " + (suma += num));
		}
	}

}
