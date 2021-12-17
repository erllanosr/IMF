import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestCodeH5 {

	public static void main(String[] args) {
		// Leer 5 números, guardarlos en el array y mostrarlos al inverso.
		Scanner sc = new Scanner(System.in);
		
		float[] numeros = new float[5];
		
		for(int i=0; i<5;i++) {
			System.out.print("Introduce el elemento número " + (i+1));
			numeros[i] = sc.nextFloat();
		}
		
		System.out.println("Se mostrarán los números introducidos a la inversa.");
		for (int i = 4; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		
	}

}
