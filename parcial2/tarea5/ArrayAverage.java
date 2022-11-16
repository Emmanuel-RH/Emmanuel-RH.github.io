package parcial2.tarea5;

public class ArrayAverage {
    public static void main (String[] args){
    
    int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
    int sum = 0;
    Double average;
    
    //introducimos los elementos que utlizaremos en el loop
    for (int number : numbers){
        sum += number;
    }

    //obtenemos el totala de los numero de los elementos
    int arrayLength = numbers.length;

    //calculamos el promedio
    //convertimos el promedio de int a double
    average = ((double)sum / (double)arrayLength);

    System.out.println("Suma =" + sum);
    System.out.println("Promedio =" + average);

    }
}
