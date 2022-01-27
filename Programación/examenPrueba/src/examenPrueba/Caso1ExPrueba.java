package examenPrueba;

import java.util.Scanner;

public class Caso1ExPrueba {

	public static void main(String[] args) {
		/*
		 * Genera 3 contraseñas de manera aleatoria. Deben tener 8 caracteres como
		 * mínimo y 10 como máximo. Deben contener al menos un número, una letra
		 * mayúscula y un símbolo. más puntos en este ejercicio si sigues patrones
		 * diferentes y aleatorios. Que las letras, números y símbolos siempre estén en
		 * las mismas posiciones se valorará con un máximo de 15 puntos. Ejemplo del
		 * resultado: 3er1#AWa Qwert12&s ASDFfds$$a
		 */

		Scanner sc = new Scanner(System.in);
		int numContraseñas;
		int longContraseñas = 0;
		char[] longitudContraseña = new char[longContraseñas];
		char[] contraseña;
		int[] numeros = { 12345689 };
		char[] letraSMayus = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] letraSMinus = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] simbolos = { '@', '#', '.', '!', '$', '?' };

		System.out.println("Introduce la cantidad de contraseñas que quieres generar (3-5): ");
		numContraseñas = sc.nextInt();

		System.out.println("Introduce la longitud de la contraseña (8-16): ");
		longContraseñas = sc.nextInt();

		for (int i = 0; i <= longContraseñas; i++) {

		}

	}

}
