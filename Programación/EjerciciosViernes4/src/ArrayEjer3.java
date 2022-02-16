import java.util.Arrays;
import java.util.Scanner;

public class ArrayEjer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] numeros = { 1, 2, 3, 5, 6 };
		System.out.println(Arrays.toString(numeros));
		sumaRestar(numeros, 1);

	}

	private static int sumaRestar(int[] listaNum, int posicion) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = { 1, 2, 3, 5, 6 };
		int posicionNum;
		char caracter;

		System.out.println("Introduce una posición del Array");
		posicionNum = sc.nextInt();
		System.out.println("Introduce '-' si quieres restar o '+' si quieres sumar.");
		caracter = sc.next().charAt(0);

		if (posicionNum == 0) {
			if (caracter == '-') {
				numeros[0] = numeros[0] - 1;
			} else if (caracter == '+') {
				numeros[0] = numeros[0] + 1;
			}
		}
		System.out.println(Arrays.toString(numeros));
		return numeros.length;
	}

}
