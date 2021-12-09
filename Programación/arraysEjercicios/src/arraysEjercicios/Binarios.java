package arraysEjercicios;

import java.util.Arrays;

public class Binarios {

	public static void main(String[] args) {
		// Arrays de 8 bits.
		// 8 bits = 1 byte.
		// 1, 1, 0, 1, 0, 0, 1, 0

		int[] binario = { 1, 1, 0, 1, 0, 0, 1, 0 };
		int valor = 2;
		int exponente = 0;
		String binarioString = Arrays.toString(binario).toString();
		System.out.println(Math.pow(2, 0));

		// Leer la posición del String.
		/*
		 * for (int i = 0; i<binario.length;i++) { System.out.println(binario[i]); }
		 */

		// Exponentes que se incrementan en 1.
		for (int i = 0; i < binario.length; i++) {
			exponente = i;
			System.out.println(exponente);
		}
		System.out.println("------------");
		for (int i = 0; i < binario.length - 1; i++) {
			System.out.println(binario[i]);
			System.out.println(binario[i] ^ exponente);
		}
		System.out.println("------------");
		for (int i = 0; i < binario.length; i++) {
			System.out.println(Math.pow(valor, exponente));
		}

		System.out.println(binario[0]);
		System.out.println(Math.pow(valor, exponente));

		for (int i = 0; i < 1000; i++) {
			int numAleatorio = (int) (Math.random() * 20);
			System.out.println(numAleatorio);
		}
	}

}
