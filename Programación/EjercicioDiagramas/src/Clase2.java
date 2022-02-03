import java.util.ArrayList;

public class Clase2 extends Clase1 {
	private int idc2;
	private ArrayList<Clase3> lista;

	public Clase2(int idc1, int idc2, ArrayList<Clase3> lista) {
		super(idc1);
		this.idc2 = idc2;
		this.lista = lista;
	}

	public int getIdc2() {
		return idc2;
	}

	public void setIdc2(int idc2) {
		this.idc2 = idc2;
	}

	public ArrayList<Clase3> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Clase3> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Clase2 [idc2=" + idc2 + ", lista=" + lista + "]";
	}

}
