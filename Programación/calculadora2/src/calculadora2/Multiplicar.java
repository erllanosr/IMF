package calculadora2;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// MULTIPLICACIÓN DOS NÚMEROS
		
		// Zona declarativa
		int operando1;
		int operando2;
		Scanner sc=new Scanner(System.in);
		
		// Zona ejecutiva
		System.out.println("Introduce el primer número:");
		operando1=sc.nextInt();
		System.out.println("Introduce el segundo número:");
		operando2=sc.nextInt();
		System.out.println(operando1 * operando2);
	
	}

}
