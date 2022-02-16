import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Nombres {

	private static final int String = 0;
	private static final int ArrayList = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> clase = new ArrayList<String>();
		clase.add("Adrian");
		clase.add("Carlos");
		clase.add("Jorge");
		clase.add("David");
		clase.add("Piero");
		clase.add("Tania");
		clase.add("Paula");
		clase.add("Elena");
		clase.add("Erick");
		clase.add("Amir");
		System.out.println(clase.toString());
		FileWriter fw = null;

		try {
			clase.toString();
			fw = new FileWriter("datosNombres/clase.txt", true);// a�ade al final los datos
			// Escribimos en el fichero
			for (int i=0; i<clase.size();i++) {
				fw.write(i);
				fw.write("\r\n");
			}
				
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
