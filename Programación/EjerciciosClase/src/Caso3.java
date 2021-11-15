import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// Realiza una aplicación que nos pida un número de ventas a introducir, después
		// nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
		// Al final mostrará la suma de todas las ventas. Piensa que es lo que se repite
		// y lo que no.

		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int numVentasTotal;
		int precioVenta = 0;
		int numPrecioVentas = 0;

		// ZONA EJECUTIVA
		System.out.println("Introduce el total de Ventas:");
		numVentasTotal = sc.nextInt();

		// CONSIDERAR HACERLO CON DO WHILE¿?
		for (int i = 1; i <= numVentasTotal; i++) {
			System.out.println("Introduce el precio de la venta:");
			precioVenta = sc.nextInt();
		}
		System.out.println(precioVenta=precioVenta+=precioVenta);
		// ALMACENAR EL PRECIO DE LA VENTA EN UNA VARIABLE O DOS PARA LUEGO HACER LA
		// SUMA CORRESPONDIENTE.
	}

}
