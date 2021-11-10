import java.util.Scanner;

public class añosBisiestos {

	public static void main(String[] args) {
		// CALCULAR AÑOS BISIESTOS ENTRE 1950 - 2050
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int anio = 0;

		// ZONA EJECUTIVA
		/*
		 * System.out.println("Ingresa un año entre 1950 y 2050"); anio = sc.nextInt();
		 * for (int i = anio; i >= 1952 && i<= 2052; i+=4) {
		 * System.out.println("Año bisiesto: " + i);
		 * 
		 * }
		 */
		for (int i = 1952; i <= 2048; i += 4) {
			System.out.println("Año bisiesto: " + i);
		}
	}
}
