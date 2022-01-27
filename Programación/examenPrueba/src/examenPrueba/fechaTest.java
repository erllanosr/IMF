package examenPrueba;

import java.util.Scanner;

public class fechaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fecha;
		String numeros = "1357924680";

		// Introduce una fecha
		System.out.println("Introduce una fecha con el siguiente formato: ##/##/####");
		fecha = sc.next();

		if (fecha.length() == 10) {
			if (fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {

				if (numeros.indexOf(fecha.charAt(0)) >= 0) {
					System.out.println("La fecha es correcta");
				}
			}

		} else {
			System.out.println("No es una fecha correcta.");
		}

		// si tiene 10 caracteres
		/*
		 * if (fecha.length() == 10) { if (fecha.charAt(2) == '/' && fecha.charAt(5) ==
		 * '/') { // 0,1,3,4,6,7,8,9 números if (numeros.indexOf(fecha.charAt(0)) >= 0)
		 * { } System.out.println(numeros.indexOf(fecha.charAt(0)));
		 * System.out.println(numeros.indexOf(fecha.charAt(1)));
		 * System.out.println(numeros.indexOf(fecha.charAt(3)));
		 * System.out.println(numeros.indexOf(fecha.charAt(4)));
		 * System.out.println(numeros.indexOf(fecha.charAt(6)));
		 * System.out.println(numeros.indexOf(fecha.charAt(7)));
		 * System.out.println(numeros.indexOf(fecha.charAt(8)));
		 * System.out.println(numeros.indexOf(fecha.charAt(9)));
		 * 
		 * } else { System.out.println("No es una fecha válida, faltan las /"); } } else
		 * { System.out.println("No es una fecha válida, no tiene 10 caracters"); }
		 */

	}
}
