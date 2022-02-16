import java.util.Arrays;
import java.util.Scanner;

public class ArrayEjer31 {

	public static void main(String[] args) {
		int[] numeros = { 0, 2, 4, 0, 1 };
		int posicion = 0;
		char caracter = 0;

		System.out.println(Arrays.toString(numeros));
		posicion = introducirPos(posicion);

		caracter = introducirCaracter(caracter);

		operar(numeros, posicion, caracter);
		System.out.println(Arrays.toString(numeros));
	}

	private static int introducirPos(int numero) {
		int posicion;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la posicion");

		posicion = sc.nextInt();

		return posicion;
	}

	private static char introducirCaracter(char caracter) {
		char sign;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduca un símbolo(+ o -)");
		sign = sc.next().charAt(0);
		return sign;
	}

	private static void operar(int[] numeros, int posicion, char sign) {

		if (numeros[posicion] >= 0) {
			if (sign == '+') {
				numeros[posicion] = numeros[posicion] + 1;
			} else if (sign == '-' && numeros[posicion] > 0) {
				numeros[posicion] = numeros[posicion] - 1;
			}
		}

	}

}
