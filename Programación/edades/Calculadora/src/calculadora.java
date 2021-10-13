import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// CALCULADORA

		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int opcion;

		// ZONA EJECUTIVA
		// Mostrar primero el menú.
		// El usuario escribe los números.
		System.out.println("Escribe dos números para realizar las siguientes operaciones.");
		System.out.println("Escribe el primer número:");
		num1 = sc.nextInt();
		System.out.println("Escribe el segundo número:");
		num2 = sc.nextInt();

		// El usuario elige la operación.
		System.out.println("Elige qué operación quieres realizar, escribe solo el número.");
		System.out.println("1. Sumar (+).");
		System.out.println("2. Restar (-).");
		System.out.println("3. Multiplicar(*).");
		System.out.println("4. Dividir (/).");
		System.out.println("5. Salir.");
		opcion = sc.nextInt();

		// Realizar la operación correspondiente.
		// Usar if y else, encadenados.
		if (opcion == 1) {
			System.out.print("El resultado es " + (num1 + num2));
		}
		if (opcion == 2) {
			System.out.print("El resultado es " + (num1 - num2));
		}
		if (opcion == 3) {
			System.out.print("El resultado es " + (num1 * num2));
		}
		if (opcion == 4) {
			System.out.print("El resultado es " + (num1 / num2));
		}
		if (opcion == 5) {
			System.out.println("Salir.");
		}
	}
}
