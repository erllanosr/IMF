import java.util.ArrayList;

public class Tiendas {
	private String direccion;
	private ArrayList<Productos> listaProductos = new ArrayList<Productos>();
	

	public Tiendas(String direccion) {
		super();
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Tiendas [direccion=" + direccion + ", listaProductos=" + listaProductos + "]";
	}

	public static void agregarProductos() {

	}

}
