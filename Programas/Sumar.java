package Programas;

import java.util.Scanner;

public class Sumar {
    
    public static void Suma() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println("[n1]: ");
        double n1 = scannerNumeros.nextDouble();

        System.out.println("[n2]: ");
        double n2 = scannerNumeros.nextDouble();
        
        System.out.println("[Re]: "+ (n1+n2));
    }
}  