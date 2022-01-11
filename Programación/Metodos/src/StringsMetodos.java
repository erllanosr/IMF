
public class StringsMetodos {

	public static void main(String[] args) {
		// Método que devuelva longitud cadena.
		// Mostrar esa cadena por consola.
		// Pasar a mayúsculas el String.

		String dato = "hola";
		System.out.println(longitud(dato));
		System.out.println(consola(dato));
		System.out.println(mayusculas(dato));
		//System.out.println(longitud(dato) + consola(dato) + mayusculas(dato));
	}

	private static int longitud(String datoLong) {

		return datoLong.length();
	}

	private static String consola(String datoCons) {

		System.out.println(datoCons);
		return datoCons;
	}

	private static String mayusculas(String datoMayus) {

		return datoMayus.toUpperCase();
	}

}
