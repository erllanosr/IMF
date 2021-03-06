import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		/*
		 * Valida que el usuario introduce una fecha en formato ##/##/####. No es válido
		 * introducir ni el día ni el mes con un dígito. Por ejemplo 2/10/2021 o
		 * 12/3/2021. El sistema debe mostrar un mensaje con cada error que se
		 * encuentre. Por ejemplo en “q1/23-20211” -El día no puede tener letras/ deben
		 * ser números. -Falta una “/” -El símbolo “-” no es válido. -El mes es
		 * incorrecto. -El año es incorrecto.
		 */

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		char barra = '/';
		String fecha;
		// Zona Ejecutiva
		System.out.println("Introduce una fecha con este formato dd/mm/aaaa para validarla:");
		fecha = sc.next();

		System.out.println(fecha.indexOf(barra));

		if (fecha.length() == 10) {
		} else if (fecha.charAt(0) != ' ') {
			System.out.println("Error, debe tener este formato: dd/mm/aaaa");
		}
		if (fecha.equals(fecha.charAt(2) != fecha.charAt(barra))) {
			System.out.println("Error, debe de tener '/'.");
		}

	}

}
