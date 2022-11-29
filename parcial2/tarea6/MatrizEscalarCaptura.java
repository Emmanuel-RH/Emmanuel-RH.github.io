package parcial2.tarea6;
import java.util.Scanner;

//Programa 10

public class MatrizEscalarCaptura {
    public static void main (String[]args){
      
            //ingresamos un array
            int a [][]={
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
            };

            System.out.println("Matriz escalar capturada:");

            //agregamos scanner para poder leer los datos ingresados y darle un valor
            try (Scanner num = new Scanner(System.in)) {
                System.out.print("Ingrese un valor: ");
                int n=num.nextInt();
            
            //agregamos una condicion donde el valor es comparado con el array y pueda incorporarse
            for (int i = 0; i < a.length; ++i){
                a[i][i] = n;
            }

            //este for indica hasta que cantidad que numeros y el recorrido que debe realizar el for
            for (int i = 0; i < 4; ++i){
                for (int j = 0; j < 4; ++j){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
