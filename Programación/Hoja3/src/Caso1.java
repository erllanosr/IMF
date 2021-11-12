import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// PEDIR AL USUARIO UN NÚMERO ENTRE 100 Y 1000.
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int numUsuario;
		int numRepeticiones;
		int numeroAleatorio;

		// ZONA EJECUTIVA
		// Pedir número y comprobar que esté dentro del rango.
		do {
			System.out.println("Introduce un número entre 100-1000:");
			numUsuario = sc.nextInt();
		} while (numUsuario < 100 || numUsuario > 1000);

		// Pedir el número de repeticiones que sea >3.
		do {
			System.out.println("Introduce el número de repeticiones, >3:");
			numRepeticiones = sc.nextInt();
		} while (numRepeticiones < 3);

		// Generar 3 números al azar con el límite elegido por el usuario.
		
	
		while(numRepeticiones>3) {
			numeroAleatorio=(int) Math.floor(Math.random()*numUsuario+100);
			System.out.println(numeroAleatorio);
		}

	}

}
