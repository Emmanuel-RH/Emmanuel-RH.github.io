package parcial2.tarea5;

public class MultidimensionalArray {
    public static void main(String[] args) {

        //creamos un array 2d
        int [][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 5, 2},
        };

        //calculamos el length
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

    }

}
