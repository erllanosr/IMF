import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		// CALCULADORA CON MÉTODOS

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;

		System.out.print("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextInt();

		sc.close();

		System.out.println(suma(num1, num2));
	}

	private static int suma(int num1, int num2) {

		return num1 + num2;
	}

}
