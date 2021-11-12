import java.util.Scanner;

public class PrecioIvaExamen {

	public static void main(String[] args) {
		// Lee un número por teclado que pida el precio de un producto (puede tener
		// decimales) y calcule el precio final con IVA. El IVA será una constante que
		// será del 21%.
		
		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		float precioProd;
		int iva = 21;
		
		// ZONA EJECUTIVA
		System.out.println("Introduce el precio para calcular el IVA.");
		precioProd = sc.nextFloat();
		
		System.out.println("Precio final:");
		System.out.println(precioProd + (precioProd*iva)/(100) + "€.");
		
		
	}

}
