
public class Caso2 {

	public static void main(String[] args) {
		// 2, 4, 8, 16, 32, 64
		int num = 0;
		int num2;
		int contador = 0;

		// for
		for (int i = 2; i < 65; i++) {

		}
		for (int i = 2; i < 65; i++) {
			// i = 2;
			// int reemplaza al 2.
			if (i == 2) {
				contador++;
				num = i ^ 2;
			}
			System.out.println(i);
		}
		// do
		do {
			num=2;
			num2=num^2;
			System.out.println(num);
			
		}while(num<65);
		/*
		 * do { num = 2 * 2; num = num * 2; System.out.println(num); } while (num < 65);
		 */

		// while
		while (true) {

		}
	}

}
