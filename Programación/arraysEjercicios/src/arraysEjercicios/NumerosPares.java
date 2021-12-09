package arraysEjercicios;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = {1, 2, 3, 4, 5, 6 , 7 ,8 ,9};
		
		for (int i : numeros) {
			if (i%2==0) {
				System.out.println(i + " es par.");
			} else if (i%2!=0){
				System.out.println(i + " es impar");
			}
		}
	}

}
