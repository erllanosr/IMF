import java.util.ArrayList;

public class Franquicias {
	private String marca;
	private ArrayList<Tiendas> listaTiendas = new ArrayList<Tiendas>();

	public Franquicias(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public ArrayList<Tiendas> getListaTiendas() {
		return listaTiendas;
	}

	public void setListaTiendas(ArrayList<Tiendas> listaTiendas) {
		this.listaTiendas = listaTiendas;
	}

	@Override
	public String toString() {
		return "Franquicias [marca=" + marca + ", listaTiendas=" + listaTiendas + "]";
	}

	// Métodos
	public static void agregarTiendas() {

	}

}
