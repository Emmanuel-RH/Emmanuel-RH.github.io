package ejercexamord;

public class EmmanuelReyesProg10 {
    public static void main(String[]args){
        
        System.out.println("Nombre: José Emmanuel Reyes Hernández"); //se imprimen mis datos de estudiante
        System.out.println("Matrícula: S22022269");
        System.out. println("");
        
        //declaramos un array de 8x8
        int a[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
        
        };

        System.out.println("Diagonal inferior: ");
        System.out.println("");

                for (int i = 0; i < 8; ++i){ //agregamos un for donde se recorre el array para aumentar 1 digito
                    for (int j = 0; j < 8; ++j){
                        if (i>=j){
                            a[i][j] = i+1;
                        }
                    }
                }

                for (int i = 0; i < 8; ++i){ //agregamos otro donde imprimiremos el array y le daremos estetica
                    for (int j = 0; j < 8; ++j){
                        System.out.print(a[i][j] + " ");
                    }
                    System.out.println(); 
                }
            
                int suma = 0; //añadimos la variable suma para realizar la operacion en el for

                for (int i = 0; i < 8; ++i){ //agregamos for donde recorremos el array y sumamos solo los indicados
                for (int j = 0; j < 8; ++j){
                if (i>=j){
                    a[i][j] = i+1;
                    suma += a[i][j];
                }
            }
        }
            System.out.println("La suma por debajo de la diagonal principal: "+suma); //imprimimos el resultado
    }
}
        