import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// Comprueba que se trata de una cuenta bancaria.
		// Ejemplo: ES12-1234-1234-12-1234567
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		String cuentaBancaria;

		// Zona Ejecutiva
		System.out.println("Introduce una cuenta bancaria para validarla.");
		cuentaBancaria = sc.next();

		if (cuentaBancaria.length() == 25) { // Validar que sea igual a 25 DÍGITOS.
		} else if (cuentaBancaria.length() != 25) {
			System.out.println("Error, el número introducido no es correcto.");
		} else if (cuentaBancaria.contains("ES")) { // Validar que contiene "ES".
		} else if (cuentaBancaria.contains("-")) {
		}

	}

}
