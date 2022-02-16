import java.util.Arrays;
import java.util.Random;

public class Carton {

	private int nums[][];
	private int filas = 3;
	private int columnas = 9;

	public Carton() {
		super();
		this.nums = new int[filas][columnas];
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
				nums[i][j] = (int) (Math.random() * 99 + 1);

			}
			Arrays.sort(nums[i]);
		}
	}

	public void imprimir() {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println();
	}

	// Método para verificar numero en cartón
	// Método para saber si hay línea
	public boolean hayLinea() {
		for (int i = 0; i < nums.length; i++) {
			int contador = 0;
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == 0) {
					contador++;
				}
			}
			if (contador == nums[i].length) {
				return true;
			}
		}

		return false;
	}

	// Método para saber si hay bingo
	public boolean hayBingo() {
		int contadorLineas = 0;
		for (int i = 0; i < nums.length; i++) {
			int contador = 0;
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == 0) {
					contador++;
				}
			}
			if (contador == nums[i].length) {
				contadorLineas++;
			}
		}

		return contadorLineas == nums.length;
	}

	// verificar
	public void verificar(int bola) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == bola) {
					nums[i][j] = 0;
				}
			}
		}

	}

}