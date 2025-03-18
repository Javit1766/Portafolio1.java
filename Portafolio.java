import java.util.Scanner;

public class Portafolio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n \n");
            System.out.println(" Bienvenido a mi Tan java [Tan versión 1.0]");

            System.out.println(" _____            ");
            System.out.println("|_   _|_ _ _ __  ");
            System.out.println("  | |/ _` | '_ \\ ");
            System.out.println("  | | (_| | | | |");
            System.out.println("  |_|\\__,_|_| |_|");
            System.out.println("");

            System.out.println("[?] Selecciona una opcion para continuar");
            System.out.println("Proyecto iniciado -->> Mar 10 8:47 am 2025");
            System.out.println("");

            //Menú
            System.out.println("[1] La suma de dos números");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[0] Salir");
            System.out.print("[?]");
            opcion = scanner.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                   
                    break;
            
                default:
                    break;
            }
        }while (opcion != 0);
    }
}
