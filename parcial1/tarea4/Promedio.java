//Programa 4
//Permitir la captura de numeros y realizar su promedio

import javax.swing.JOptionPane;

public class Promedio {

    public static void prome(int iteracion) {

        double [] array = new double [iteracion];
        double entrada;

        System.out.print("El promedio: ");

        for (int i = 0; i<array.length; i++) {

            entrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa los números a promediar: "));
            array[i] = entrada;

            if (i<array.length-1) {

                System.out.print(array[i]+ " + ");

            }else if (i == array.length-1) {

                System.out.print(array[i]+ " = ");

            } 
        
        }
         
        entrada = 0;

        for (int i=0;i<array.length;i++) {

            entrada += array[i];

        }

        System.out.print(entrada/array.length+ ".");
 
    }
    
    public static void main(String[] args) {

        int iteracion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos números desea promediar?"));
        prome(iteracion);

    }

}