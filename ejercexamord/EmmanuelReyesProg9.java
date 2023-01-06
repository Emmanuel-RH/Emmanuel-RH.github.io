package ejercexamord;

public class EmmanuelReyesProg9 {
    public static void main (String[] args){
        
        System.out.println("Nombre: José Emmanuel Reyes Hernández"); //se imprimen mis datos de estudiante
        System.out.println("Matrícula: S22022269");
        System.out. println("");
        
        int[][] a = {
            {0, 1, 2}, 
            {3, 4, 5}, 
            {6, 7, 8},
        };
        System.out.println("Matriz 3x3: ");
     
        for (int i = 0; i < a.length; ++i) { //ciclo que recorre e imprime la matriz
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
             System.out.println();
        }
       
        System.out.print("La diagonal principal es: "); //con la matriz recorrida imprimimos solo la matriz principal
        for (int l = 0; l < 3; ++l) {
             System.out.print(a[l][l]+" ");
        }
        System.out.println("");
        
        int suma = 0; //añadimos la variable suma para realizar la operacion en el for

        for (int i = 0; i < a.length; ++i) { //añadimos el ciclo for para realizar la suma de la diagonal
            for(int j = 0; j < a[i].length; ++j) {
                if (i==j) {
                    suma += a[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+suma); //imprimimos el resultado
    }
}