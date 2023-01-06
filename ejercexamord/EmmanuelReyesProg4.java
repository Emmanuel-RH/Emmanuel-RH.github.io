package ejercexamord; 
import java.util.Scanner; //importamos la libreria que permite leer teclado

public class EmmanuelReyesProg4 {
    public static void main(String[] args) {
  
        System.out.println("Nombre: José Emmanuel Reyes Hernández"); //se imprimen mis datos de estudiante
        System.out.println("Matrícula: S22022269");
        System.out. println("");

        try (Scanner sc = new Scanner(System.in)) {  //agregamos el scanner para capturar los datos a ingresar
            System.out.println("Ingrese un número para saber el mes: ");
            int mes = sc.nextInt();
            
        String mesesdelaño; //se elabora la lista de los meses del año donde se les adjunta un numero de identificación
        switch (mes) {

        case 1:  mesesdelaño = "Enero";
                 break;
        case 2:  mesesdelaño = "Febrero";
                 break;
        case 3:  mesesdelaño = "Marzo";
                 break;
        case 4:  mesesdelaño = "Abril";
                 break;
        case 5:  mesesdelaño = "Mayo";
                 break;
        case 6:  mesesdelaño = "Junio";
                 break;
        case 7:  mesesdelaño = "Julio";
                 break;
        case 8:  mesesdelaño = "Agosto";
                 break;
        case 9:  mesesdelaño = "Septiembre";
                 break;
        case 10: mesesdelaño = "Octubre";
                 break;
        case 11: mesesdelaño = "Noviembre";
                 break;
        case 12: mesesdelaño = "Diciembre";
                 break;
        default: mesesdelaño = "Invalido. Introduzca un número del 1 al 12.";
                 break;
        }

        System.out.println("El mes es: " + mesesdelaño); //se imprime el mes del digito ingresado
        }
    }
}

