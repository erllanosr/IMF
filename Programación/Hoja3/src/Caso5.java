import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		// REGLAS DE TRES
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		float a;
		float b;
		float c = 100;
		float x;

		// ZONA EJECUTIVA
		// Pedimos al usuario que introduzca los dos números para resolver la regla de
		// tres.
		System.out.println("Introduce el primer número para resolver la regla de tres:");
		a = sc.nextInt();
		System.out.println("Introduce el segundo número:");
		b = sc.nextInt();

		// PRIMERA REGLA DE TRES
		// No entiendo el 100%, ya que si multiplicamos b*100% el resultado es el mismo
		// número b ¿?
		// x= b*100% / a
		System.out.println("Primera regla de tres:");
		System.out.print(x = ((b * c) / (100)) / a);
		System.out.println();

		// x=a*b/100%
		// SEGUNDA REGLA DE TRES
		System.out.println("Segunda regla de tres:");
		System.out.print(x = (a * b) / (c) / 100);

	}

}