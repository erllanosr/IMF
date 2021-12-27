import java.util.Scanner;

public class Caso4H5 {

	public static void main(String[] args) {
		// Bingo
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int numero;
		int contador;
		int bingo[][] = { { 1, 11, 20, 32, 44, 50, 61, 73, 81, 93 }, { 4, 13, 21, 38, 47, 53, 66, 74, 87, 94 },
				{ 9, 18, 22, 39, 49, 55, 86, 76, 88, 98 } };

		// Zona Ejecutiva
		// Para mostrar los números.
		for (int i = 0; i < bingo.length; i++) { // FILAR
			System.out.println();
			for (int j = 0; j < bingo[0].length; j++) { // COLUMNAS
				System.out.print(bingo[i][j] + "|");
			}
		}
		System.out.println();
		System.out.println("Introduce un número para saber si está en el cartón. ");
		numero = sc.nextInt();

		// Saber si está o no en el cartón.
		// Tengo un problema al momento de mostrar si está o no en el cartón.
		for (int i = 0; i < bingo.length; i++) { // FILAR
			for (int j = 0; j < bingo[0].length; j++) { // COLUMNAS
				if (bingo[i][j] == numero) {
					System.out.println("Está en el cartón.");
				} else {
					System.out.println("No está en el cartón.");
				}
			}
		}
	}

}
