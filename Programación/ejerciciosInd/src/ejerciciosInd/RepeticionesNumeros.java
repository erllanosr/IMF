package ejerciciosInd;

import java.util.Scanner;

public class RepeticionesNumeros {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que lea números por teclado hasta que se repita uno. 1 2
		 * 3 4 5 6 6 el resultado a mostrar será́: ‘Parada porque el número 6 se ha
		 * introducido dos veces seguidas’ Otro ejemplo 1 2 1 2 1 2 2 ‘Parada porque el
		 * número 2 se ha introducido dos veces seguidas’
		 */

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int numero;
		int numeroRepetido = 0;

		// Zona Ejecutiva

		do {
			System.out.println("Introduce un número:");
			numero = sc.nextInt();
			
		} while (numero!=numeroRepetido);

	}

}
