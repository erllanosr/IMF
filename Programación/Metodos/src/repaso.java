import java.util.Arrays;

public class repaso {

	public static void main(String[] args) {
		// MÉTODOS que devuelve la longitud de un array.

		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] numeros2 = { 1, 2, 3, 4 };

		System.out.println(calcularLongitud(numeros));
		System.out.println(calcularLongitud(numeros2));

	}

	private static int[] concatenarArrays(int[] array1, int[] array2) {

		int[] resultado = new int[calcularLongitud(array1) + calcularLongitud(array2)];

		for (int i = 0; i < array1.length; i++) {
			resultado[i] = array1[1];
		}
		
		for (int i = 0; i < array2.length; i++) {
			resultado[i+array1.length] = array2[i];
		}
		
		mostrarArray(resultado);

		return resultado;
	}

	private static int calcularLongitud(int[] nombreRandom) {

		return nombreRandom.length;
	}
	
	private static void mostrarArray(int [] arrayMostrar) {
		System.out.println(Arrays.toString(arrayMostrar));
		
	}

}
