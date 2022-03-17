import java.io.FileWriter;
import java.io.IOException;

public class Persona {

	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		FileWriter fw = null;

		try {
			fw = new FileWriter("datosNombres/clase.txt", true);
			fw.write("Persona [nombre=" + nombre + ", edad=" + edad + "]" + (char) 13);
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
		return "";

	}

}
