package calculadora;

import java.util.Scanner;

public class Sumar {

	public static void main(String[] args) {
		//SUMA DE DOS NÚMEROS
		
		//Zona declarativa
		//Creación de variables
		int operando1;
		int operando2;
		int suma;
		//Es preferible usar la variable suma si es que vamos a utilizar la variable más veces. 
		
		Scanner sc=new Scanner(System.in);
		//Zona ejecutiva 
		System.out.println("Introduce el operando1:");
		operando1 = sc.nextInt();
		System.out.println("Introduce el operando2:");
		operando2 = sc.nextInt();
		//suma=operando1+operando2;
		
		System.out.println(operando1 + operando2);
		//System.out.println(suma);
		
	}

}
