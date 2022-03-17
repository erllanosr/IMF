public class Pelicula {
   
   private final String nombre;
   private String director;
   private int anio;
   private int duracion;
   private int valoracion;
   private Genero genero;
   
   public Pelicula(String nombre, String director, int anio, int duracion, int valoracion, Genero genero) {
      super();
      this.nombre = nombre;
      this.director = director;
      this.anio = anio;
      this.duracion = duracion;
      this.valoracion = valoracion;
      this.genero = genero;
   }
   
   public String getNombre() {
      return nombre;
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
   
   public Genero getGenero() {
      return genero;
   }
   
   public void setGenero(Genero genero) {
      this.genero = genero;
   }
   
   @Override
   public String toString() {
      return "Nombre: " + nombre + "\n "+
             "  Director: " + director + "\n "+
             "  Anio: " + anio + " " + "\n "+
             "  Duracion: " + duracion + "\n "+
             "  Valoracion: " + valoracion + "\n "+
             "  Genero: " + genero.getTipo();
   }
   
}
   

