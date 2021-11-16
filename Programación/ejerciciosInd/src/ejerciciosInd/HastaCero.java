package ejerciciosInd;

import java.util.Scanner;

public class HastaCero {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que lea números por teclado hasta que se introduzca el
		 * cero. 8 8 845666777720 el resultado a mostrar será́: ‘El número que más se
		 * repite es el 7, se ha escrito 4 veces’
		 */

		// RESPUESTA PROFE
		int respuesta;
		String campeon = "nadie";
		int vecesCampeon = 0;
		int uno = 0;
		int dos = 0;
		int tres = 0;
		String numeros = "";
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println("Introduce un número, cero para detener");
			respuesta = lector.nextInt();
			switch (respuesta) {
			case 1:
				uno++;
				if (uno > vecesCampeon) {
					campeon = "uno";
					vecesCampeon = uno;
				}
				break;
			case 2:
				dos++;
				if (dos > vecesCampeon) {
					campeon = "dos";
					vecesCampeon = dos;
				}
				break;
			case 3:
				tres++;
				if (tres > vecesCampeon) {
					campeon = "tres";
					vecesCampeon = tres;
				}
				break;
			}
			numeros = numeros + respuesta;
		} while (respuesta > 0);
		System.out.println(numeros);
		System.out.println("El ganador es " + campeon + " porque sale " + vecesCampeon + " veces");

		/*
		 * Zona declarativa Scanner sc = new Scanner(System.in); int numero;
		 * 
		 * // Zona Ejecutiva
		 * 
		 * do { System.out.println("Escribe uno o varios números."); numero =
		 * sc.nextInt();
		 * 
		 * } while (numero>0);
		 */

	}

}
