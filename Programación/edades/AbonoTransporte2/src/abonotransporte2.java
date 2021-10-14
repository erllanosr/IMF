import java.util.Scanner;

public class abonotransporte2 {

	public static void main(String[] args) {
		// ABONO TRANSPORTE, EDADES Y PRECIOS
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		byte edad;
		byte precio;
		// Zona Ejecutiva
		System.out.println("Introduce tu edad:");
		edad = sc.nextByte();

		if (edad <= 10) {
			System.out.println("El precio final es de 0€.");
		} else if (edad <= 25) {
			System.out.println("El precio final es de 10€");
		} else if (edad < 65) {
			System.out.println("El precio es de 40€");
		} else {
			System.out.println("El precio es de 15€");
		}

	}
}
