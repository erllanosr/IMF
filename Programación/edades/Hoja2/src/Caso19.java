import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida dos números enteros positivos, si los números
		 * introducidos no son positivos se seguirán pidiendo hasta que lo sean.
		 * Calcular su producto mediante sumas e informar por pantalla del resultado.
		 */
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);


		do {​​​
		System.out.println("Introduzca el primer número positivo:");
		num1 = sc.nextInt();
		}​​​ while (num1<0);

		do {​​​
		System.out.println("Introduzca el segundo número positivo:");
		num2 = sc.nextInt();
		}​​​ while (num2<0);


		System.out.println(num1 + " * " + num2);

		System.out.print(num1 + " + " + num1);

		for (int i=2; i<=(num2-1); i++) {​​​
		System.out.print(" + " + num1);
		}​​​

		System.out.println(" ");

		System.out.print(num2 + " + " + num2);

		for (int i=2; i<=(num1-1); i++) {​​​
			System.out.print(" + " + num2);
		}
	}
}
