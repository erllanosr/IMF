import java.util.Arrays;
import java.util.Scanner;

public class TestCodeH5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nElementos = 0;
		char[] letras = new char[nElementos];
		
		System.out.println("Digite la cantidad de posiciones que quieres que tenga el arreglo.");
		nElementos = sc.nextInt();

		System.out.println("Digite los elementos del arreglo:");
		for (int i = 0; i < nElementos; i++) {
			System.out.println((i + 1) + ". Digite un caracter");
			letras[i] = sc.next().charAt(0);
		}
		System.out.println("Los caracteres del arreglo son:");
		for (int i = 0; i < nElementos ; i++) {
			System.out.println(i);
		}
		
		
		
		
		/*
		 * System.out.println("Escribe un número"); numero = sc.nextInt(); while (numero
		 * > 0 || numero < 0) { if (numero > 0) {
		 * System.out.println("El número es positivo"); } else {
		 * System.out.println("El número es negativo."); }
		 * System.out.println("Escribe otro número"); numero = sc.nextInt();
		 */
	}

}
