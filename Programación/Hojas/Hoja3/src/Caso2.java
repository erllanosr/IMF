import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Productos y precios
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int opcion;
		int peso;
		
		
		// ZONA EJECUTIVA
		// Mostrar las opciones disponibles.
		System.out.println("Elige lo que vas a comprar:");
		System.out.println("PRODUCTOS | 250gr | 500gr| 1000gr");
		System.out.println("Manzanas  | 1,5€  | 3€   | 5,8€");
		System.out.println("Mandarinas| 2€    | 4€   | 7,2€");
		System.out.println("Naranjas  | 2,7€  | 5    | 9,1€");
		System.out.println("Para manzanas escribe 1. Para mandarinas escribe 2. Para naranjas escribe 3.");

	}

}
