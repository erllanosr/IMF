package ejerciciosInd;

import java.util.Scanner;

public class MayorOMenor {

	public static void main(String[] args) {
		// Adivina un número diciendo si el introducido es mayor o menor que el que
		// tiene que adivinar.
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int numero = 19;
		int numeroUsuario = 0;

		// Zona Ejecutiva
		System.out.println("Trata de adivinar el número almacenado en la variable.");
		System.out.println("Ingresa tu número:");
		numeroUsuario = sc.nextInt();

		if (numeroUsuario == numero) {
			System.out.println("Bien, has acertado.");
		} else if (numeroUsuario != numero) {
			do {
				if (numeroUsuario > numero) {
					System.out.println("El número que has introducidor es mayor al número de la máquina.");
				} else if (numeroUsuario < numero) {
					System.out.println("El número que has introducido es menor al número de la máquina.");
				}
				System.out.println("Introduce tu número:");
				numeroUsuario = sc.nextInt();

			} while (numeroUsuario != numero);
			System.out.println("Bien, has acertado.");
		}

	}

}
