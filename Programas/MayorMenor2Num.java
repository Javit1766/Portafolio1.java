package Programas;

import java.util.Scanner;

public class MayorMenor2Num {
    
     public static void MayorMenor2nume() {
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.println("[n1]: ");
        double n1 = scannerNumeros.nextDouble();

        System.out.println("[n2]: ");
        double n2 = scannerNumeros.nextDouble();

        double mayor, menor;

        if (n1 > n2) {
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }

        System.out.println("[Re]: El mayor es: "+ mayor);
        System.out.println("[Re]: El menor es: "+ menor);

     }
}
