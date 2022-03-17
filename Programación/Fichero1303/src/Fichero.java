import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Fichero {

	private String ruta;

	public Fichero(String ruta) {
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
		return "Fichero [ruta=" + ruta + "]";
	}

	public void escribirFichero(int[] datos) {
		FileWriter fichero = null;

		try {
			fichero = new FileWriter(ruta, true);// true=append

			for (int dato : datos) {
				fichero.write(dato + "" + (char) 10);
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Problema al crear el fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Problema en Entrada-Salida");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hay un error inesperado");
		} finally {

			try {
				if (fichero != null) {
					fichero.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Finalizado");

		}

	}

	public void escribirFichero(ArrayList<String> datos) {
		FileWriter fichero = null;

		try {
			fichero = new FileWriter(ruta, true);// true=append

			for (String dato : datos) {
				fichero.write(dato + "" + (char) 10);
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Problema al crear el fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Problema en Entrada-Salida");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hay un error inesperado");
		} finally {

			try {
				if (fichero != null) {
					fichero.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Finalizado");

		}

	}

	public void escribirFichero(String dato) {
		FileWriter fichero = null;

		try {
			fichero = new FileWriter(ruta, true);// true=append

			fichero.write(dato + "" + (char) 10);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Problema al crear el fichero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Problema en Entrada-Salida");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hay un error inesperado");
		} finally {

			try {
				if (fichero != null) {
					fichero.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Finalizado");

		}

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
