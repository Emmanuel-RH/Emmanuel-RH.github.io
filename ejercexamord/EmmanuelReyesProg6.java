package ejercexamord;
import java.util.Scanner;

public class EmmanuelReyesProg6 {
    public static void main (String[] args){

        System.out.println("Nombre: José Emmanuel Reyes Hernández");
        System.out.println("");

        try (Scanner sc = new Scanner(System.in)) {  //agregamos el scanner para capturar los datos a ingresa
            System.out.println("Ingrese un número natural entero: ");
            int n = sc.nextInt();
    
            System.out.println("Los numeros pares menores son: "); //agrego un espacio para cuestión de estetica
    
            for (int i = n; i >= 2; i=i-2) { //agregamos el ciclo donde se llevara a cabo el proceso de retroceso en pares
            System.out.println(i); 
            }
        }
    }
}
