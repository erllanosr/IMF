
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coches coche1 = new Coches("Audi", "123-QWE");
		Coches coche2 = new Coches("BMW", "456-RTY");
		
		Validar.validarCoche(coche1);
		Validar.validarCoche(coche2);
	}

}
