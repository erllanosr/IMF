import java.util.ArrayList;

public class Caso3 {

	public static void main(String[] args) {
		// Caso 3.
		// Tenemos una lista de personas (nombre, edad). Dada una edad que se
		// lee desde un fichero, vuelca a otro fichero los nombres y edades de todas las
		// personas mayores de dicha edad.

		ArrayList<String> listaPersonas = new ArrayList<String>();
		listaPersonas.add("Pedro;20");
		listaPersonas.add("Sofía;15");
		listaPersonas.add("Jorge;28");
		listaPersonas.add("Clara;10");
		listaPersonas.add("Roberto;16");

		Persona ficheroPersona = new Persona("datos/datosEdad.txt");

	}

}
