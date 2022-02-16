import java.util.Arrays;
import java.util.Random;

public class Cartones {

	private int nums[][];

	public Cartones() {
		super();
		this.nums = new int[3][5];
		generarCarton();
	}

	public int[][] getNums() {
		return nums;
	}

	public void setNums(int[][] nums) {
		this.nums = nums;
	}

	@Override
	public String toString() {
		return "carton [nums=" + Arrays.toString(nums) + "]";
	}

	// Metodo para rellenar cartón
	public void generarCarton() {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				this.nums[i][j] = 0;

			}
			// Arrays.sort(cartones[i]);
		}
	}

	public void imprimir() {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
				if ((j + 1) % 10 == 0 || (j + 1) % 10 == 5) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}

	// Método para verificar numero en cartón
	// Método para saber si hay línea
	public boolean hayLinea() {

		return true;
	}

	// Método para saber si hay bingo
	public boolean hayBingo() {

		return true;
	}

	public void mostrarCartonesNumeros() {
		int[][] cartonDos = new int[3][10];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				cartonDos[i][j] = ((int) (1 + Math.random() * 90));
				System.out.print(cartonDos[i][j] + "|");
			}
			System.out.println();
		}

	}

}