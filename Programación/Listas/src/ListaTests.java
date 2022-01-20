import java.util.ArrayList;

public class ListaTests {

	public static void main(String[] args) {
		// LISTAS - Jueves 20-01-2022
		// Declarar una lista.
		ArrayList<String> listaCompra = new ArrayList<String>();
		listaCompra.add("Leche");
		listaCompra.add("Queso");
		listaCompra.add("Pan");
		listaCompra.add("Agua");
		
		// Mostrar el tamaño de la LISTA
		System.out.println(listaCompra.size());
		
		// Obtener lo que hay dentro de una posición exacta.
		System.out.println(listaCompra.get(1));
		
		// Modificar una posición de una lista.
		System.out.println(listaCompra.set(2, "Yogur"));
		
		// Mostrar la lista.
		System.out.println(listaCompra.toString());
		
		// Eliminar  una posición.
		System.out.println(listaCompra.remove(3));
		
		//Mostrar la lista.
		System.out.println(listaCompra.toString());
	}

}
