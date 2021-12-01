import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// Valida que se trata de una dirección de email. Detalles en clase.
		// Tiene un "@".
		// Tiene un "."
		// Tiene dos caracteres antes del @ como mínimo.
		// Los primeros caracteres no deben ser números.
		// Termina en ".com" o ".es".

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		String email;
		String email2;
		char arroba = '@';
		char punto = '.';
		int numAscii;

		// Zona Ejecutiva
		System.out.println("Escribe tu email para validarlo:");
		email = sc.next();

		// Validación del arroba.
		if (email.indexOf(arroba) < 0) {
			System.out.println("ERROR: Tu email tiene que tener caracteres antes del '@'");
		}

		// Validación dos caracteres o más antes del arroba.
		email2 = email.substring(email.indexOf(arroba));
		if (email.length() - email2.length() < 2) {
			System.out.println("ERROR: email incorrecto, tu email debe tener 2 o más caracteres antes del arroba.");
		}

		// Termina en 2 o 3 caracteres, ejemplo: .com o .es, etc.
		if (email.indexOf(punto) > 0) {
			if (email.length() - email.indexOf(punto) > 4 || email.length() - email.indexOf(punto) < 3) {
				System.out.println("ERROR: email incorrecto. Debe terminar en 2-3 caracteres.");
			}

		} else {
			System.out.println("ERROR: email incorrecto.");
		}

		// Primer caracter no debe ser un número. ¿Por qué no funciona?
		numAscii = email.charAt(0);
		if (numAscii >= 48 && numAscii<= 57) {
			System.out.println("ERROR: tu email no debe empezar por números.");
		}

	}

}
