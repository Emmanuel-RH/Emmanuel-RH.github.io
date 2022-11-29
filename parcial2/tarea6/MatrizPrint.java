package parcial2.tarea6;

//Programa 1

class MatrizPrint {
    public static void main (String[] args) {

        //declaramos un array
        int[][] a = {
            {1, -2, 3},
            {1, 3, 6, 9},
            {7},
        };

        //agregamos un for el cual recorre la matriz, marca la condición para imprimir la matriz.
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i] [j] + " ");  //imprime la matriz y agregamos un enter
            }
            System.out.println(""); 
        }
    }
}