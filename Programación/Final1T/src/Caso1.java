import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		/*
		 * Genera 3 contraseñas de manera aleatoria. --Deben tener 8 caracteres como
		 * mínimo y 10 como máximo. --Deben contener al menos un número, una letra
		 * mayúscula y un símbolo. --Conseguirás más puntos en este ejercicio si sigues
		 * patrones diferentes y aleatorios. --Que las letras, números y símbolos
		 * siempre estén en las mismas posiciones se valorará con un máximo de 15
		 * puntos. --Ejemplo del resultado: 3er1#AWa Qwert12&s ASDFfds$$a
		 */

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		
		String[] letras = { "qwertyuiopasdfghjklñzxcvbnm" };
		int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		char[] caracteres = { '@', '#', '$', '%', '&', '/', '(', ')', '=' };

		String contrasenia1;
		String contrasenia2;
		String contrasenia3;
		int posicion = 0;
		
		int contrasenia;

		// Zona Ejecutiva
		System.out.println("Introduce una contraseña para validarla:");
		contrasenia1 = sc.next();

		if (contrasenia1.length() < 8 || contrasenia1.length() > 10) {
			System.out.println("Error, debe contener más de 8 pero menos de 10 caracteres.");
		}

		for (int i = 0; i < contrasenia1.length(); i++) {
			posicion = contrasenia1.charAt(i);
		}

	}

}
