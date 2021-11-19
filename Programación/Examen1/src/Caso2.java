import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// CASO 2: El usuario tiene un peso. Pedirás un número de semanas. El usuario te
		// dirá en qué peso quiere quedarse y el sistema mostrará el peso que debe
		// reducir o aumentar en cada semana.

		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int peso;
		int pesoIdeal;
		float pesoPorSemana;
		int pesoBajar = 0;
		int pesoSubir;
		int semanasUsuario;

		// ZONA EJECUTIVA
		System.out.println("Programa para saber los kg a subir o bajar depende las semanas introducidas.");
		System.out.println("Introduce tu peso:");
		peso = sc.nextInt();
		System.out.println("Introduce el peso al que quieres llegar.");
		pesoIdeal = sc.nextInt();
		System.out.println("¿En cuántas semanas quieres llegar a ese peso?");
		semanasUsuario = sc.nextInt();

		do {
			if (pesoIdeal > peso) { // Si el usuario quiere subir de peso.
				pesoSubir = pesoIdeal - peso;
				pesoPorSemana = pesoSubir / semanasUsuario;
				System.out.print("Tendrás que ganar " + pesoPorSemana + "kg por semana.");
			} else if (pesoIdeal < peso) { // Si el usuario quiere bajar de peso.
				pesoBajar = pesoIdeal - peso;
				pesoPorSemana = pesoBajar / semanasUsuario;
				System.out.print("Tendrás que perder " + pesoPorSemana + "kg por semana.");
			}

		} while (pesoIdeal < peso && pesoIdeal > peso);

	}

}
