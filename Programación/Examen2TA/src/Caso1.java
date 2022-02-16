import java.util.ArrayList;
import java.util.*;

public class Caso1 {

	public static void main(String[] args) {
		/*
		 * Entra un arrayList de String y un String, devuelve si ese String existe en
		 * ese array.
		 */

		stringDentroAL(null);

	}

	// Método para comprobar que un String está en un ArrayList.
	private static String stringDentroAL(String cadenas) {
		String cadena = "qué";
		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add("Hola");
		listaString.add("qué");
		listaString.add("tal");
		listaString.add("¿?");

		if (listaString.contains(cadena)) {
			System.out.println("La cadena:" + cadena + " existe en el ArrayList.");
		} else {
			System.out.println("La cadena: " + cadena + " no existe en el ArrayList.");
		}
		System.out.println(listaString);
		System.out.println(listaString.size());

		return cadena;

	}

}
