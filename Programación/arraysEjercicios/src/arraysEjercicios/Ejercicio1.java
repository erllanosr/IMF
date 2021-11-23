package arraysEjercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] notas2 = { 4, 8, 9, 10 };
		Arrays.sort(notas2);
		System.out.println(notas2[3]);
		int[] notas = { 9, 2, 7, 3, 1 };
		int[] notasAux = new int[5];
		Scanner lector = new Scanner(System.in);
		/*
		 * for(int i=0; i<notas.length;i++){ System.out.println("pon la nota " + i);
		 * notas[i]=lector.nextInt(); }
		 */
		System.out.println(Arrays.toString(notas));
		Arrays.sort(notas);
		System.out.println(Arrays.toString(notas));
		// System.out.println(notas[notas.length-1]);
		for (int i = notas.length - 1; i >= 0; i--) {
			notasAux[notas.length - 1 - i] = notas[i];
		}
		System.out.println(Arrays.toString(notasAux));
		System.out.println(notasAux[0]);
	}

}
