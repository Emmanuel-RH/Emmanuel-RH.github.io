//Programa 3
//Calcular una función cúbica

public class Cubica {

     public static void cubo() {

        double [] array = new double [20];
        int rango_numeral=-10,indice_tabla=-10;

        for (int i=0; i<array.length; i++) {

            array [i] = rango_numeral;
            rango_numeral ++;
           
        }
        
        System.out.println("---------------------");

        for (int i=0; i<array.length; i++) {

            array[i] = Math.pow(array[i], 3);
            
            System.out.println(indice_tabla+" | "+array[i]);
            indice_tabla++;

        }

        System.out.println("---------------------");

     }

    public static void main(String[] args) {
       cubo();
    }
    
}