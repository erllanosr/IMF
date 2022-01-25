
public class GestionEscuela {

	public static void main(String[] args) {
		// Crear
		Asignatura programacion = new Asignatura("programacion", 300, "Carlos");
		Asignatura sistemasInf = new Asignatura("SI", 200, "Javier");
		Asignatura baseDatos = new Asignatura("BD", 150, "Lázaro");

		System.out.println(programacion.getProfesor());
		System.out.println(sistemasInf.getProfesor());
		System.out.println(baseDatos.getProfesor());

		System.out.println(sistemasInf.toString());
	}

}
