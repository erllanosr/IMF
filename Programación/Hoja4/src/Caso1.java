import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// Valida que se trata de una dirección de email. Detalles en clase.
		// Zona Declarativa
		Scanner sc = new Scanner(System.in);
		String correo;
		
		
		
		// Zona Ejecutiva
		System.out.println("Escribe tu correo para validarlo:");
		correo = sc.next();
		
		if (correo.equals("@")) {
			System.out.println("laksjda");
		} else {
			System.out.println("Tlkjsaldjsa");
		}
		
		

	}

}
