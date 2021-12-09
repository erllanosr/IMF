package arraysEjercicios;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tabla1 = new int[3][2];
		int[][] tabla11 = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		int[][] tabla2 = new int[2][2];
		int[][] tabla21 = { { 1, 1 }, { 1, 1 } };

		int[][] tabla3 = new int[3][3];
		int[][] tabla31 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		int[] tabla4 = new int[4];

		int[][] tabla5 = new int[2][5];
		int[][] tabla51 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };

		System.out.println(tabla1.length);
		System.out.println(tabla1[0].length); // Esto lee la cantidad de columnas, recorre desde la posición 0 hasta el
												// último número de la columna.
		System.out.println(tabla2.length);
		System.out.println(tabla3.length);
		System.out.println(tabla4.length);
		System.out.println(tabla5.length);

	}

}
