import java.util.ArrayList;

public class Componentes {
	private int precio;
	private String id;
	private ArrayList<String> componentes = new ArrayList<String>();

	public Componentes(int precio, String id) {
		super();
		this.precio = precio;
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Componentes [precio=" + precio + ", id=" + id + "]";
	}


}
