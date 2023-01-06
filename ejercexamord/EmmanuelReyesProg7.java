package ejercexamord;

public class EmmanuelReyesProg7 {
    public static void main (String[] args) {
        
        System.out.println("Nombre: José Emmanuel Reyes Hernández"); //imprimimos mis datos de estudiante
        System.out.println("Matrícula: S22022269");
        System.out.println("");

        String[] nombres = new String[5]; //declaramos el array

        //almacenamos los nombres dentro del array
        nombres[0] = "Rafael";
        nombres[1] = "Cristian";
        nombres[2] = "Hector";
        nombres[3] = "Josue";
        nombres[4] = "Jasub";

        //imprimimos los nombres del array
        System.out.println("Mis mejores amigos son:");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);
        System.out.println(nombres[4]);
    }
}
