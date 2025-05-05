package Programas;

import java.util.Scanner;

public class MetrosCentimetros {
    
    public static void MetrosCentimetros1() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println(" Introduce la cantidad en metros: ");
        double metros = scannerNumeros.nextDouble();
        System.out.println(metros + " metros son " + (metros * 100) + " centimetros. ");

    }
}

