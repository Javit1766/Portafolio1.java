package Programas;

import java.util.Scanner;

public class MayorMenor3Num {
    
    public static void MayorMenor3nume() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println("[n1]: ");
        double n1 = scannerNumeros.nextDouble();

        System.out.println("[n2]: ");
        double n2 = scannerNumeros.nextDouble();

        System.out.println("[n3]: ");
        double n3 = scannerNumeros.nextDouble();

        double mayor = n1;
        double menor = n2;

        if (n2>mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n2<menor) {
            menor = n2;
        }
        if (n3<menor) {
            menor = n3;
        }

        System.out.println("[Re]: El mayor es: " + mayor);
        System.out.println("[Re]: El menor es: " + menor);

     }
}
