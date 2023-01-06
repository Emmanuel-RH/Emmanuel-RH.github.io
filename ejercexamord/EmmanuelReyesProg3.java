package ejercexamord;
import java.util.Scanner;

public class EmmanuelReyesProg3 {

    public static void main(String[] args) {
        
        System.out.println("Nombre: José Emmanuel Reyes Hernández"); //se imprimen mis datos de estudiante
        System.out.println("Matrícula: S22022269");
        System.out. println("");

            try (Scanner sc = new Scanner(System.in)) { //añadimos el escaner que nos permita capturar el digito
            System.out.println("Ingrese un numero:");
            int num = sc.nextInt();

        if ( (num > 9) || (num < 0) )  { //comparamos números 
            System.out.println("Número invalido.");
        } else {
            System.out.println("ES DIGITO."); //muestra el resultado en caso de estar en un rango de 0 a 9
            }
        }
    }
}