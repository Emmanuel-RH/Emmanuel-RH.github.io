//Programa 7
//Capturar n, validar que sea un entero en el rango de 0 a 9 y usando ciclos producir un triangulo

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

    Scanner piramide=new Scanner(System.in);
        System.out.print("Ingresar cantidad de filas: ");
        int n=piramide.nextInt();
        piramide.close();

    System.out.println();
    for (int i = 1; i < n+1; i++ ){
    for (int j = 1; j < n; j++){
    System.out.print(" ");
}

        for (int l = 9; l >= (i); l=l-1){
System.out.print(" ");
}

        for (int l = 1; l <= (i*2)-1; l++){
System.out.print("*");
}
System.out.println();
        }
    }
}