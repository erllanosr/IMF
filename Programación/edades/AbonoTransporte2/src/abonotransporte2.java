import java.util.Scanner;

public class abonotransporte2 {

	public static void main(String[] args) {
		// ABONO TRANSPORTE, EDADES Y PRECIOS
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int edad;
		int precio = 0;
		char zona;
		// Zona Ejecutiva
		// pedir datos zona y edad
		System.out.println("Introduce la zona");
		zona = sc.next().charAt(0);
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();

		if (edad < 10) {
			precio = 0;
		} else if (edad > 10 && edad < 25) {
			switch (zona) {
			case 'A':
				precio = 10;
				break;
			case 'B':
				precio = 20;
				break;
			case 'C':
				precio = 30;
				break;
			}

		} else if (edad >= 25 && edad < 65) {
			switch (zona) {
			case 'A':
				precio = 40;
				break;
			case 'B':
				precio = 60;
				break;
			case 'C':
				precio = 80;
				break;
			}
		} else if (zona == 'A' || zona == 'B') {
			precio = 10;
		} else {
			if (zona == 'C') {
				precio = 15;
			}
		}
		System.out.println("El precio es:" + precio);

	}
}
