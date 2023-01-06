package ejercexamord;
import java.util.Scanner; //importamos la libreria que nos permite leer el teclado

public class EmmanuelReyesProg5 {
    public static void main (String[] args){
        
        try (Scanner sc = new Scanner(System.in)) {  //agregamos el scanner para capturar los datos a ingresa
        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();

        System.out.println(""); //agrego un espacio para cuestión de estetica

        for (int i = 1; i <= n; ++i) { //agregamos el ciclo para que se repita las veces que se digite
        System.out.println("Nombre:               José Emmanuel Reyes Hernández");
        System.out.println("Matrícula:            S22022269");
        System.out.println("Correo Institucional: ZS22022269@estudiantes.uv.mx");
        System.out.println("");
        }
        }
    }
}