
public class Cliente extends Persona {
	private int telefonoContacto;

	public Cliente(String nombre, int edad, int telefonoContacto) {
		super(nombre, edad);
		this.telefonoContacto = telefonoContacto;
	}

	public int getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(int telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	@Override
	public String toString() {
		return "Cliente [telefonoContacto=" + telefonoContacto + "]";
	}

	// Método Mostrar
	public static void mostrar() {

	}

}
