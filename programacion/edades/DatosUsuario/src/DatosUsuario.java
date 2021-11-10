import java.util.Scanner;

public class DatosUsuario {

	public static void main(String[] args) {
		// Datos del usuario
		// Zona Declarativa
		String nombre;
		String apellido1;
		String apellido2;
		Scanner sc = new Scanner(System.in);

		// Zona Ejecutiva
		System.out.println("Escribe tu nombre.");
		nombre = sc.nextLine();
		System.out.println("Escribe tu primer apellido.");
		apellido1 = sc.nextLine();
		System.out.println("Escribe tu segundo apellido.");
		apellido2 = sc.nextLine();
		System.out.println("Te llamas " + nombre + " " + apellido1 + " " + apellido2 + ".");
		System.out.println("Te llamas " + apellido1 + " " + apellido2 + "," + " " + nombre + ".");

	}

}
