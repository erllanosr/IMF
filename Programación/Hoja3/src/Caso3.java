import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// PEDIR AL USUARIO FECHA DE NACIMIENTO
		// ZONA DECLARATIVA

		Scanner sc = new Scanner(System.in);
		int dia;
		int mes;
		int anio = 0;

		// ZONA EJECUTIVA
		System.out.println("Ingresa el día de tu nacimiento, dd.");
		dia = sc.nextInt();
		System.out.println("Ingresa el mes de tu nacimiento, mm");
		mes = sc.nextInt();

		System.out.println("Ingresa el año de tu nacimiento, aaaa");
		anio = sc.nextInt();
		System.out.println("A continuación se mostrará la fecha en varios formatos:");
		System.out.println("(" + dia + "/" + mes + "/" + anio + ")");

	}

}