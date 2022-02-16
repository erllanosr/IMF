import java.util.ArrayList;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// Entra un arrayList de números, lo devuelve en un Array ordenado
		// descendentemente.
		agregarNumeros(0);
		numOrdenadoDesc(0);

	}

	/*
	 * Scanner sc = new Scanner(System.in); int numero = 0; ArrayList<Integer>
	 * numeros = new ArrayList<Integer>(); int numsOrdenados[] = new int[5]; //
	 * System.out.println(numeros.toString());
	 * System.out.print("***Introduce 5 números de uno en uno.***");
	 * System.out.println(); for (int i = 0; i < 5; i++) {
	 * System.out.print("Introduce un número:"); numero = sc.nextInt();
	 * numeros.add(numero);
	 * 
	 * } System.out.println(numeros);
	 */

	// Metodo para agregar numeros a un ArrayList
	private static int agregarNumeros(int nums) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		System.out.print("***Introduce 5 números de uno en uno.***");
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce un número:");
			numero = sc.nextInt();
			numeros.add(numero);

		}
		System.out.println(numeros);
		return nums;

	}

	// Método para pasar de un ArrayList a un Array ordenado descendientemente.
	private static int numOrdenadoDesc(int num) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int numerosOrdenados[] = new int[5];

		for (int i = 0; i < numeros.size(); i++) {
			while (numeros.size() > 0) {
			}
		}
		System.out.println(numeros);

		return num;

	}

}
