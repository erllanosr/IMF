import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// CASO 1: Pide números al usuario hasta que el número introducido sea menor que
		// el anterior.
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int numUsuario;
		int numAnterior=0;
		boolean parar=false;

		// Zona Ejecutiva
		while (!parar) {
			System.out.println("Introduce un número:");
			numUsuario = sc.nextInt();
			if (numUsuario>=numAnterior) {
				numAnterior=numUsuario;
			}else {
				parar=true;
			}
		}
		/*do {
			System.out.println("Introduce números, de uno en uno.");
			numUsuario = sc.nextInt();
			if (numUsuario>numAnterior) {
				System.out.println("Sigue introduciendo números:");
			}else if (numAnterior<numUsuario) {
				System.out.println("Para");
			}
			
		}while(true); */
		
		
	}
	

}
