package parcial2.tarea6;

//Programa 4

public class MatrizDiagonal{
  
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println("");
    }

    public static void main(String args[])
    {
        int n = 4;
        int a[][] = { {-1, 7, 0, 17},
                      {12, -3, 8, 6},
                      {2, 9, 3, -4},
                      {15, 6, 1, 0} 
                    };
 
        printPrincipalDiagonal(a, n);
    }
}