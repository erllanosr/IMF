
public class Empleado extends Persona {
	private int sueldoBruto;

	public Empleado(String nombre, int edad, int sueldoBruto) {
		super(nombre, edad);
		this.sueldoBruto = sueldoBruto;
	}

	public int getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(int sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	@Override
	public String toString() {
		return "Empleado [sueldoBruto=" + sueldoBruto + "]";
	}

	// Método Mostrar
	public static void mostrar() {

	}

	// Método Calcular Salario Neto
	public static int calcularSalarioNeto(int salario) {

		return salario;
	}

}
