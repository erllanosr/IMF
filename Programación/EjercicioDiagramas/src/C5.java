
public class C5 extends C4 {
	private int idc5;
	private C3 elemento;
	public C5(int idc5, C3 elemento) {
		super();
		this.idc5 = idc5;
		this.elemento = elemento;
	}
	public int getIdc5() {
		return idc5;
	}
	public void setIdc5(int idc5) {
		this.idc5 = idc5;
	}
	public C3 getElemento() {
		return elemento;
	}
	public void setElemento(C3 elemento) {
		this.elemento = elemento;
	}
	@Override
	public String toString() {
		return "C5 [idc5=" + idc5 + ", elemento=" + elemento + "]";
	}
	
	

}
