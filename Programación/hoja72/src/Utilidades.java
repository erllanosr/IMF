import java.util.Scanner;


public class Utilidades {
   
   private static Scanner scanner = new Scanner(System.in);
   
   public static int opcionMenu() {
      System.out.println("Opcion: ");
      return scanner.nextInt();
      
   }
   
   public static String opcionString() {
      return scanner.nextLine();
      
   }
   
   public static Integer opcionInt() {
      return scanner.nextInt();
   }
   
   public static String limpiarBuffer() {
      return scanner.nextLine();
   }
   
   public static void mensajeConsola(String mensaje){
      System.out.println(mensaje);
   }
}
