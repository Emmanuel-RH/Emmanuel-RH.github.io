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

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i] [j] + " ");
            }
            System.out.println("");
        }
    }
}