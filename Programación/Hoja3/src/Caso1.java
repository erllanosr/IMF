import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// PEDIR AL USUARIO UN NÚMERO ENTRE 100 Y 1000.
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int numeroAleatorio;
		int numero = 0;

		// ZONA EJECUTIVA
		System.out.println("Introduce un número");
		numeroAleatorio = sc.nextInt();
		for (int i = 0; i <= 20; i++) {
			numeroAleatorio = (int) Math.floor(Math.random() * (numero - 100) + 100);
			System.out.println(numeroAleatorio);
		}

	}

}
