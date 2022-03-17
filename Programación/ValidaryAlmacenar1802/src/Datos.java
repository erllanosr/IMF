import java.io.FileWriter;
import java.io.IOException;

public class Datos {
	// private static ArrayList<Coches> listaCoches = new ArrayList<Coches>();

	public static void guardar(Coches miCoche) {

		// listaCoches.add(miCoche);

		FileWriter fw = null;

		try {

			fw = new FileWriter("datos/coches.txt", true);// añade al final los
			// datos
			fw.write(miCoche.toString() + (char) 10);

		} catch (IOException e) {
			System.out.println("Se ha producido un error de entrada-salida");
		} catch (Exception e) {
			System.out.println("Se ha producido un error inesperado");
		} finally {
			// Cerramos el stream
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
