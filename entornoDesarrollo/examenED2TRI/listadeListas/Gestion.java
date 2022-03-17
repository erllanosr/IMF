package listadeListas;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Componente c1=new Componente(1, "pan");
		Componente c2=new Componente(2, "queso");
		Componente c3=new Componente(3, "jamón");
		
		Producto bocataQueso= new Producto("Bocadillo especial de queso");
		Producto bocataJamon= new Producto("Bocadillo especial de jamón");
		
		Tienda pansCallao=new Tienda("C/ Callao, 12");
		Tienda pansSol=new Tienda("Pta. Sol");
		
		Franquicia pans= new Franquicia("Pans&Company");
				
		bocataQueso.agregarComponente(c1);
		bocataQueso.agregarComponente(c2);
		
		bocataJamon.agregarComponente(c1);
		bocataJamon.agregarComponente(c3);
		
		pansCallao.agregarProducto(bocataJamon);
		pansCallao.agregarProducto(bocataQueso);
		
		pansSol.agregarProducto(bocataJamon);
		
		pans.agregarTienda(pansCallao);
		pans.agregarTienda(pansSol);
		
		System.out.println(bocataQueso.toString());
		System.out.println(bocataJamon.toString());
		
		bocataJamon.precioProducto();
		bocataQueso.precioProducto();
		
		System.out.println(pansCallao.toString());
		pansCallao.precioTienda();

		System.out.println(pansSol.toString());
		pansSol.precioTienda();
		
		System.out.println(pans.toString());
		pans.precioFranquicia();
		

	}

}
