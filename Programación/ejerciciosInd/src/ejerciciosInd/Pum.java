package ejerciciosInd;

import java.util.Scanner;

public class Pum {

	public static void main(String[] args) {
		/*
		 * Pide un número al usuario, muestra una cuenta atrás desde ese número. Al
		 * final debe aparecer la palabra “PUM!”.
		 */
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Ingresa un número:");
		numero = sc.nextInt();
		
		for (int i = numero; i <= 0; i--) {
			i -= 1;
		}
		System.out.println(numero + "PUM!");

	}

}
