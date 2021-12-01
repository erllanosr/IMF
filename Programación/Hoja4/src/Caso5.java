import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		// Pide 2 veces una contraseña: Debe cumplirse:
		// Ambas sean iguales.
		// Contiene al menos una letra mayúscula.
		// Contiene al menos un número.
		// Contiene algún carácter raro (.,-_?!”·$%&/) pero ni al inicio ni al final.
		// No hay dos caracteres raros seguidos.
		// Tiene al menos 8 caracteres y máximo 15.

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		String contraseniaUno;
		String contraseniaDos;
		int ascii = 0;
		int asciiLetras;
		int asciiFinal = 0;

		// Zona Ejecutiva
		// Podría hacerlo con Do.
		// Pedir dos veces la contraseña y comprobar que tiene más de 8 caracteres
		// mínimo pero 15 máximo.

		System.out.println("Escribe tu contraseña:");
		contraseniaUno = sc.next();
		System.out.println("Vuelve a escribir tu contraseña:");
		contraseniaDos = sc.next();

		// QUE AMBAS SEAN IGUALES
		if (contraseniaUno.equals(contraseniaDos)) {
			System.out.println("Las contraseñas COINCIDEN.");
		} else {
			System.out.println("Las contraseñas NO COINCIDEN.");
		}

		// Comprueba la longitud de la contraseña.
		if (contraseniaUno.length() >= 8 && contraseniaUno.length() <= 15) {
			System.out.println("Bien.");
		} else {
			System.out.println(
					"Tu contraseña tiene menos de 8 caracateres o más de 15. Vuelve a escribir tu contraseña:");
		}

		// Que no hayan caracteres raros al inicio o al final.
		ascii = (int) contraseniaUno.charAt(0);
		if (ascii >= 32 || ascii <= 47 || ascii >= 58 || ascii <= 64) {
			System.out.println("Error, la contraseña no debe empezar o terminar por un caracter.");
		}
		// Que no hayan caracteres raros al final.
		asciiFinal = (char) contraseniaUno.charAt(ascii);
		System.out.println(asciiFinal);

		//

	}

}
