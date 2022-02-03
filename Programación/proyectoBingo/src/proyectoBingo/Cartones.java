package proyectoBingo;

import java.util.Arrays;
import java.util.Random;

public class Cartones {
	private int[][] carton;
	private int precioCarton = 5;

	public class carton {

	}

	// getters & setters public int[][] getCarton() { return carton; }
	public void setCarton(int[][] carton) {
		this.carton = carton;
	}

	// toString
	@Override
	public String toString() {
		return "Cartones [carton=" + Arrays.toString(carton) + "]";
	}
}
