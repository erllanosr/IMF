import java.util.Scanner;

public class Caso1H1 {

	public static void main(String[] args) {
		/*
		 * Calcular el área de un triángulo en función de la base y la altura. Los datos
		 * base y altura deben ser solicitados como entrada (variables).
		 * ÁREA=BASE*ALTURA/2
		 */

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int base = 0;
		int altura = 0;
		int area = (base * altura) / 2;

		// Zona Ejecutiva
		System.out.println("Introduce la base:");
		base = sc.nextInt();
		System.out.println("Introduce la altura:");
		altura = sc.nextInt();

		System.out.println("El area del triángulo es: " + area);
		System.out.println("El area del triángulo es: " + (base*altura)/2);
	}

}
