import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <15 | 15-65 | >65
		// A = 10 | 20 | 0
		// B = 20 | 40 | 0
		// C = 30 | 50 | 10

		// Zona declarativa
		Scanner sc = new Scanner(System.in);
		char zona;
		int edad;
		int precio = 0;

		// Zona Ejecutiva
		// Pedir zona y números.

		System.out.print("Introduce tu edad: ");
		edad = sc.nextInt();
		System.out.print("Introduce tu zona: ");
		zona = sc.next().charAt(0);

		if (edad < 15) {
			if (zona == 'A') {
				precio = 10;
				System.out.println("El precio es: " + precio);
			} else if (zona == 'B') {
				precio = 20;
				System.out.println("El precio es: " + precio);

			} else {
				precio = 30;
				System.out.println("El precio es: " + precio);
			}
		}
		if (edad > 15 || edad < 65) {
			if (zona == 'A') {
				precio = 20;
				System.out.println("El precio es: " + precio);
			} else if (zona == 'B') {
				precio = 40;
				System.out.println("El precio es: " + precio);
			} else {
				precio = 50;
				System.out.println("El precio es: " + precio);
			}
		}
		if (edad > 65) {
			if (zona == 'A') {
				precio = 0;
				System.out.println("El precio es: " + precio);
			} else if (zona == 'B') {
				precio = 0;
				System.out.println("El precio es: " + precio);
			} else {
				precio = 10;
				System.out.println("El precio es: " + precio);
			}
		}

		// No sé porqué en algunos casos muestra dos precios

	}

}
