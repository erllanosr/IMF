
public class Caso1 {

	public static void main(String[] args) {
		// VALIDAR DNI
		// 012345678-A

		String dni = "q12345678-A";
		char posicionGuion = '-';
		char posicionLetra = 0;

		// OK
		// Validar que el DNI tiene 10 caracteres.
		if (dni.length() - 1 != 10) {
			System.out.println("Error. El DNI debe tener 10 caractéres.");
		}

		// Validar que en la última posición hay una letra.
		if (dni.lastIndexOf(posicionLetra) < 65 && dni.lastIndexOf(posicionLetra) > 90) {
			System.out.println("Error. El DNI debe tener una letra en la última posición.");
		}

		// Validar que el DNI tiene un guión.
		posicionGuion = (char) ((int) dni.length() - 2);
		if (posicionGuion != 9) {
			System.out.println("Error. El DNI debe tener un guión.");
		}

		
		// Validar que hay números en las primeras 8 posiciones
		// convertirlo a ascii
		if (dni.indexOf(0) == 48) {
			System.out.println("Error. Deben ser números, no letras.");
		}

	}

}
