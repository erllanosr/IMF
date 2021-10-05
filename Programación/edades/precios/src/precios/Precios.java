package precios;

import java.util.Scanner;

public class Precios {

	public static void main(String[] args) {
		//Preguntar número del 1-7
		//Zona declarativa
		Scanner sc=new Scanner(System.in);
		int numero;
		
		//Zona ejecutiva
		System.out.println("Introduce un número del 1 - 7.");
		numero = sc.nextInt();
		
		if(numero==2) {
			System.out.println("MAR");
		}else {
			if(numero>=1&&numero<=7) {
				
			}
			
		}
		
		if(numero==1) {
			System.out.println("Lunes");
		}else {
			if (numero>=1&&numero<=7) {
				System.out.println("Error.");
				
			}
		}
	}
}
