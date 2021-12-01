import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// Comprueba que se trata de una cuenta bancaria.
		// Ejemplo: ES12-1234-1234-12-1234567
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		String cuentaB;
		int numAsciiE; // Variable para validar la primera letra sea E.
		int numAsciiS = 0; // Variable para validar la segunda letra sea S.
		int numAsciiN1; // Variable para validar el primer número después de la S esté entre 0-9.
		int numAsciiN2; // Variable para validar el segundo número después de la S esté entre 0-9.
		int numAsciiG; // Variable para validar el guión "-".

		// Zona Ejecutiva
		System.out.println("Introduce una cuenta bancaria para validarla.");
		cuentaB = sc.next();

		// Validación de que tiene 25 dígitos.
		if (cuentaB.length() != 25) {
			System.out.println("Error, la cuenta bancaria debe ser superior a 25 dígitos..");
		}
		// Validación de la "E"
		numAsciiE = (int) cuentaB.charAt(0);
		if (numAsciiE == 69) {
		} else {
			System.out.println("ERROR: La cuenta bancaria debe empezar por 'ES'");
		}

		// Validación de la "S"
		numAsciiS = (int) cuentaB.charAt(1);
		if (numAsciiS == 83) {
		} else {
			System.out.println("ERROR: La cuenta bancaria debe empezar por 'ES'");
		}

		// Validación que el tercer caracter sea un número entre 0-9.
		numAsciiN1 = (int) cuentaB.charAt(2);
		if (numAsciiN1 >= 48 || numAsciiN1 <= 57) {
		} else {
			System.out.println("Error");
		}

		// Validación que el cuarto caracter sea un número entre 0-9.
		numAsciiN2 = (int) cuentaB.charAt(3);
		if (numAsciiN2 >= 48 || numAsciiN2 <= 57) {
		} else {
			System.out.println("Error");
		}

		numAsciiG = (int) cuentaB.charAt(4);
		if (numAsciiG == 45) {
		}

		// Sería hacer lo mismo para todos los números, no se me ocurre otra manera más
		// óptima de cómo hacerlo.

	}
}
