package listadeListas;

import java.util.ArrayList;

public class Franquicia {
	
	private String marca;
	private ArrayList<Tienda> listaTiendas=new ArrayList<Tienda>();
	
	public Franquicia(String marca) {
		super();
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public ArrayList<Tienda> getListaTiendas() {
		return listaTiendas;
	}
	public void setListaTiendas(ArrayList<Tienda> listaTiendas) {
		this.listaTiendas = listaTiendas;
	}
	@Override
	public String toString() {
		return "Franquicia [marca=" + marca + ", listaTiendas=" + listaTiendas + "]";
	}
	
	public void agregarTienda(Tienda miTienda) {
		listaTiendas.add(miTienda);
	}
	
	public void precioFranquicia() {
		
		int suma=0;
		
		//listaTiendas.get(0).getListaProductos().get(0).getListaComponentes().get(0).getPrecio()
		
		for(Tienda miTienda: listaTiendas) {
			for(Producto miProducto: miTienda.getListaProductos()) {
				for(Componente miComponente: miProducto.getListaComponentes()) {
					suma+=miComponente.getPrecio();
				}
			}			
		}
		

		System.out.println(marca + " vale " + suma);
		
		
	}
	

}
