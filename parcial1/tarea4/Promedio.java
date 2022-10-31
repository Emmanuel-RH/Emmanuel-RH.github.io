//Programa 4
//Permitir la captura de numeros y realizar su promedio

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        
        int cantidad, terminar = 0, num, promedio = 0;
        float total = 0;
        try (Scanner captura = new Scanner(System.in)) {
            System.out.print("Digita la cantidad de numeros a promediar: ");
            cantidad = captura.nextInt();
            System.out.println("");
            while (terminar  < cantidad) {
                System.out.print("Digita un numero entero: ");
                num = captura.nextInt();
                if (num >= 1) {
                    total += num;
                    promedio++;
                }
                terminar++;
            }
        }
        System.out.println("\nEl promedio total es: " + (total/promedio));
    }
}