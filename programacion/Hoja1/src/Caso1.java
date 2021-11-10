import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// Calcular el área de un triángulo en función de la base y la altura.
		// ZONA DECLARATIVA
		// Variables de los datos
		Scanner scanner = new Scanner(System.in);
		int base;
		int altura;

		// ZONA EJECUTIVA
		System.out.println("Por favor, introduce la base y la altura para calcular el área del triángulo:");
		System.out.println("Introduce la base:");
		base = scanner.nextInt();
		System.out.println("Introduce la altura:");
		altura = scanner.nextInt();
		
		System.out.println("El área es: " + ((base * altura)/(2)));

	}

}
