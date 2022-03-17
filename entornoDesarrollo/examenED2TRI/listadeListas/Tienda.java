package listadeListas;

import java.util.ArrayList;

public class Tienda {
	
	private String direccion;
	private ArrayList<Producto> listaProductos=new ArrayList<Producto>();
	
	public Tienda(String direccion) {
		super();
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Tienda [direccion=" + direccion + ", listaProductos=" + listaProductos + "]";
	}
	
	public void agregarProducto(Producto miProducto) {
		listaProductos.add(miProducto);
	}
	
	
	public void precioTienda() {
		
		int suma=0;
		
		for(Producto miProducto: listaProductos) {
			for(Componente miComponente: miProducto.getListaComponentes()) {
				suma+=miComponente.getPrecio();
			}
						
		}
		
		System.out.println(direccion + " suma " + suma);
		
		
		
	}

}
