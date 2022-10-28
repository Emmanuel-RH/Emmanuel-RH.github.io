//Programa 6
//Capturar n, validar que sea un entero en el rango de 0 a 9 y usando ciclos producir un cuadrado de n dimension

import javax.swing.JOptionPane;

public class Cuadrado {

    public static void cubo(int entrada_datos) {

        if (entrada_datos>=0 && entrada_datos<=9) {
      
          for (int i=0;i<entrada_datos;i++) {
             System.out.print("*");

            }

          System.out.println();

          for (int i=0;i<entrada_datos-2;i++) {
             System.out.print("*");

             for (int j= 0; j<entrada_datos-2; j++) {

                 System.out.print(" ");

                } 

              System.out.println("*");

            }

          for (int i=0; i<entrada_datos; i++) {

             System.out.print("*");

            }

        } else {

            JOptionPane.showMessageDialog(null, "Error \n El numero que usted ingreso no es valido");
        
        }
     
    }

    public static void main(String[] args) {

        int entrada_datos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa en numeros el tamaño que deseas que tenga \n la impresión del cuadrado en un rango de 0 a 9: "));
        cubo(entrada_datos);

    }

}
