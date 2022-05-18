import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso = 0;
		float altura = 0;
		float pesoIdeal = (altura * 100 - 105);
		double imc = ((peso) / (Math.pow(altura, 2.0)));

		System.out.println("*** PROGRAMA PARA SABER IMC ***");

		System.out.print("Ingresa tu peso: "); // Con Comas
		peso = sc.nextFloat();
		System.out.print("Ingresa tu altura en metros: "); // Con Comas
		altura = sc.nextFloat();
		System.out.println(pesoIdeal);
		System.out.println("Tu IMC es: " + peso / Math.pow(altura, 2.0));
		System.out.println("Peso ideal  " + (altura * 100 - 105));
		System.out.println(imc);
	}

}
