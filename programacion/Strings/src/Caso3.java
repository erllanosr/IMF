
public class Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "  aA  12    werwe    ";

		int posicion = 0;

		System.out.println(cadena.trim());
		System.out.println(cadena.substring(2, 4) + " " + cadena.substring(6, 8) + cadena.substring(12, 17));

		String cadena2 = "A  BC";
		System.out.println(cadena2.substring(0, 2));
		System.out.println(cadena2.substring(1).trim());
		System.out.println(cadena2.substring(1) + cadena2.trim());
	}

}
