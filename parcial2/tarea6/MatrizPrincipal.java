package parcial2.tarea6;

//Programa 5

public class MatrizPrincipal {
    public static void main(String[]args){

        //se agrega un array
        int a[][] = {
            {5, 7, 0},
            {-1, 4, 3},
            {0, 2, 5}
        };
        System.out.println("Matriz 3x3:");
     

        //agregamos un for donde le indicamos al programa que casilleros tomar en cuenta
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
             System.out.println();
        }

        int suma = 0; //añadimos la variable suma para realizar la operacion en el for

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                if (i==j) {
                    suma += a[i][j];
                }
            }
        }
        System.out.println("La suma del diagonal es: "+suma);
    }
}