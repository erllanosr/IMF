
public class Asignatura {

	// Todos los atributos que pongamos en una clase deben ser privados.
	private String nombre;
	private int horas;
	private String profesor;

	public Asignatura(String nombre, int horas, String profesor) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.profesor = profesor;

		// getter & setter

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", horas=" + horas + ", profesor=" + profesor + "]";
	}

}
