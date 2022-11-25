package parcial2.tarea6;
import java.util.Scanner;

//Programa 2

public class MatrizEscalar {
    public static void main (String arg[]){

    int [][] A = {
        {2, 0, 1},
        {3, 0, 0},
        {5, 1, 1}
    };
    int [][] B = {
        {0, 0, 0},
        {0, 0 ,0},
        {0, 0, 0}
    };

    try (Scanner reader = new Scanner(System.in)) {
        int escalar = 2;
        System.out.println ("Escalar: ");
        escalar = reader.nextInt();

        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A[i].length; j++) {
                B[i][j] = A [i][j] * escalar;
            }
        }
    }
    for (int i=0; i < B.length; i++) {
        for (int j=0; j < B[i].length; j++) {
           System.out.print(B[i][j] + " ");
        }
        System.out.println("");
    }
}
}