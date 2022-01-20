import java.util.ArrayList;
import java.util.Scanner;

public class bingo {

	public static void main(String[] args) {
		// Bingo. Números del 1-99.
		Scanner sc = new Scanner(System.in);
		int numeroAle;
		int contador;

		for (int i = 0; i < 100; i++) {
			System.out.println("BINGO");
			System.out.println("Quieres otro número¿?");
			System.out.println("1. Para SÍ. 2. Para NO.");
			contador = sc.nextInt();
			if (contador == 1) {
				numeroAle = (int) (Math.random() * 99 + 1);
				System.out.println(numeroAle);
			} else {
				System.out.println("Saliendo del programa.");
				i=100;
			}
		}
		
		// HACER EL BOMBO CON ARRAYLIST y DESORDENARLO.
		ArrayList<Integer> bombo = new ArrayList<Integer>();
		
		

	}
	// MÉTODOS PARA EL BOMBO.
	// Método para crear la lista con números del Bombo.
	
	private static int listaBombo(int lista, int desde, int hasta) {
		for(int i = desde; i<=hasta;i++) {
			
		}
		return 0;
	}
	

}
