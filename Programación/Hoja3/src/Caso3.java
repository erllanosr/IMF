import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// PEDIR AL USUARIO FECHA DE NACIMIENTO Y MOSTRARLA EN VARIOS FORMATOS.

		// ZONA DECLARATIVA
		Scanner sc = new Scanner(System.in);
		int dia;
		int mes;
		int anio = 0;
		String mesEnPalabra = null;
		String diaEnPalabra = null;

		// ZONA EJECUTIVA
		// Pedir día, mes y año de nacimiento.
		System.out.println("Ingresa el día de tu nacimiento, dd.");
		dia = sc.nextInt();
		System.out.println("Ingresa el mes de tu nacimiento, mm");
		mes = sc.nextInt();

		System.out.println("Ingresa el año de tu nacimiento, aaaa");
		anio = sc.nextInt();
		System.out.println("A continuación se mostrará la fecha en varios formatos:");
		System.out.println("_______________");
		// Primer formato: dd/mm/aaaa.
		System.out.println("PRIMER FORMATO");
		System.out.println("(" + dia + "/" + mes + "/" + anio + ")");
		System.out.println("_______________");

		// Segundo formato: dd de mm de aaaa.
		System.out.println("SEGUNDO FORMATO");
		switch (mes) {
		case 1:
			System.out.println("(" + dia + " de" + " enero de " + anio + ")");
			break;
		case 2:
			System.out.println("(" + dia + " de" + " febrero de " + anio + ")");
			break;
		case 3:
			System.out.println("(" + dia + " de" + " marzo de " + anio + ")");
			break;
		case 4:
			System.out.println("(" + dia + " de" + " abril de " + anio + ")");
			break;
		case 5:
			System.out.println("(" + dia + " de" + " mayo de " + anio + ")");
			break;
		case 6:
			System.out.println("(" + dia + " de" + " junio de " + anio + ")");
			break;
		case 7:
			System.out.println("(" + dia + " de" + " julio de " + anio + ")");
			break;
		case 8:
			System.out.println("(" + dia + " de" + " agosto de " + anio + ")");
			break;
		case 9:
			System.out.println("(" + dia + " de" + " setiembre de " + anio + ")");
			break;
		case 10:
			System.out.println("(" + dia + " de" + " octubre de " + anio + ")");
			break;
		case 11:
			System.out.println("(" + dia + " de" + " noviembre de " + anio + ")");
			break;
		default:
			System.out.println("(" + dia + " de" + " diciembre de " + anio + ")");
			break;
		}

		// Tercer formato: aaaa, mm--dd.
		System.out.println("_______________");
		System.out.println("TERCER FORMATO");
		switch (mes) {
		case 1:
			mesEnPalabra = "enero";
			break;
		case 2:
			mesEnPalabra = "febrero";
			break;
		case 3:
			mesEnPalabra = "marzo";
			break;
		case 4:
			mesEnPalabra = "abril";
			break;
		case 5:
			mesEnPalabra = "mayo";
			break;
		case 6:
			mesEnPalabra = "junio";
			break;
		case 7:
			mesEnPalabra = "julio";
			break;
		case 8:
			mesEnPalabra = "agosto";
			break;
		case 9:
			mesEnPalabra = "setiembre";
			break;
		case 10:
			mesEnPalabra = "octubre";
			break;
		case 11:
			mesEnPalabra = "noviembre";
			break;
		case 12:
			mesEnPalabra = "diciembre";
			break;
		}

		switch (dia) {
		case 1:
			diaEnPalabra = "uno";
			break;
		case 2:
			diaEnPalabra = "dos";
			break;
		case 3:
			diaEnPalabra = "tres";
			break;
		case 4:
			diaEnPalabra = "cuatro";
			break;
		case 5:
			diaEnPalabra = "cinco";
			break;
		case 6:
			diaEnPalabra = "seis";
			break;
		case 7:
			diaEnPalabra = "siete";
			break;
		case 8:
			diaEnPalabra = "ocho";
			break;
		case 9:
			diaEnPalabra = "nueve";
			break;
		case 10:
			diaEnPalabra = "diez";
			break;
		case 11:
			diaEnPalabra = "once";
			break;
		case 12:
			diaEnPalabra = "doce";
			break;
		case 13:
			diaEnPalabra = "trece";
			break;
		case 14:
			diaEnPalabra = "catorce";
			break;
		case 15:
			diaEnPalabra = "quince";
			break;
		case 16:
			diaEnPalabra = "dieciséis";
			break;
		case 17:
			diaEnPalabra = "diecisiete";
			break;
		case 18:
			diaEnPalabra = "dieciocho";
			break;
		case 19:
			diaEnPalabra = "dieciniueve";
			break;
		case 20:
			diaEnPalabra = "veinte";
			break;
		case 21:
			diaEnPalabra = "veintiuno";
			break;
		case 22:
			diaEnPalabra = "veitidós";
			break;
		case 23:
			diaEnPalabra = "veintitrés";
			break;
		case 24:
			diaEnPalabra = "veinticuatro";
			break;
		case 25:
			diaEnPalabra = "veinticinco";
			break;
		case 26:
			diaEnPalabra = "veintiséis";
			break;
		case 27:
			diaEnPalabra = "veintisiete";
			break;
		case 28:
			diaEnPalabra = "veintiocho";
			break;
		case 29:
			diaEnPalabra = "veintinueve";
			break;
		case 30:
			diaEnPalabra = "treinta";
			break;
		case 31:
			diaEnPalabra = "treinta y uno";
			break;
		}
		System.out.println(anio + ", " + mesEnPalabra + " -- " + diaEnPalabra);

	}
	// +200 líneas de código jaja

}