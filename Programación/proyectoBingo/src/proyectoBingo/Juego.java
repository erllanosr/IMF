package proyectoBingo;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bombo miBombo = new Bombo(1, 99);

		miBombo.desordenarBombo();

		System.out.println(miBombo.toString());

		for (int i = 0; i <= 99; i++) {

			char letra;
			System.out.print("Quieres otro número¿?");
			letra = sc.next().charAt(0);
			if (miBombo.sacarNumero() > 0 || miBombo.sacarNumero() <= 99 && letra == 's') {
				System.out.println("Quieres otro número¿?");
				System.out.println(miBombo.sacarNumero());
			}

		}
	}

}
