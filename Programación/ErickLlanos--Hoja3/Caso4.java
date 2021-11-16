import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// Mostrar la edad del usuario en años.
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int diaNacimiento;
		int mesNacimiento;
		int anioNacimiento = 0;

		int diasTotales = 365;
		int mesTotales = 12;

		int diaActual;
		int mesActual;
		int anioActual = 0;

		int anios;

		// ZONA EJECUTIVA
		// Pedir la fecha de nacimiento.
		System.out.println("FECHA DE NACIMIENTO.");
		System.out.println("Introduce el día (dd):");
		diaNacimiento = sc.nextInt();
		System.out.println("Introduce el mes (mm):");
		mesNacimiento = sc.nextInt();
		System.out.println("Introduce el año (aaaa):");
		anioNacimiento = sc.nextInt();

		// Pedir la fecha actual.
		System.out.println("FECHA ACTUAL");
		System.out.println("Introduce el día (dd):");
		diaActual = sc.nextInt();
		System.out.println("Introduce el mes (mm):");
		mesActual = sc.nextInt();
		System.out.println("Introduce el año (aaaa):");
		anioActual = sc.nextInt();

		// CALCULAR LA EDAD EN AÑOS
		// Mostrar por pantalla los días, meses y años que tiene el usuario.
		/*
		 * No tengo muy claro cómo funciona esto. 
		 * anios = anioActual - anioNacimiento;
		 * if ((mesActual - mesNacimiento) < 0) { 
		 * anios = anios - 1;
		 * 
		 * } System.out.println("Tienes " + anios + " años.");
		 */

	}

}
