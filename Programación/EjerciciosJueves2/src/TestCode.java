import java.util.Arrays;
import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
		// CALCULAR SALARIO SEMANAL POR HORAS TRABAJAS Y DÍAS.
		// 11€ POR HORA, 8 HORAS AL DÍA.

		int num1 = 50;
		int num2 = 120;
		int numAleatorio;

		System.out.println("Números generados entre 0 y 20, con decimales (sin incluir el 0 y el 20)");
		for (int i = 0; i < 3; i++) {
			numAleatorio = (int) (Math.random() * 100);
			System.out.println(numAleatorio);
		}
	}
}
