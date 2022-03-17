import java.util.ArrayList;
import java.util.List;

public class GestorPeliculas {
   
   private final List<Pelicula> peliculas = new ArrayList<>();
   
   public void mostrarPeliculas(){
      int contador = 1;
      Utilidades.mensajeConsola("Peliculas:");
      for(Pelicula pelicula : peliculas){
         Utilidades.mensajeConsola(contador+": " + pelicula.toString());
      }
   }
   
   public void agregarPelicula(){
      Utilidades.mensajeConsola("Ingresa el nombre de la pelicula");
      String nombre = Utilidades.opcionString();
      Utilidades.mensajeConsola("Ingresa el director");
      String director = Utilidades.opcionString();
      Utilidades.mensajeConsola("Ingresa el año");
      int anio = Utilidades.opcionInt();
      Utilidades.mensajeConsola("Ingresa la duracion");
      int duracion = Utilidades.opcionInt();
      Utilidades.mensajeConsola("Ingresa el la valoracion");
      int valoracion = Utilidades.opcionInt();
      Utilidades.mensajeConsola("Ingresa el genero");
      String genero = Utilidades.opcionString();
      peliculas.add(new Pelicula(nombre, director, anio, duracion, valoracion, new Genero(genero)));
   }
   
   public void modificarPelicula(){
      mostrarPeliculas();
      Utilidades.mensajeConsola("Ingresa el numero de la pelicula que quieres modificar");
      int numero = Utilidades.opcionInt() - 1;
      Pelicula pelicula = peliculas.get(numero);
      Utilidades.mensajeConsola("Ingresa el director");
      pelicula.setDirector(Utilidades.opcionString());
      Utilidades.mensajeConsola("Ingresa el año");
      pelicula.setAnio(Utilidades.opcionInt());
      Utilidades.mensajeConsola("Ingresa la duracion");
      pelicula.setDuracion(Utilidades.opcionInt());
      Utilidades.mensajeConsola("Ingresa el la valoracion");
      pelicula.setValoracion(Utilidades.opcionInt());
      Utilidades.mensajeConsola("Ingresa el genero");
      pelicula.setGenero(new Genero(Utilidades.opcionString()));
      
   }
   
   public void borrarPelicula(){
      Utilidades.mensajeConsola("Ingresa el numero de la pelicula que quieres borrar");
      int numero = Utilidades.opcionInt() - 1;
      peliculas.remove(numero);
   }
   
   public List<Pelicula> getPeliculas() {
      return peliculas;
   }
   
   
   
}
