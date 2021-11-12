
public class testCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroAleatorio = 0;
		int min = 100;
		int max = 1000;

		System.out.println(Math.floor(Math.random() * (max - min + 1) + min));

		int numero = 200;
		do {
			for (int i = 100; i < 3; i++) {
				numeroAleatorio = (int) Math.floor(Math.random() * (numero - 100) + 100);
				System.out.println(numeroAleatorio);
			}
		} while (numeroAleatorio < 100 || numeroAleatorio > 1000);

	}

}
