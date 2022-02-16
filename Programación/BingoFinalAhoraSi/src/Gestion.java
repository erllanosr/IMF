import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);

		int numCarton;

		System.out.println("*********************");
		System.out.println("*** Bienvenido a ***");
		System.out.println("*** BINGO  RINGO *** ");
		System.out.println("*********************");
		System.out.println();
		System.out.println("Introduce el numero de cartones a jugar: ");
		numCarton = lector.nextInt();
		Carton cartones[] = new Carton[numCarton];
		System.out.println("Estos son los cartones para jugar:");
		for (int i = 0; i < cartones.length; i++) {
			cartones[i] = new Carton();
			System.out.println("Carton " + (i + 1));
			cartones[i].imprimir();
		}
		Bombo bombo = new Bombo();
		boolean hayBingo = false;
		boolean hayLinea = false;
		while (!hayBingo) {
			int bola = bombo.sacaBola();
			System.out.println("Ha salido la bola " + bola);

			for (int i = 0; i < cartones.length; i++) {
				cartones[i].verificar(bola);
				if (!hayLinea && cartones[i].hayLinea()) {
					hayLinea = true;
					System.err.println("Ha habido línea en el cartón nº " + (i + 1));
				}

				if (cartones[i].hayBingo()) {
					hayBingo = true;
				}
			}

		}
		for (int i = 0; i < cartones.length; i++) {
			if (cartones[i].hayBingo()) {
				System.err.println("Ha habido bingo en el cartón nº " + (i + 1));
			}
		}

	}

}