
public class Clase3 extends Clase1 {
	private int idc3;
	private private Clase2 elemento;

	public Clase3(int idc1, int idc3, Clase2 elemento2) {
		super(idc1);
		this.idc3 = idc3;
		this.elemento2 = elemento2;
	}

	public int getIdc3() {
		return idc3;
	}

	public void setIdc3(int idc3) {
		this.idc3 = idc3;
	}

	public Clase2 getElemento() {
		return elemento;
	}

	public void setElemento(Clase2 elemento) {
		this.elemento = elemento;
	}

	@Override
	public String toString() {
		return "Clase3 [idc3=" + idc3 + ", elemento=" + elemento + "]";
	}

}
