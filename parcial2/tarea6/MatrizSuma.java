package parcial2.tarea6;
import java.util.Scanner;

//Programa 3

public class MatrizSuma {
    public static void main(String args[]) {

        //declaramos un array A por el cual se va a multiplicar.
        int[][] A = {
            {2, 2,},
            {2, 2,}
        
        };

        //declaramos un nuevo array B que sirve como plantilla.
        int[][] B = {
            {1, 1},
            {1, 1}
        };

        //añadimos el scanner que permite calcular la variable arriba de 2
        try (Scanner reader = new Scanner(System.in)) {
            int escalar = 2;
            System.out.println("Escalar : ");
            escalar = reader.nextInt();
        
         
        //agregamos un for donde la condición se multiplique por la variante        
        for (int i =0;i < A.length; i++) {
        for(int j = 0; j < A [i].length; j++) {
            B[i][j]= A[i][j] * escalar; 
        }
    }
}

        //agregamos otro for donde se comparan las variables A y B y B sirve como plantilla para acomodar el array.
            for (int i =0;i < B.length; ++i) {
        for(int j = 0; j < B [i].length; ++j) {
            System.out.print(B[i][j] + " ");
        }
        System.out.println(""); //imprimimos el array acomodado
    }
}
}