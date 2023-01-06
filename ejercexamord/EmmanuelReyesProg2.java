package ejercexamord;
import java.util.Scanner; //importamos la libreria que nos permita leer teclado

class EmmanuelReyesProg2 {
	public static void main(String[] args) {

        System.out.println("Nombre: José Emmanuel Reyes Hernández");
        System.out.println("");

		    try (Scanner escaner = new Scanner(System.in)) {    //añadimos el escaner que capture el digito ingresado
            System.out.println("Introduce un número: ");
            double numero = escaner.nextDouble();
        
        //agregamos if & else para que haga comparaciones y el programa tome una desiciones
        if (numero == 0) {
            System.out.println("El número es cero.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es positivo."); 
            }
        //el programa imprime el resultado
        }
	}
}