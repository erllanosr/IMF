package proyectoBingo;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bombo miBombo = new Bombo(1, 99);

		miBombo.randomizarBombo();
		System.out.println(miBombo.toString());
		miBombo.sacarNumero();
		System.out.println(miBombo.toString());
		miBombo.sacarNumero();
		System.out.println(miBombo.toString());
		Cartones.mostrarCartones();
	}
	

}
