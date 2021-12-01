import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Pregunta al usuario por dos cadenas y mézclalas

		// Zona Declarativa

		Scanner sc = new Scanner(System.in);
		String cadena1;
		String cadena2;
		String cadenaMezclada = null;
		
		// Zona Ejecutiva
		System.out.println("Introduce la primera cadena:");
		cadena1 = sc.next();
		System.out.println("Introduce la segunda cadena:");
		cadena2= sc.next();
		
		System.out.println(cadena1.length());
		
		for (int i = 0; i < cadena1.length();i++) {
			
		}
		System.out.println(cadenaMezclada);
		/*
		 * Scanner in = new Scanner(System.in);
		 * System.out.print("Enter first String: "); String s1 = in.nextLine();
		 * System.out.print("Enter second String: "); String s2 = in.nextLine(); String
		 * newStr = ""; int len = s1.length();
		 * 
		 * for (int i = 0; i < len; i++) { char ch1 = s1.charAt(i); char ch2 =
		 * s2.charAt(len - 1 - i); newStr = newStr + ch1 + ch2; }
		 * 
		 * System.out.println(newStr); }
		 */
	}
}