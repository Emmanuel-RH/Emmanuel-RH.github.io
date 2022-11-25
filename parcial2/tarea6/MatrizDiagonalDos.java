package parcial2.tarea6;

//Programa 8

public class MatrizDiagonalDos {
    public static void main(String[]args){
        int a [][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
        };
        System.out.println("Matriz Diagonal:");

        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                if (i>=j){
                    a[i][i] = i+1;
                }
            }
        } 

        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
