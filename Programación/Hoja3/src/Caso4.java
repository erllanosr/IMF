import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d, m, a;
		String Mes[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		System.out.println("Ingresa dia");
		d = sc.nextInt();
		System.out.println("Ingresa mes");
		m = sc.nextInt();
		System.out.println("Ingresa año");
		a = sc.nextInt();
		System.out.println(d + " de " + Mes[m - 1] + " de " + a);

	}

}
