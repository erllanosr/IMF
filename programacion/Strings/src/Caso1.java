import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		String texto;
		String nombre;
		String apellido1;
		String apellido2;
		int espacio1;
		int espacio2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nombre completo");
		texto = sc.nextLine();

		espacio1 = texto.indexOf(" ");
		espacio2 = texto.lastIndexOf(" ");

		nombre = texto.substring(0, espacio1);
		System.out.println("Su nombre es: " + nombre);
		apellido1 = texto.substring(espacio1, espacio2);
		System.out.println("Su primer apellido es:" + apellido1);
		apellido2 = texto.substring(espacio2);
		System.out.println("Su segundo apellido es:" + apellido2);
	}

}
