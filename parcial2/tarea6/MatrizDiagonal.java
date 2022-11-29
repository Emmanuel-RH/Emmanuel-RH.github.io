package parcial2.tarea6;

//Programa 4

public class MatrizDiagonal{
  
    static void printPrincipalDiagonal(int mat[][], int n) //se ejecuta la agrupación para agregar el for
    {
        System.out.print("Principal Diagonal: ");
 
        //declaramos un for donde se recorre el array y se agrega la condición 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                //se ejecuta el if si la condición no se cumple
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println(" "); //imprimimos los numeros diagonales de la matriz
    }

    public static void main(String args[])
    {

        //declaramos dos variables a y n, donde n es la cantidad de numeros que se imprimiran y a contiene el array.
        int n = 4;
        int a[][] = { {-1, 4, 0, 17},
                      {12, -3, 8, 6},
                      {2, 9, 3, -4},
                      {15, 6, 1, 0} 
                    };
 
        printPrincipalDiagonal(a, n); //agrupacion de las variantes
    }
}