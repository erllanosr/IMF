import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class NombrEdad {

	private static final int String = 0;
	private static final int ArrayList = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Pepe;16");
		nombres.add("Lola;21");
		nombres.add("Luis;37");
		nombres.add("María;7");

		System.out.println(nombres.toString());
		FileWriter fw = null;
		try {
			nombres.toString();
			fw = new FileWriter("datosNombres/nombresEdades.txt", true);// a�ade al final los datos
			// Escribimos en el fichero

			for (int i = 0; i < nombres.size(); i++) {
				fw.write(i);
				fw.write("\r\n");

			}
			System.out.println(nombres.toString());
			System.out.println("Proceso terminado");

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
