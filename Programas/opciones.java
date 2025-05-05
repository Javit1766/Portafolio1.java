package Programas;

public class opciones {
    
    static String lista [] = {
        "Suma de dos numeros",
        "Resta de dos numeros",
        "Multiplicaciòn de dos numeros",
        "Divisiòn de dos numeros",
        "Modulo (Residuo de dos divisiones)",
        "Promedio de tres numeros",
        "NUmero mayor y menor entre dos numeros",
        "Numero mayor y menor entre tres numeros",
        "Conversion de metros a centimetros",
        "Conversion de kilogramos a gramos",
    };

    //MOSTRAR OPCIONES
    public static void opciones() {

        for (int i = 0; i < lista.length; i++) {
            System.out.println("["+ (i+1) +"] "+ lista[i]);
        }
    }
}
