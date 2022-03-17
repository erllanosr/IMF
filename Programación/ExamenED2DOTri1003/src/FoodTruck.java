package listadeListas;

public class FoodTruck extends Tienda{
	
	private String ruta;

	public FoodTruck(String direccion, String ruta) {
		super(direccion);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "FoodTruck [ruta=" + ruta + "]";
	}
	
	

}
