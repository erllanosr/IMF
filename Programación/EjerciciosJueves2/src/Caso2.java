import java.util.Arrays;

public class Caso2 {

	public static void main(String[] args) {
		//
		// Ejemplo bidi
		/*
		 * int[][] numeros = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		 * System.out.println(Arrays.toString(numeros[0]));
		 * System.out.println(Arrays.toString(numeros[1]));
		 * System.out.println(Arrays.toString(numeros[2]));
		 * System.out.println("============="); for (int i = 0; i < 3; i++) { for (int j
		 * = 0; j < 3; j++) { System.out.print(numeros[i][j]); } System.out.println(); }
		 */
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++)
				System.out.print(arr[row][col] + " ");
			System.out.println();

		}

	}
}
