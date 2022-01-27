package examenPrueba;

import java.util.Scanner;

public class Caso4ExPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Valida que el usuario introduce una fecha en formato 01/90/1999.
		 * 
		 * No es válido introducir ni el día ni el mes con un dígito. Por ejemplo
		 * 2/10/2021 o 12/3/2021.
		 * 
		 * El sistema debe mostrar un mensaje con cada error que se encuentre.
		 * 
		 * Por ejemplo en “q1/23-20211”
		 * 
		 * -El día no puede tener letras/ deben ser números.
		 * 
		 * -Falta una “/”
		 * 
		 * -El símbolo “-” no es válido.
		 * 
		 * -El mes es incorrecto.
		 * 
		 * -El año es incorrecto.
		 */

		// zona declarativa

		String fecha;
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int numero6;
		int numero7;
		int numero8;

		// zona ejecutiva

		System.out.println("Introduzca fecha con este formato ##/##/####");
		fecha = sc.nextLine();

		if (fecha.length() != 10) {
			System.out.println("Error: el formato debe contener 10 dígitos");

		}

		if (fecha.charAt(2) != '/') {
			System.out.println("Error: falta una /");

		}

		if (fecha.charAt(5) != '/') {
			System.out.println("Error: falta una /");

		}
		numero1 = (int) fecha.charAt(0);
		if (numero1 < 48 || numero1 > 57) {

			System.out.println("El día no puede tener letras/ deben ser números");
		}
		numero2 = (int) fecha.charAt(1);
		if (numero2 < 48 || numero2 > 57) {

			System.out.println("El día no puede tener letras/ deben ser números");
		}
		numero3 = (int) fecha.charAt(3);
		if (numero3 < 48 || numero3 > 57) {

			System.out.println("El mes no puede tener letras/ deben ser números");
		}
		numero4 = (int) fecha.charAt(4);
		if (numero4 < 48 || numero4 > 57) {

			System.out.println("El mes no puede tener letras/ deben ser números");
		}
		numero5 = (int) fecha.charAt(6);
		if (numero5 < 48 || numero5 > 57) {

			System.out.println("El año no puede tener letras/ deben ser números");
		}
		numero6 = (int) fecha.charAt(7);
		if (numero6 < 48 || numero6 > 57) {

			System.out.println("El año no puede tener letras/ deben ser números");
		}
		numero7 = (int) fecha.charAt(8);
		if (numero7 < 48 || numero7 > 57) {

			System.out.println("El año no puede tener letras/ deben ser números");
		}
		numero8 = (int) fecha.charAt(9);
		if (numero8 < 48 || numero8 > 57) {

			System.out.println("El año no puede tener letras/ deben ser números");
		}

	}

}
