import java.util.Scanner;

public class FechasUsuarios {

	public static void main(String[] args) {
		// Pedir al usuario que ingrese un día, un mes y un año.
		// Zona declarativa
		Scanner sc = new Scanner(System.in);
		int dia;
		int mes;
		int ano;

		// Zona ejecutiva
		System.out.println("Escribe un día entre 1-31");
		dia=sc.nextInt();
		mes=sc.nextInt();
		ano=sc.nextInt();
		if (dia >= 1 && dia <= 31) {
			System.out.println("Correcto, ahora escribe un mes, 1-12");
		}else {
			if(mes>=1&&mes<=12) {
			System.out.println("Correcto, ahora escribe un año, entre 1950 y 2021");
			}else {
				if(ano>=1850&&ano<=2021) {
				System.out.println("La fecha que has introducido es incorrecta.");
				}else {
				}
			}
		}
	}
}