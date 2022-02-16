
public class Bombo {

	private int num[];

	public Bombo() {
		super();
		this.num = new int[99];
		for (int i = 0; i < num.length; i++) {
			this.num[i] = i + 1;
		}
	}

	@Override
	public String toString() {
		return "Bombo [num=" + num + "]";
	}

	// Metodo para sacar las bolas de manera aleatoria
	public int sacaBola() {
		return (((int) (1 + Math.random() * 99)));
	}

	public boolean tieneBolas() {
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				return true;

			}
		}
		return false;
	}
}