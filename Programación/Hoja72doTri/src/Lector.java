import java.util.Scanner;

public class Lector {

	private static Scanner sc = new Scanner(System.in);

	// Método para la opción del Menú que elegirá el usuario.
	public static int opcionMenu() {
		int numOpcion;
		System.out.println("Opcion: ");
		numOpcion = sc.nextInt();
		sc.nextLine();
		return numOpcion;

	}

	// Método para String
	public static String opcionString() {

		String dato;
		dato = sc.nextLine();
		return dato;

	}

	// Método para Int
	public static Integer opcionInt() {
		int num;
		num = sc.nextInt();
		return num;
	}

	// Método para limpiar el buffer
	public static String limpiarBuffer() {
		return sc.nextLine();

	}

}
