
public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Franquicias miFranquicia = new Franquicias("Pans & Company");
		Tiendas miTienda = new Tiendas("Pans Callao");
		Productos miProducto = new Productos("Bocata");
		Componentes miComponente = new Componentes(1, "Pan");
		
		

		Franquicias.agregarFranquicias();
		Tiendas.agregarTiendas();
		Productos.agregarProductos();
		Componentes.agregarComponentes();

	}

}
