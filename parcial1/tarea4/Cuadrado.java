//Programa 6
//Capturar n, validar que sea un entero en el rango de 0 a 9 y usando ciclos producir un cuadrado de n dimension

import java.util.Scanner;
 
public class Cuadrado {
   
    Scanner teclado = new Scanner(System.in);
   
    int n;
   
    public void dato() {
        System.out.print("Ingresa lado del cuadrado: ");
        n = teclado.nextInt();
    }
   
    public void proceso() {
        if(n >= 2 && n <= 50) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
        }else {
            System.out.println("Ingresa un numero entre 2 y 50");
        }
    }

    public static void main(String[] args) {
        Cuadrado fc = new Cuadrado();
        fc.dato();
        fc.proceso();
    }
}