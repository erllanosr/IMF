package proyectoBingo;

public class TestCode {

	public static void main(String[] args) {
		int[][] tabla = new int[3][9];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (j == 1)
					tabla[i][j] = (int) (Math.random() * 15 + 10 + 1);
				else if (j == 2)
					tabla[i][j] = (int) (Math.random() * 15 + 20 + 1);
				else if (j == 3)
					tabla[i][j] = (int) (Math.random() * 15 + 30 + 1);
				else if (j == 4)
					tabla[i][j] = (int) (Math.random() * 15 + 40 + 1);
				else if (j == 5)
					tabla[i][j] = (int) (Math.random() * 15 + 50 + 1);
				else if (j == 6)
					tabla[i][j] = (int) (Math.random() * 15 + 60 + 1);
				else if (j == 7)
					tabla[i][j] = (int) (Math.random() * 15 + 70 + 1);
				else if (j == 8)
					tabla[i][j] = (int) (Math.random() * 15 + 80 + 1);
				else if (j == 9)
					tabla[i][j] = (int) (Math.random() * 15 + 90 + 1);
				// else if (j==10) tabla [i] [j]= (int) (Math.random() *15+90+1);
				System.out.print(tabla[i][j]);
			}
		}
	}

}
