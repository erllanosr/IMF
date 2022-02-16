import java.util.ArrayList;
import java.util.Scanner;

public class Lector {
	private static Scanner sc = new Scanner(System.in);

	// Método para pedir un STRING
	public static String pedirPalabra(String mensaje) {
		System.out.println("Introduce una palabra de máximo 5 letras para jugar:");

		return sc.nextLine();

	}

	// Método para transformar de un ArrayList a Char[]

	public static ArrayList<String> transformarArrtoChar(char palabraChar) {
		ArrayList<String> palabraOculta = new ArrayList<>();
		palabraOculta.add("P");
		palabraOculta.add("I");
		palabraOculta.add("P");
		palabraOculta.add("A");
		palabraOculta.add("S");

		StringBuilder str = new StringBuilder();
		for (String palabraOcultas : palabraOculta) {
			str.append(palabraOculta);
			str.append(" ");
		}
		System.out.println(str);
		return palabraOculta;

	}

}
