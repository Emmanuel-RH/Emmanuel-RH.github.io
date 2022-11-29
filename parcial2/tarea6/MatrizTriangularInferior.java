package parcial2.tarea6;

//Programa 7

public class MatrizTriangularInferior {
    public static void main(String[]args){
        
        //se crea un array(matriz)
        int a [][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println("Matriz Triangular Inferior:");

        //agregamos un for que aumente de 1 en 1 en escalera hasta el 5
        for (int i = 0; i < 5; ++i){
            for (int j = 0; j < 5; ++j){
                if (i>=j){
                    a[i][j] = i+1;
                }
            }
        } 

        //agregamos un nuevo for donde acoplamos el anteior a la plantilla del array
        for (int i = 0; i < 5; ++i){
            for (int j = 0; j < 5; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}