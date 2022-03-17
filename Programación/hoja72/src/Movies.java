
public class Movies {

	public static void main(String[] args) {
		GestorPeliculas gestorPeliculas = new GestorPeliculas();

		Utilidades.mensajeConsola("-------------------------------------------");
		Utilidades.mensajeConsola("|	***Biblioteca Pel	  |");
		Utilidades.mensajeConsola(
				"-------------------------------------------\r\n" + "Estas son las opciones que hay disponibles:");
		Utilidades.mensajeConsola("1. Ver pela\r\n" + "2. Auna pela la lista \r\n" + "3. Modificar una pel\r\n"
				+ "4. Borrar una pelde la lista\r\n" + "5. Salir");

		do {
			switch (Utilidades.opcionMenu()) {
			case 1:
				gestorPeliculas.mostrarPeliculas();
				break;
			case 2:
				gestorPeliculas.agregarPelicula();
				break;
			case 3:
				gestorPeliculas.modificarPelicula();
				break;
			case 4:
				gestorPeliculas.borrarPelicula();
				break;
			}

		} while (Utilidades.opcionMenu() > 0 || Utilidades.opcionMenu() < 5);
	}
}
