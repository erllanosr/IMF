
public class caso16 {

	public static void main(String[] args) {
		// MOSTRAR SECUENCIAS DE NÚMEROS
		int i = 0;
		int num = 1;

		for (i = 1; i <= 20; i++) {
			System.out.println(i);
		}

		while (num < 20) {
			System.out.println(num);
			num += 2;
		}

		for (i = 5; i <= 50; i += 5) {
			System.out.println(i);
		}

		for (i = 100; i >= 0; i -= 10) {
			System.out.println(i);
		}

		for (i = 2; i == 26;) {
			System.out.println(i);
		}
		while (i < 26) {
			i += 2;
			if (i % 8 != 0) {
				System.out.print(i + " ");
			}

		}

	}

}
