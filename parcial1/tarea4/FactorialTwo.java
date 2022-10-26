//Programa: 2
//Calcular y validar un factorial

import java.util.Scanner;

public class FactorialTwo {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            //pide el numero
            System.out.println("Ingrese un numero:");
            int num = sc.nextInt();

            if ( (num > 20) || (num < 0) )  {
                System.out.println("Numero Invalido");
              } else {
                //mostramos resultados
                System.out.println("El factorial de: " + num + " es:" + factorial(num));
              }
        }
    }

    public static int factorial(int n) {
        int aux = 1;
        for (int i = 1; i <= n; i++) {
            aux *= i;
        }
        return aux;
    }
}