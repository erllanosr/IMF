import java.util.Arrays;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		/*
		 * Pepe y Lola van a un restaurante. El camarero toma nota: -Quién pide elplato.
		 * -El nombre del plato. -Lo que cuesta el plato. -Como máximo pueden pedir 3
		 * platos cada uno. -El finalizar la comida debe presentarse un ticket con el
		 * total de la cuenta y el resumen de platos de cada uno. Por ejemplo: Pepe:
		 * 112,56€ (plato1 de Pepe, plato2 de Pepe, plato3 de Pepe). Lola: 120,02€
		 * (plato1 de Lola, plato2 de Lola, plato3 de Lola).
		 */

		// No sé cómo hacer para que en los ifs, si la opcion de pepe sea 1, se elija el
		// 1 en el array: pepe == carta[1]¿? Esto para poder mostrar en el
		// resultado final el precio y las opciones.

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int pepe = 0;
		int opcionPrecioPepe = 0;
		int lola;
		int opcionPrecioLola = 0;
		String[] carta = { "1. Tortilla - 3€.", "2. Carne Asada - 10€", "3. Puré - 5€", "4. Ensalada - 5€",
				"5. Pechuga a la plancha - 10€" };

		// Zona Ejecutiva

		// PLATO DE PEPE
		System.out.println("-------------");
		System.out.println("PLATO DE PEPE");
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(
					"CARTA: 1. Tortilla - 3€. 2. Carne Asada - 10€. 3. Puré - 5€. 4. Ensalada - 5€. 5. Pechuga a la plancha - 10€.");
			System.out.println("Elige lo que vas a pedir:");
			pepe = sc.nextInt();

			if (pepe == 1) {
				opcionPrecioPepe = 3;
				System.out.println("Tortilla - 3€");
			} else if (pepe == 2) {
				opcionPrecioPepe += 10;
				System.out.println("Carne Asada - 10€");
			} else if (pepe == 3) {
				opcionPrecioPepe += 5;
			} else if (pepe == 4) {
				opcionPrecioPepe += 5;
				System.out.println("Ensalada - 5€");
			} else if (pepe == 5) {
				opcionPrecioPepe += 10;
				System.out.println("Pechuga a la plancha - 10€");
			}

		}
		System.out.println("Precio total: " + opcionPrecioPepe + "€.");

		// PLATO DE LOLA
		System.out.println("--------------");
		System.out.println("PLATO DE LOLA");
		System.out.println("--------------");

		for (int i = 0; i < 3; i++) {
			System.out.println(
					"CARTA: 1. Tortilla - 3€. 2. Carne Asada - 10€. 3. Puré - 5€. 4. Ensalada - 5€. 5. Pechuga a la plancha - 10€.");
			System.out.println("Elige lo que vas a pedir:");
			lola = sc.nextInt();

			if (lola == 1) {
				opcionPrecioLola = 3;
				System.out.println("Tortilla - 3€");
			} else if (lola == 2) {
				opcionPrecioLola += 10;
				System.out.println("Carne Asada - 10€");
			} else if (lola == 3) {
				opcionPrecioLola += 5;
			} else if (lola == 4) {
				opcionPrecioLola += 5;
				System.out.println("Ensalada - 5€");
			} else if (lola == 5) {
				opcionPrecioLola += 10;
				System.out.println("Pechuga a la plancha - 10€");
			}

		}
		System.out.println("Precio total: " + opcionPrecioLola + "€.");
		System.out.println("PRECIO FINAL DE AMBOS:");
		System.out.println("Precio total Pepe: " + opcionPrecioPepe + "€.");
		System.out.println("Precio total Lola: " + opcionPrecioLola + "€.");

	}

}
