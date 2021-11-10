package piedrapapel;



import java.util.Random;

import java.util.Scanner;



import javax.sql.rowset.CachedRowSet;



public class ppt {



	public static void main(String[] args) {

		// vamos a crear un programa para jugar a ppt contra la máquina



		int objetojugador;

		int objetomaquina;



		Scanner sc = new Scanner(System.in);

		Random random = new Random();



		// primero vamos a hacer que el jugador elija su objeto



		System.out.println("introduce el objeto con el que quieres jugar (1 = piedra, 2 = papel y 3 = tijera):");



		objetojugador = sc.nextInt();



		// ahora la máquina saca su objeto



		objetomaquina = (int) (Math.random() * (3) + 1);



		System.out.println("la máquina ha sacado" + objetomaquina);



		// función



		if (objetojugador == 1) {

			switch (objetomaquina) {

			case 1:

				System.out.println("Empate!");

				break;

			case 2:

				System.out.println("Gana la máquina :(");

				break;

			case 3:

				System.out.println("Gana el jugador :)");

				break;



			}

		} else if (objetojugador == 2) {

			switch (objetomaquina) {

			case 1:

				System.out.println("Gana el jugador :)");

				break;

			case 2:

				System.out.println("Empate!");

				break;

			case 3:

				System.out.println("Gana la máquina :(");

				break;

			}

		} else if (objetojugador == 3) {

			switch (objetomaquina) {

			case 1:

				System.out.println("Gana la máquina :(");

				break;

			case 2:

				System.out.println("Gana el jugador :)");

				break;

			case 3:

				System.out.println("Empate!");

				break;



			}



		}

	}

}

