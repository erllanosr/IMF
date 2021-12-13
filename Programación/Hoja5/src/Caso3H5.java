
public class Caso3H5 {

	public static void main(String[] args) {
		// Genera 20 números enteros al azar entre 1 y 100. Ordénalos sin usar Arrays.sort.
		// Zona Declarativa
		
		
		// Zona Ejecutiva
		// Generar 20 números aleatorios entre 1 y 100.
		for (int i=0; i<20;i++) {
			System.out.println((int)(Math.random()*(100-1+1))+1);
		}

	}

}
