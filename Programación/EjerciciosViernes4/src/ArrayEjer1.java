
import java.util.Arrays;

public class ArrayEjer1 {

	public static void main(String[] args) {
		int[] numeros = {4, 3, 2, 1};
		buscarPosicion(numeros, 2);

	}

	private static int buscarPosicion(int[] lista, int numero) {
		int i = 0;
		int posicion = -1;
		// int[] numeros={4,3,2,1};
		while (i < lista.length && posicion == -1) {
			if (lista[i] <= numero) {
				posicion = i;
			}
			i++;
		}
		return posicion;
	}

}
