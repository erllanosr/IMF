package listadeListas;

import java.util.ArrayList;

public class Producto {
	
	private String nombre;
	private ArrayList<Componente> listaComponentes= new ArrayList<Componente>();
	
	public Producto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Componente> getListaComponentes() {
		return listaComponentes;
	}

	public void setListaComponentes(ArrayList<Componente> listaComponentes) {
		this.listaComponentes = listaComponentes;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", listaComponentes=" + listaComponentes + "]";
	}
	
	
	public void agregarComponente(Componente item) {
		listaComponentes.add(item);
		
	}
	
	public void precioProducto() {
		int suma=0;
		
		for(Componente dato: listaComponentes) {
			suma+=dato.getPrecio();
		}
		
		System.out.println(nombre + " cuesta " + suma);
		
	}
	
	
	
	

}
