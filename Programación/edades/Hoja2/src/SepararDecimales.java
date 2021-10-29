import java.util.Scanner;

public class SepararDecimales {

	public static void main(String[] args) {
		// Separar decimales
		Scanner sc = new Scanner(System.in);
		float num;
		int ent;
		float dec;
		System.out.println("Introduzca un número:");
		num = sc.nextFloat();

		ent = (int) num;
		dec = num;
		dec = num - ent;

		System.out.println("La parte entera es " + ent);
		System.out.println("La parte decimal es " + dec);
	}

}
