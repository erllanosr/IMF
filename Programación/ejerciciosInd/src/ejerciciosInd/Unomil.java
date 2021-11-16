package ejerciciosInd;

import java.util.Scanner;

public class Unomil {

	public static void main(String[] args) {
		/*------- 
		Realizar un programa que muestre por pantalla los números comprendidos entre 1 y 1000.  
		El programa escribirá́ en la pantalla los números en grupos de 20, solicitando al usuario si quiere o no continuar visualizando el siguiente grupo de números.*/

		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int respUsuario = 0;
		int i = 0;

		// Zona Ejecutiva
		do {
			for (int i1 = 1; i1 <= 20; i1++) {
				System.out.println(i1);
			}
			i += 20;
		} while (i < 1000);

	}
}