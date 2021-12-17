import java.util.Scanner;

public class Caso2H5 {

	public static void main(String[] args) {
		// Pregunta al usuario por dos arrays de caracteres y mézclalos.
		// ABCD y 1234
		// A1B2C3D4
		// Se valora que el usuario seleccione el tamaño de los arrays.

		Scanner sc = new Scanner(System.in);
		int numElementos1 = 0;
		int numElementos2;

		// ARRAY 1
		System.out.println("Introduce la cantidad de elementos del array 1:");
		numElementos1 = sc.nextInt(); // Cantidad de elementos elegida por el usuario.

		char[] array1 = new char[numElementos1]; // Declarar el array.

		System.out.println("Introduce los elementos del arreglo: ");
		for (int i = 0; i < numElementos1; i++) { // Bucle for para que se repita la cantidad de veces elegida por el
													// usuario
			System.out.println("Introduce el caracter número " + (i + 1));
			array1[i] = sc.next().charAt(0);
		}

		System.out.println("Los caracteres del arreglo son: "); // Mostrar los caracteres finales.
		for (int i = 0; i < numElementos1; i++) {
			System.out.print(array1[i] + " ");
		}
		/*
		 * System.out.println(); for (char x : array1) { System.out.println(x + " "); }
		 */

		System.out.println();
		// ARRAY 2
		System.out.println("Introduce la cantidad de elementos del array 2:");
		numElementos2 = sc.nextInt(); // Elementos del array elegida por el usuario.

		char[] array2 = new char[numElementos2];

		for (int i = 0; i < numElementos2; i++) {
			System.out.println("Introduce el caracter número " + (i + 1)); // Se pone el i + 1 para que muestre 1, 2, 3
																			// y no 0,
			// 1, 2.
			array2[i] = sc.next().charAt(0); // Esto¿?
		}
		System.out.println("Los caracteres del array 2 son:");
		for (int i = 0; i < numElementos2; i++) {
			System.out.print(array2[i] + " ");
		}

	}

}
