
public class panaderia extends productosFrescos {

	private String tipoHarina;

	public panaderia(int precio, int peso, String tipo, int stock, String tipoHarina) {
		super(precio, peso, tipo, stock);
		this.tipoHarina = tipoHarina;
	}

	public String getTipoHarina() {
		return tipoHarina;
	}

	public void setTipoHarina(String tipoHarina) {
		this.tipoHarina = tipoHarina;
	}

	@Override
	public String toString() {
		return "panaderia [tipoHarina=" + tipoHarina + "]";
	}
	
	

	
}
