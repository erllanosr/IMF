package proyectoBingo;

public class TestCode2 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][9];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				System.out.print(" | " + matriz[i][j] + " | ");
			System.out.println("\n-----------------------------------------------------");

		}

	}
	public static int randomizarNumeros(int num) {
		
		return num;
	}

}
