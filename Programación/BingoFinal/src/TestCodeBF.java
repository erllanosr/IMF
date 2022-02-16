import java.util.Arrays;

public class TestCodeBF {

	public static void main(String[] args) {
		// DECLARAR EL ARRRAY
		int[][] carton = new int[3][10];
		int[][] cartonDos = new int[3][10];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(carton[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("------------------");

		// CARTON 2
		// Hacer que en cada columna estén los números aleatorios.
		// cartonDos[1][0] = ((int) (1 + Math.random() * 9));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				cartonDos[i][j] = ((int) (1 + Math.random() * 90));
				System.out.print(cartonDos[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("------------------");
		// CARTON 3
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				cartonDos[0][0] = ((int) (1 + Math.random() * 9));
				cartonDos[1][0] = ((int) (1 + Math.random() * 9));
				cartonDos[2][0] = ((int) (1 + Math.random() * 9));
				cartonDos[1][0] = ((int) (1 + Math.random() * 9));
				cartonDos[1][1] = ((int) (1 + Math.random() * 9));
				cartonDos[1][2] = ((int) (1 + Math.random() * 9));

				System.out.print(cartonDos[i][j] + "|");
			}
			System.out.println();
		}

	}

}
