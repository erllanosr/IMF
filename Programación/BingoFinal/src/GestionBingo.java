import java.util.Scanner;

public class GestionBingo {

	public static void main(String[] args) {
		/*
		 * TODO Auto-generated method stub Scanner sc = new Scanner(System.in); Bombo
		 * miBombo = new Bombo(1, 99);
		 * 
		 * miBombo.randomizarBombo(); System.out.println(miBombo.toString());
		 */
		Scanner lector = new Scanner(System.in);

		int numCarton;

		System.out.println("*********************");
		System.out.println("*** Bienvenido a ***");
		System.out.println("*** BINGO  Ringo ***");
		System.out.println("*********************");
		System.out.println();
		System.out.print("Introduce el numero de cartones que vas a jugar: ");
		numCarton = lector.nextInt();
		Bombo.randomizarNumeros(numCarton);
		Cartones carton[] = new Cartones[numCarton];
		for (int i = 0; i < carton.length; i++) {
			carton[i] = new Cartones();
			carton[i].imprimir();
			System.out.println(carton[i].hayLinea());
		}
		Bombo bombo = new Bombo();
		/*
		 * while bombo tiene aun bolas || nadie tenga bingo { bombo.sacabola
		 * cartones.marcar }
		 */

	}

}
