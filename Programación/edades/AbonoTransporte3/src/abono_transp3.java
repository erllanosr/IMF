
import java.util.Scanner;

public class abono_transp3 {

	public static void main(String[] args) {
// Calculo el precio del abono
		char zona;
		int edad;
		int precio;
		char famNumerosa;
		char discapacidad;
		char funcionario;
		int descuento = 0;
		Scanner sc = new Scanner(System.in);

		// pedir datos zona y edad
		System.out.println("Introduce la zona");
		zona = sc.next().charAt(0);
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
//decidir el precio según zona y edad
		if (edad < 10) {
			precio = 0;
		} else {
			if (edad >= 10 && edad < 25) {
				if (zona == 'A') {
					precio = 10;
				} else {
					if (zona == 'B') {
						precio = 20;
					} else {// zona C
						precio = 30;
					}
				}
			} else {
				if (edad >= 25 && edad < 65) {
					if (zona == 'A') {
						precio = 40;
					} else {
						if (zona == 'B') {
							precio = 60;
						} else {// zona C
							precio = 80;
						}
					}
				} else {// >=65
					if (zona == 'A' || zona == 'B') {
						precio = 10;
					} else {// zona C
						precio = 15;
					}
				}
			}
//pedir situación especial en el caso de >=10
			System.out.println("Familia numerosa? Introcude S para Sí o introduce N para No");
			famNumerosa = sc.next().charAt(0);
			if (famNumerosa == 'S') {
				descuento = 20;
			}
			System.out.println("Alguna discapacidad? Introcude S para Sí o introduce N para No");
			discapacidad = sc.next().charAt(0);
			if (discapacidad == 'S') {
				descuento = descuento + 50;
			}
			System.out.println("Funcionario? Introcude S para Sí o introduce N para No");
			funcionario = sc.next().charAt(0);
			if (funcionario == 'S') {
				descuento = descuento + 30;
			}
		}
//calcular el precio final
		if (precio == 0) {
			System.out.println("Precio es 0");
		} else {
			System.out.println("Precio es " + (precio - (precio * descuento / 100)));
		}

	}

}
