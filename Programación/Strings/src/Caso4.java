import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// Pedir al usuario que ingrese una fecha con formato.
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		String fecha;

		// ZONA EJECUTIVA
		System.out.println("Ingresa una fecha con este formato: ##/##/####");
		fecha = sc.nextLine();
		
		System.out.println("Los caracteres que has introducido son: " + fecha.length());

		if (fecha.length() != 10) {
			System.out.println("Error, ingresa una fecha con este formato: ##/##/####.");
		}
		
		System.out.println(fecha.indexOf('/'));
		System.out.println(fecha.lastIndexOf('/'));
		
		System.out.println(fecha.substring(0,2)+fecha.substring(3,5)+fecha.substring(6,10));
		
		System.out.println("El día es: " + fecha.substring(0,2));
		System.out.println("El mes es: " + fecha.substring(3,5));
		System.out.println("El año es: " + fecha.substring(6,10));
		
		
		
		
		
		
		
	}

}
