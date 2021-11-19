import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// CASO 3: Adivina un número diciendo si el introducido es mayor o menor que el
		// que tiene que adivinar.
		Scanner sc = new Scanner(System.in);
		int numero = 19;
		int numUsuario;

		System.out.println("Trata de adivinar el número de la máquina introduciendo un número.");
		do {
			numUsuario = sc.nextInt();
			if (numUsuario == numero) {
				System.out.println("Bien, has acertado");
			} else if (numUsuario > numero) {
				System.out.println("El número que has introducido es MAYOR al número de la máquina.");
			} else if (numUsuario < numero) {
				System.out.println("El número que has introducido es MENOR al número de la máquina.");
			}
		} while (numUsuario != numero);

	}

}
