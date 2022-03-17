import java.util.ArrayList;

public class GenerosPelis {
	private String nombre;
	private ArrayList<Peliculas> peliculas = new ArrayList<Peliculas>();

	public GenerosPelis(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Peliculas> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Peliculas> peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public String toString() {
		return "GenerosPelis [nombre=" + nombre + ", peliculas=" + peliculas + "]";
	}

	// MÉTODO PARA LISTA DE PELÍCULAS.
	public void verListaPeliculas() {
		for (int i = 0; i < peliculas.size(); i++) {
			Consola.mostrarMensaje((i + 1) + "." + peliculas.get(i).toString());
		}
	}

	// Método para AGREGAR PELÍCULAS
	public void agregarPeliculas() {
		String nombre;
		String director;
		int anio;
		int duracion;
		int valoracion;

		Consola.mostrarMensaje("Introduce el nombre de la película.");
		nombre = Lector.opcionString();
		Consola.mostrarMensaje("Introduce el nombre del director.");
		director = Lector.opcionString();
		Consola.mostrarMensaje("Introduce el año de la película.");
		anio = Lector.opcionInt();
		Consola.mostrarMensaje("Introduce la duración de la película.");
		duracion = Lector.opcionInt();
		Consola.mostrarMensaje("Introduce la valoración que le das a la película.");
		valoracion = Lector.opcionInt();

		peliculas.add(new Peliculas(nombre, director, anio, duracion, valoracion));

	}

	// Cuando se usa lector va sin static(?)
	// MÉTODO PARA BORRAR PELÍCULAS
	public void borrarPeliculas() {
		int numero;
		Consola.mostrarMensaje("Introduce la posición de la película que quieras eliminar.");
		numero = Lector.opcionInt();

		peliculas.remove(numero);

	}

	// MÉTODO PARA MODIFICAR UNA PELÍCULA
	public void modificarPelicula() {
		int posicion;
		verListaPeliculas();
		Consola.mostrarMensaje("Elige la posición que quieres cambiar:");
		posicion = Lector.opcionInt();

		Consola.mostrarMensaje("Introduce el nombre de la PELÍCULA.");
		peliculas.get(posicion - 1).setNombre(Lector.opcionString());
		Consola.mostrarMensaje("Introduce el nombre del DIRECTOR.");
		peliculas.get(posicion - 1).setDirector(Lector.opcionString());
		Consola.mostrarMensaje("Introduce el año de la película.");
		peliculas.get(posicion - 1).setAnio(Lector.opcionInt());
		Consola.mostrarMensaje("Introduce la duración de la película.");
		peliculas.get(posicion - 1).setDuracion(Lector.opcionInt());
		Consola.mostrarMensaje("Introduce la valoración de la película.");
		peliculas.get(posicion - 1).setValoracion(Lector.opcionInt());
	}

}
