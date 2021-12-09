import java.util.Arrays;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// Array de 5 nombres y preguntar al usuario una letra y ver cuántas veces se
		// repite en todo el array.
		Scanner sc = new Scanner(System.in);
		char letra;
		int letrAsci = 0;
		int contador = 0;
		String[] nombres = { "Nombre1", "Nombre2", "Nombre3", "Nombre4", "Nombre5", "Nombre6" };
		String nombresMin = Arrays.toString(nombres).toLowerCase();

		System.out.println("Introduce una letra:");
		letra = sc.next().charAt(0);

		System.out.print(Arrays.toString(nombres).toLowerCase());

		int asciiValor = 'a';
		System.out.println("ASCII VALOR NUMÉRICO: " + asciiValor);

		System.out.print(nombres.length);

		//for (String x : nombres) {
			//for (int i = 0; i < nombres.toString().length().toLowerCase(); i++) {
				//x.charAt(0);
				//contador++;
			//}

		//}
		System.out.println("La letra " + letra + " ha aparecido " + contador + " veces.");
		/*
		 * for (int i = 0; i < nombres.length + 1; i++) { if
		 * (nombres.toString().charAt(i) == letra) {
		 * 
		 * contador++; } ; }
		 */
		System.out.print(nombres.toString().indexOf(letra));
		System.out.println("La letra " + letra + " ha aparecido " + contador + " veces.");

	}
}
