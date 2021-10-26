import java.util.Scanner;

public class caso5Hoja2 {

	public static void main(String[] args) {
		// HABITACIONES CASA RURAL
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int habitacion;

		// ZONA EJECUTIVA

		// Mostrar listado de habitaciones.
		System.out.println("Estas son las opciones disponibles:");
		System.out.println("==================================");
		System.out.println("HABITACIÓN || CAMAS || PLANTA");
		System.out.println("1. Azul.   || 2     || Primera");
		System.out.println("2. Roja.   || 1     || Primera");
		System.out.println("3. Verde.  || 3     || Segunda");
		System.out.println("4. Rosa.   || 2     || Segunda");
		System.out.println("5. Gris.   || 1     || Tercera");
		System.out.println("==================================");
		System.out.println("Elige una habitación 1-5:");
		
		
		do {
			habitacion = sc.nextInt();
			
		}while (habitacion<1 || habitacion >5);
		switch (habitacion) {
		case 1:
			System.out.println("Tiene 2 camas y está en la primera planta.");
			break;
		case 2:
			System.out.println("Tiene 1 cama y está en la primera planta.");
			break;
		case 3:
			System.out.println("Tiene 3 camas y está en la segunda planta.");
			break;
		case 4:
			System.out.println("Tiene 2 camas y está en la segunda planta.");
			break;
		case 5:
			System.out.println("Tiene 1 cama y está en la tercera habitación.");
			break;
		}
		

	}

}
