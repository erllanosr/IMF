import java.util.Scanner;

public class abonotransporte {

	public static void main(String[] args) {
		// ABONO TRANSPORTE POR ZONA Y DESCUENTO

		// Zona Declarativa
		int edad;
		char zona;
		String dto;
		String fnum;
		String disc;
		String func;
		Scanner sc = new Scanner(System.in);

		// ABONO TRANSPORTE EDAD Y ZONAS
		// PREGUNTAR EDAD Y PRECIO
		System.out.println("Escribe tu edad y zona para calcular el precio final del abono.");
		System.out.println("Escribe tu edad:");
		edad = sc.nextInt();
		System.out.println("Escribe tu zona (A, B o C):");
		zona = sc.next().charAt(0);
		System.out.println("¿Eres familia numerosa? Escribe sí o no.");
		fnum = sc.next();
		System.out.println("¿Tienes algún tipo de discapacidad? Escribe sí o no.");
		disc = sc.next();
		System.out.println("¿Eres funcionario/a? Escribe sí o no.");
		func = sc.next();

		// CÁLCULO PRECIOS
		// Precio menores de 10 años
		if (edad < 10 && zona == 'A' || zona == 'B' || zona == 'C') {
			System.out.println("El precio es 0€.");
		}else {
			if(edad > 10 && edad <25) {
				
			}else {
				
			}
		}
	}
}
