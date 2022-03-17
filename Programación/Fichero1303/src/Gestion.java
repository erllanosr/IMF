
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fichero f1 = new Fichero("datos/datos.txt");
		Fichero f2 = new Fichero("datos/resultados.txt");

		f1.escribirFichero("pepe");
		f2.escribirFichero("lola");

		f2.leerFichero();

	}

}
