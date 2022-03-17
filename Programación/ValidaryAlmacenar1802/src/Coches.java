
public class Coches {
	private String marca;
	private String matrícula;

	public Coches(String marca, String matrícula) {
		super();
		this.marca = marca;
		this.matrícula = matrícula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatrícula() {
		return matrícula;
	}

	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}

	@Override
	public String toString() {
		return "Coches [marca=" + marca + ", matrícula=" + matrícula + "]";
	}

}
