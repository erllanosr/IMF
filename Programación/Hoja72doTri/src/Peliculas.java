
public class Peliculas {
	private String nombre;
	private String director;
	private int anio;
	private int duracion;
	private int valoracion;
	private GenerosPelis generos;

	public Peliculas(String nombre, String director, int anio, int duracion, int valoracion) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.anio = anio;
		this.duracion = duracion;
		this.valoracion = valoracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", director=" + director + ", anio=" + anio + ", duracion=" + duracion
				+ ", valoracion=" + valoracion + "]";
	}

}
