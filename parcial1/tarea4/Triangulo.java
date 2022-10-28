//Programa 7
//Capturar n, validar que sea un entero en el rango de 0 a 9 y usando ciclos producir un triangulo

import javax.swing.JOptionPane;

public class Triangulo {

    public static void trian(int entrada_datos) {

        if (entrada_datos>=0 && entrada_datos<=9) {
            System.out.println();

          for(int altura = 1; altura<=entrada_datos; altura++){
        
            for(int blancos = 1; blancos<=entrada_datos-altura; blancos++){
                System.out.print(" ");
            }
 
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
          }

        }else {

            JOptionPane.showMessageDialog(null, "Error \n El numero que usted ingreso no es valido");
        }
    }
    public static void main(String[] args) {

       int entrada_datos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa en numeros el tamaño que deseas que tenga \n la impresión del triangulo en un rango de 0 a 9: "));
       trian(entrada_datos);

    }

}
