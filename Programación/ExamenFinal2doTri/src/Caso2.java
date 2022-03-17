import java.util.ArrayList;

public class Caso2 {

	public static void main(String[] args) {
		// Caso 2. Dados dos ArrayList de String de la misma dimensión muestra cuántas
		// posiciones son iguales. Es decir, se compara cada uno de los índices de cada
		// ArrayList. 2,5 puntos.
		compararArrayLists();

	}

	// Método
	private static void compararArrayLists() {
		ArrayList<String> arrayUno = new ArrayList<String>();
		ArrayList<String> arrayDos = new ArrayList<String>();
		arrayUno.add("hola");
		arrayUno.add("qué");
		arrayUno.add("tal");

		arrayDos.add("hola");
		arrayDos.add("qué");
		arrayDos.add("tal");
		arrayDos.add("qwerty");

		System.out.println("ArrayList 1 = " + arrayUno);
		System.out.println("ArrayList 2 = " + arrayDos);

		if (arrayUno.equals(arrayDos) == true) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("No son iguales.");
		}

	}

}
