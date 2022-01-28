package proyectoBingo;

import java.util.ArrayList;
import java.util.Collections;

public class Bombo {

	// Números del 1-99
	// Creando un atributo para los numeros.
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	// Atributo numero inicial y final de los números.
	private int inicio;
	private int fin;

	// constructor
	public Bombo(int inicio, int fin) {
		super();
		this.inicio = inicio;
		this.fin = fin;

		for (int i = inicio; i <= fin; i++) {
			numeros.add(i);

		}
	}

	// getters & setters
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	// toString
	@Override
	public String toString() {
		return "Bombo [numeros=" + numeros + ", inicio=" + inicio + ", fin=" + fin + "]";
	}

	// Desordenar los números
	public void desordenarBombo() {
		Collections.shuffle(numeros);
	}

	// Extraer número
	public int sacarNumero() {
		int numero = -1;

		if (numeros.size() > 0) {
			// Cogemos y almacenmos en numero el primer elemento del array list.
			numero = numeros.get(0);
			// Eliminamos el número para que el siguiente que pida, no sea el mismo, si no,
			// el siguiente.
			numeros.remove(0);
		}

		return numero;
	}

}
