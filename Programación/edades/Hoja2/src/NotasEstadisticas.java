import java.util.Scanner;

public class NotasEstadisticas {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea 30 notas de examen, podrán usarse decimales. Se
		 * debe comprobar que cada una de ellas está entre 0 y 10, si alguna no lo
		 * cumple se seguirá pidiendo hasta que sea correcta. Calcular la nota media,
		 * la más alta y la más baja e informar del resultado por pantalla.
		 */
		float nota;
		int numeroNotas = 3;
		float sumaNotas = 0.0f;
		float notaMayor = 0;
		float notaMenor = 10;

		Scanner lector = new Scanner(System.in);

		for (int i = 1; i <= numeroNotas; i++) {
			do {
				System.out.println("Introduce una nota " + i);
				nota = lector.nextFloat();
			} while (nota < 0 || nota > 10);
			sumaNotas += nota;
			if (nota > notaMayor) {
				notaMayor = nota;
			}
			if (nota < notaMenor) {
				notaMenor = nota;
			}
		}

		System.out.println("La media es: " + (sumaNotas / numeroNotas));
		System.out.println("La nota más alta es: " + notaMayor);
		System.out.println("La nota más baja es: " + notaMenor);

	}

}