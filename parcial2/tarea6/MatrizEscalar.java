package parcial2.tarea6;
import java.util.Scanner;

//Programa 2

public class MatrizEscalar {
    public static void main (String arg[]){

    //declaramos un array con la variable A
    int [][] A = {
        {2, 0, 1},
        {3, 0, 0},
        {5, 1, 1}
    };

    //declaramos un array con la variable B que nos sirve de plantilla.
    int [][] B = {
        {0, 0, 0},
        {0, 0 ,0},
        {0, 0, 0}
    };

    //añadimos el scanner para pedir un valor
    try (Scanner reader = new Scanner(System.in)) {
        int escalar = 2;
        System.out.println ("Escalar: ");
        escalar = reader.nextInt();

        //agregamos un for donde la condición se multiplique por la variante
        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A[i].length; j++) {
                B[i][j] = A [i][j] * escalar;
            }
        }
    }
        //agregamos un segundo for donde se implente el array B donde se acomoda el primer for a traves de la condicion A=B
        for (int i=0; i < B.length; i++) {
            for (int j=0; j < B[i].length; j++) {
            System.out.print(B[i][j] + " ");
        }
        System.out.println(""); //Imprimimos el array ordenado
    }
}
}