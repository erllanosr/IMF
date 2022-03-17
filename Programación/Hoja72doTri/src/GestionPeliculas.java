import java.util.ArrayList;

public class GestionPeliculas {

	public static void main(String[] args) {

		GenerosPelis peliculasGeneral = new GenerosPelis("General");

		do {
			Consola.mostrarBienvenida();
			Consola.mostrarMenu();
			switch (Lector.opcionMenu()) {
			case 1:
				peliculasGeneral.verListaPeliculas();
				break;
			case 2:
				peliculasGeneral.agregarPeliculas();
				break;
			case 3:
				peliculasGeneral.modificarPelicula();
				break;
			case 4:
				peliculasGeneral.borrarPeliculas();
				break;
			default:
				break;
			}

		} while (Lector.opcionMenu() >= 1 || Lector.opcionMenu() < 5);

	}
}
