import java.util.Scanner;

public class calcularFactura {

	public static void main(String[] args) {
		// CALCULAR EL PRECIO TOTAL
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int aperitivo;
		int primero;
		int postre;
		int precioApe = 0;
		int precioPri = 0;
		int precioPos = 0;
		int precioSIVA = precioApe + precioPri + precioPos;
		float precioCIVA = (float) (precioApe + precioPri + precioPos + (precioApe + precioPri + precioPos * 0.05));

		// ZONA EJECUTIVA
		System.out.println("Introduce el Aperitivo que quieras, 1-3");
		aperitivo = sc.nextInt();
		System.out.println("Introduce el Primero que quieras, 1-3");
		primero = sc.nextInt();
		System.out.println("Introduce el Postre que quieras, 1-3");
		postre = sc.nextInt();

		//LISTA PLATOS
		switch (aperitivo) {
		case 1:
			precioApe = 11;
			break;
		case 2:
			precioApe = 4;
			break;
		case 3:
			precioApe = 10;
			break;
		}
		switch (primero) {
		case 1:
			precioPri = 8;
			break;
		case 2:
			precioPri = 7;
			break;
		case 3:
			precioPri = 45;
			break;
		}
		switch (postre) {
		case 1:
			precioPos = 8;
			break;
		case 2:
			precioPos = 7;
			break;
		case 3:
			precioPos = 45;
			break;
		}
		// PRECIOS SIN IVA Y CON IVA
		System.out.println("Precio sin IVA " + (precioSIVA) + "€.");
		System.out.println("IVA 5%");
		System.out.printf("Precio + IVA " + (precioCIVA) + "€.");
	}

}
