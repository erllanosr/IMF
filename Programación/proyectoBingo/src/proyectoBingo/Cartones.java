package proyectoBingo;

import java.util.Arrays;
import java.util.Random;

public class Cartones {
	private int cartones[][];

	public Cartones(int[][] cartones) {
		super();
		this.cartones = cartones;
	}

	public int[][] getCartones() {
		return cartones;
	}

	public void setCartones(int[][] cartones) {
		this.cartones = cartones;
	}

	@Override
	public String toString() {
		return "Cartones [cartones=" + Arrays.toString(cartones) + "]";
	}

	/*
	 * private int[][] carton; private int precioCarton = 5;
	 * 
	 * public class carton {
	 * 
	 * }
	 * 
	 * // getters & setters public int[][] getCarton() { return carton; } public
	 * void setCarton(int[][] carton) { this.carton = carton; }
	 * 
	 * // toString
	 * 
	 * @Override public String toString() { return "Cartones [carton=" +
	 * Arrays.toString(carton) + "]"; }
	 * 
	 * private int generarCartones() {
	 * 
	 * return 0; }
	 */
	public static void mostrarCartones() {
		int cartones[][] = new int[3][10];

		for (int i = 1; i < cartones.length; i++) {
			System.out.println("Carton " + i);

		}

	}

	// FALTA IMPRIMIR POR PANTALLA EL ARRAY BIDIMENSIONAL CON LOS NÚMEROS DEL 1-99.
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
