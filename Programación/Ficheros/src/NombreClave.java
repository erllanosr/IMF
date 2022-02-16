import java.util.Arrays;

public class NombreClave {

	public static void main(String[] args) {
		String cadena = "carlos;123456;madrid;12345678";
		String[] datos = new String[4];
		datos = cadena.split(";");
		System.out.println(Arrays.toString(datos));
		

	}

}
