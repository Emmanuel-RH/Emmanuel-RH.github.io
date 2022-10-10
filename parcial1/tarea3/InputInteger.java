import java.util.Scanner;

class InputInteger {
    public static void main(String[] args) {
    	
        //creamos una instancia de clase Scanner 
        //llamado input
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); //usamos input para leer un entero
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
    }
}
