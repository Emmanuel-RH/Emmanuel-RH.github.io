package parcial2.tarea6;

//Programa 9

public class MatrizIdentidad {
    public static void main(String[]args){

        //Matriz Ingresada.
        int a [][]={
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
        };
        System.out.println("Matriz Identidad: ");
        
        for (int i = 0; i < a.length; ++i){
            a[i][i] = 1;
        }

        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
