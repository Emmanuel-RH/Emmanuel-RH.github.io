package parcial2.tarea6;
import java.util.Scanner;

//Programa 10

public class MatrizEscalarCaptura {
    public static void main (String[]args){
      
            int a [][]={
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
            };

            System.out.println("Matriz escalar capturada:");

            try (Scanner num = new Scanner(System.in)) {
                System.out.print("Ingrese un valor: ");
                int n=num.nextInt();
            
            for (int i = 0; i < a.length; ++i){
                a[i][i] = n;
            }

            for (int i = 0; i < 4; ++i){
                for (int j = 0; j < 4; ++j){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
