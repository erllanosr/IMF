import java.util.Arrays;
import java.util.Scanner;

public class Gestion1301 {

	public static void main(String[] args) {
		// Gestionar un voluntario
		int numeroAlumnos;
		int posicion;
		byte opcionMenu;
		String nombre;
		String[] alumnos = null;

		Scanner lector = new Scanner(System.in);

		// mostrar un menu al usuario

		do {
			opcionMenu = seleccionarMenu();

			switch (opcionMenu) {
			case 1:// crear
				crear(alumnos);
				break;

			case 2: // insertar
			case 3: // modificar
				seleccionarMenu();
				break;
				
			case 4:// listar

				// listar alumnos

				System.out.println(Arrays.toString(alumnos));

				for (int i = 0; i < alumnos.length; i++) {
					System.out.println(alumnos[i]);
				}

				break;

			case 5: // voluntario

				// pendiente de random
				// necesito un número al azar entre 0 y la longitud del array

				break;
			default:
				break;
			}
		} while (opcionMenu != 6);

	}

	// MÉTODO PARA EL MENÚ
	private static byte seleccionarMenu() {

		Scanner lector = new Scanner(System.in);
		System.out.println("1 - CREAR");
		System.out.println("2 - INSERTAR");
		System.out.println("3 - MODIFICAR");
		System.out.println("4 - LISTAR");
		System.out.println("5 - VOLUNTARIO");
		System.out.println("6 - SALIR");

		System.out.print("Selecciona: ");
		return lector.nextByte();
	}

	// MÉTODO PARA OPCIÓN CREAR
	private static void crear(String[] numAlumnos) {
		// preguntar x alumnos
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime los alumnos");
		numeroAlumnos = lector.nextInt();
		// opcional: ¿y si solo pueden ser entre 1 y 50 alumnos?

		alumnos = new String[numeroAlumnos];
	

	}
	// MÉTODO PARA INSERTAR Y MODIFICAR

	private static void insertarModificar() {
		System.out.println("Dime la posición");
		posicion = lector.nextInt();
		lector.nextLine();// absorbe el intro después del número y deja el buffer limpio
		System.out.println("Dime el nombre");
		nombre = lector.nextLine();

		// opcional: ¿y si la posición no existe?

		alumnos[posicion] = nombre;
	}

}
