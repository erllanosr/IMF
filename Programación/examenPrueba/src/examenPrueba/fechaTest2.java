package examenPrueba;

import java.util.Scanner;

public class fechaTest2 {

	public static void main(String[] args) {
		/*
		 * Valida que el usuario introduce una fecha en formato ##/##/####. No es válido
		 * introducir ni el día ni el mes con un dígito. Por ejemplo 2/10/2021 o
		 * 12/3/2021. El sistema debe mostrar un mensaje con cada error que se
		 * encuentre. Por ejemplo en “q1/23-20211” -El día no puede tener letras/ deben
		 * ser números. -Falta una “/” -El símbolo “-” no es válido. -El mes es
		 * incorrecto. -El año es incorrecto.
		 */
		Scanner sc = new Scanner(System.in);
		String fecha;
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int numero6;
		int numero7;
		int numero8;

		// Zona Ejecutiva
		System.out.println("Introduce una fecha en este formato: ##/##/####");
		fecha = sc.next();

		if (fecha.length() != 10) {
			System.out.println("Error. La fecha debe tener 10 caracteres en total.");
		}
		if (fecha.charAt(2) != '/' && fecha.charAt(5) != '/') {
			System.out.println("ERROR. Deben haber '/' en la fecha");
		}

		numero1 = (int) fecha.charAt(0);
		if (numero1 < 48 || numero1 > 57) {
			System.out.println("El día no puede tener letras, deben ser números");
		}

		numero2 = (int) fecha.charAt(1);
		if (numero1 < 48 || numero1 > 57) {
			System.out.println("El día no puede tener letras, deben ser números");
		}
		numero3 = (int) fecha.charAt(3);
		if (numero1 < 48 || numero1 > 57) {
			System.out.println("El día no puede tener letras, deben ser números");
		}
	}

}
