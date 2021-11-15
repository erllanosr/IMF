import java.util.Scanner;

public class testCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diaCumpleanyos = 5;
		int mesCumpleAnyos = 12;
		int anyoNacimiento = 1990;

		int diaActual = 14;
		int mesActual = 11;
		int anyoActual = 2021;

		int anyos = anyoActual - anyoNacimiento;
		if ((mesActual - mesCumpleAnyos) < 0) {
			anyos = anyos - 1;
		}
		System.out.print(anyos);

	}
}
