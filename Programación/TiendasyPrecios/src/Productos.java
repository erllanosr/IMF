import java.util.ArrayList;

public class Productos {
	private String tipo;
	private ArrayList<Componentes> listaComponentes = new ArrayList<Componentes>();

	public Productos(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Componentes> getListaComponentes() {
		return listaComponentes;
	}

	public void setListaComponentes(ArrayList<Componentes> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}

	@Override
	public String toString() {
		return "Productos [tipo=" + tipo + ", listaComponentes=" + listaComponentes + "]";
	}

	public static void agregarComponentes() {

	}

}
