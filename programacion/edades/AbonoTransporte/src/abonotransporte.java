import java.util.Scanner;

public class abonotransporte {

	public static void main(String[] args) {
		// ABONO TRANSPORTE POR EDAD, ZONA Y DESCUENTOS

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int edad;
		char zona;
		int opcion;

		// ABONO TRANSPORTE EDAD
		// Preguntar por edad
		System.out.println("Escribe tu edad, tu zona y elige una de las opciones disponibles:");
		edad = sc.nextInt();
		if (edad <= 10) {
			System.out.println("El precio final es de: 0€.");
		}
		if (edad >= 11 && edad <= 24) { // Es mejor si el usuario escribe todo el rango completo de edad¿? hasta
										// superados los
										// 65 y después se programa si la edad es < o >, zona etc.¿?
			System.out.println("Escribe tu zona:"); // Preguntar por zona
		}
		zona = sc.next().charAt(0);
		if (zona == 'A' || zona == 'B' || zona == 'C') {
			System.out.println("Ahora elige una de estas opciones:"); // Preguntar por opciones
			System.out.println("1. Familia numerosa. 2. Discapacidad. 3. Funcionario. 4. Ninguna.");

		}

		// Todo este código se podría hacer con if else¿?
		/*
		 * if (opcion == 4) { System.out.println("El precio final es de: 20€"); } if
		 * (opcion == 1) { System.out.println("El precio final es de: " + (20 - (20 *
		 * 20) / (100))); } if (opcion == 2) {
		 * System.out.println("El precio final es de: " + (20 - (20 * 50) / (100))); }
		 * if (opcion == 3) { System.out.println("El precio final es de " + (20 - (20 *
		 * 40) / (100))); }
		 * 
		 * if (edad >= 25 && edad <= 64) { System.out.println("Escribe tu zona:"); zona
		 * = sc.next().charAt(0);
		 */
		opcion = sc.nextInt();
		if (opcion == 4) {
			System.out.println("El precio final es de: 20€");
		} else {
			if (opcion == 1) {
				System.out.println("El precio final es de: " + (20 - (20 * 20) / (100)));
			} else {
				if (opcion == 2) {
					System.out.println("El precio final es de: " + (20 - (20 * 50) / (100)));
				} else {
					if (opcion == 3) {
						System.out.println("El precio final es de " + (20 - (20 * 40) / (100)));
					}
				}
			}
		}
		// Por qué no va¿? Debería ir dentro de un else después de preguntar si la edad
		// es >=11 && edad <=25¿?
		if (edad >= 25 && edad <= 64) {
			System.out.println("Escribe tu zona:");
			zona = sc.next().charAt(0);
		}
		if (zona == 'A' || zona == 'B' || zona == 'C') {
			System.out.println("Ahora elige una de estas opciones:"); // Preguntar por opciones
			System.out.println("1. Familia numerosa. 2. Discapacidad. 3. Funcionario. 4. Ninguna.");
		}
	}
}
