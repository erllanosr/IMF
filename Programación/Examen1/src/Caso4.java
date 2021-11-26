import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// CASO 4: Pide números al usuario y di de qué tipo serían. Byte, short, int o
		// long.

		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		long numUsuario = 0;

		// ZONA EJECUTIVAk
		System.out.println("Introduce números (uno en uno) para saber de qué tipo es:");
		numUsuario = sc.nextLong();
		if (numUsuario >= -128 && numUsuario <= 127) {
			System.out.println("El número es de tipo BYTE.");
		} else if (numUsuario >= -32000 && numUsuario <= 32000) {
			System.out.println("El número es de tipo SHORT.");

		} else if (numUsuario >= -100000 && numUsuario <= 100000) {
			System.out.println("El número es de tipo INT.");
		} else if (numUsuario >= -10000000 && numUsuario <= 10000000) {
			System.out.println("El número es de tipo LONG.");
		}

	}

}