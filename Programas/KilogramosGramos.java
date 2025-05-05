package Programas;

import java.util.Scanner;

public class KilogramosGramos {
    
    public static void KilogramosGramos1() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println(" Introduce la cantidad en kilogramos: ");
        double kilogramos = scannerNumeros.nextDouble();
        System.out.println(kilogramos + " kilogramos son " + (kilogramos * 1000) + " gramos. ");

    }
}
