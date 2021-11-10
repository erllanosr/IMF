package Calculadora;

import java.util.Random;

public class numeroDado {

	public static void main(String[] args) {
		// Simula la tirada de un dado

		Random azar = new Random();
		int dado = azar.nextInt(6) + 1; // Entre 0 y 5, más 1.

		System.out.println("El dado saca: ");

		switch (dado) {
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		default:
			System.out.println("Valor inesperado");

		}

	}
}