import java.util.ArrayList;

public class Consola {

	// Método para mostrar Bienvenida
	public static void mostrarBienvenida() {
		System.out.println("-------------------------------------------");
		System.out.println("|	***Biblioteca Películas***	  |");
		System.out.println(
				"-------------------------------------------\r\n" + "Estas son las opciones que hay disponibles:");
	}

	// Método para mostrar Menú
	public static void mostrarMenu() {
		System.out.println("1. Ver películas añadidas.\r\n" + "2. Añadir una película a la lista \r\n"
				+ "3. Modificar una película\r\n" + "4. Borrar una película de la lista\r\n" + "5. Salir");

	}

	/*
	 * public static void mostrarPeliculas(ArrayList<Peliculas> peliculas) {
	 * 
	 * System.out.println(peliculas.toString()); }
	 */

	// Método para mostrar un mensaje
	public static void mostrarMensaje(String string) {
		System.out.println(string);
	}

}
