import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        Vistas.Vista.banner();

        do {
            Programas.opciones.opciones();
            System.out.println("[0] Salir");
            System.out.print("[?]");
            opcion = scanner.nextInt();

            //OPCIONES
            switch (opcion) {
                case 1:
                    System.out.println("--------------------------------");
                    Programas.Sumar.Suma();
                    System.out.println("--------------------------------");

                case 2:
                    System.out.println("--------------------------------");
                    Programas.Restas.Resta();
                    System.out.println("--------------------------------");
                
                case 3:
                    System.out.println("--------------------------------");
                    Programas.Multiplicaciones.Multiplicaciòn();
                    System.out.println("--------------------------------");
                
                case 4:
                    System.out.println("--------------------------------");
                    Programas.Divisiones.Divisiòn();
                    System.out.println("--------------------------------");
                
                case 5:
                    System.out.println("--------------------------------");
                    Programas.Modulos.Modulo();
                    System.out.println("--------------------------------");

                case 6:
                    System.out.println("--------------------------------");
                    Programas.Promedios.Promedio();
                    System.out.println("--------------------------------");
                
                case 7: 
                System.out.println("--------------------------------");
                Programas.MayorMenor2Num.MayorMenor2nume();
                System.out.println("--------------------------------");

                case 8:
                System.out.println("--------------------------------");
                Programas.MayorMenor3Num.MayorMenor3nume();
                System.out.println("--------------------------------");

                case 9:
                System.out.println("--------------------------------");
                Programas.MetrosCentimetros.MetrosCentimetros1();
                System.out.println("--------------------------------");

                case 10:
                System.out.println("--------------------------------");
                Programas.KilogramosGramos.KilogramosGramos1();
                System.out.println("--------------------------------");
                    break;
            
                default:
                    break;
            }
        }while (opcion != 0);
    }
}
