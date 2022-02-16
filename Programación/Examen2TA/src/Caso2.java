import java.util.ArrayList;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Entra un ArrayList de números enteros y:
		// a) Entra un número y se añade al ArrayList.
		introducirNumero(0);

		// b) Entra una posición y un número y se modifica esa posición.
		posicionNumero(0);

		// c) Entra un número y se elimina todas las veces que aparece en la lista.

	}

	// Metodo para introducir un número y añadirlo al ArrayList.
	private static int introducirNumero(int nums) {
		Scanner sc = new Scanner(System.in);
		int numero;
		ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
		System.out.print("***Introduce números de uno en uno***");
		System.out.println();
		System.out.print("Introduce el primer número:");
		numero = sc.nextInt();
		numerosEnteros.add(numero);
		System.out.println(numerosEnteros);

		return numero;

	}

	// Metodo para pedir una posicion y un número y añadir el número en la posición.
	private static int posicionNumero(int nums) {
		Scanner sc = new Scanner(System.in);
		int posicion;
		int numero;
		ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();
		System.out.println("***Introduce una posición y un número para añadir al ArrayList***");
		System.out.print("Introduce la posicion:");
		posicion = sc.nextInt();
		System.out.print("Introduce el número:");
		numero = sc.nextInt();
		numerosEnteros.set(posicion, numero);
		numerosEnteros.add(numero);
		System.out.println(numerosEnteros);

		return numero;

	}

	// Entra un número y se elimina todas las veces que aparece en la lista.
	private static int eliminarNumero(int numero) {
		return numero;
	}

}
