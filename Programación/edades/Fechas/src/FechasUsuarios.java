import java.util.Scanner;

public class FechasUsuarios {

	public static void main(String[] args) {
		//	Pedir al usuario que ingrese un día, un mes y un año.
		//	Zona declarativa
		Scanner sc = new Scanner(System.in);
		int dia;
		int mes;
		int ano;
		
		//	Zona ejecutiva
		System.out.println("Escribe un día entre 1-31");
		dia=sc.nextInt();
		mes=sc.nextInt();
		ano=sc.nextInt();
	}

}
