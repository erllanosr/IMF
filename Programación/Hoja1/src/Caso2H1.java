import java.util.Scanner;

public class Caso2H1 {

	public static void main(String[] args) {
		// Leer 2 números y visualizar el número mayor o la palabra “iguales” si son iguales.
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		// Zona Ejecutiva
		System.out.print("Ingresa el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Ingresa el segundo número: ");
		num2 = sc.nextInt();
		
		if (num1==num2) {
			System.out.println("Son iguales.");
		}else if (num1>num2) {
			System.out.println("Número 1 MAYOR.");
		}else if (num1<num2) {
			System.out.println("Número 2 MAYOR.");
		}
		
		

	}

}
