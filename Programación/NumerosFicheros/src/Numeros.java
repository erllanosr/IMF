import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(5);
		listaNumeros.add(2);
		listaNumeros.add(6);
		listaNumeros.add(8);
		listaNumeros.add(7);

		System.out.println(listaNumeros.toString());
		FileWriter fw = null;

		try {
			listaNumeros.toString();
			fw = new FileWriter("datosNombres/clase.txt", true);// a�ade al final los datos
			// Escribimos en el fichero
			for (int i = 0; i < listaNumeros.size(); i++) {
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
