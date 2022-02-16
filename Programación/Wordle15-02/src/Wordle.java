
public class Wordle {
	public int turnos;

	public Wordle(int turnos) {
		super();
		this.turnos = turnos;
	}

	public int getTurnos() {
		return turnos;
	}

	public void setTurnos(int turnos) {
		this.turnos = turnos;
	}

	@Override
	public String toString() {
		return "Wordle [turnos=" + turnos + "]";
	}

}
