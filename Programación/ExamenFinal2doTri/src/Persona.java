import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Persona {
	// Caso 3.
	// Tenemos una lista de personas (nombre, edad). Dada una edad que se
	// lee desde un fichero, vuelca a otro fichero los nombres y edades de todas las
	// personas mayores de dicha edad.

	private String ruta;

	public Persona(String ruta) {
		super();
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Persona [ruta=" + ruta + "]";
	}

	public void leerFichero() {

		String cadena;
		FileReader fichero = null;
		BufferedReader lector = null;

		try {
			// la ruta del fichero es:
			fichero = new FileReader(ruta);
			lector = new BufferedReader(fichero);

			while ((cadena = lector.readLine()) != null) {
				System.out.println(cadena);
			}

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Hay un problema de lectura");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (lector != null) {
					lector.close();
				}
				if (fichero != null) {
					fichero.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("fin");
		}

	}

}
