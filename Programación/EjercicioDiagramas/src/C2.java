import java.util.ArrayList;

public class C2 {
	private int idc2;
	private ArrayList<C4> listaC4;
	private ArrayList<C3> listaC3;

	public C2(int idc2, ArrayList<C4> listaC4, ArrayList<C3> listaC3) {
		super();
		this.idc2 = idc2;
		this.listaC4 = listaC4;
		this.listaC3 = listaC3;
	}

	public int getIdc2() {
		return idc2;
	}

	public void setIdc2(int idc2) {
		this.idc2 = idc2;
	}

	public ArrayList<C4> getListaC4() {
		return listaC4;
	}

	public void setListaC4(ArrayList<C4> listaC4) {
		this.listaC4 = listaC4;
	}

	public ArrayList<C3> getListaC3() {
		return listaC3;
	}

	public void setListaC3(ArrayList<C3> listaC3) {
		this.listaC3 = listaC3;
	}

	@Override
	public String toString() {
		return "C2 [idc2=" + idc2 + ", listaC4=" + listaC4 + ", listaC3=" + listaC3 + "]";
	}

}
