package arraysEjercicios;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		int numeroUsuario;
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre",
				"Octubre", "Noviembre", "Diciembre" };

		// Zona Ejecutiva
		System.out.println("Introduce un número del 1-12 para ver el mes en palabras.");
		numeroUsuario = sc.nextInt();

		System.out.println(meses[numeroUsuario - 1]);

	}

}
