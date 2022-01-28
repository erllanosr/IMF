
public class productosFrescos {

	private int precio;
	private int peso;
	private String tipo;
	private int stock;
	public productosFrescos(int precio, int peso, String tipo, int stock) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.tipo = tipo;
		this.stock = stock;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "productosFrescos [precio=" + precio + ", peso=" + peso + ", tipo=" + tipo + ", stock=" + stock + "]";
	}
	
	
	
}
