import java.util.ArrayList;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// Caso 1.
		// Crea un ArrayList de números consecutivos con la dimensión que diga
		// el usuario por consola. Muéstralo. 2,5 puntos.
		mostrarNumeros();

	}

	// Método
	private static void mostrarNumeros() {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>(numero);
		System.out.print("Ingresa un número: ");
		numero = sc.nextInt();

		for (int i = 1; i <= numero + 1; i++) {
			i--;
			// listaNumeros.sort(null);
			listaNumeros.add(i++);
		}
		listaNumeros.remove(0);
		System.out.println(listaNumeros.toString());

	}

}
