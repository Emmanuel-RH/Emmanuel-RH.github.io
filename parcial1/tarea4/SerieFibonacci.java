//Programa: 1
//Imprime la serie Fibonacci

class SerieFibonacci {
    public static void main(String[] args) {
    
        int num1= 0;
        int num2= 1;
        int temp;
        int limite = 20;

        System.out.println(num1);
        System.out.println(num2);

        while (num2 + num1 <= limite) {
            temp = num1;
            num1 = num2;
            num2 = temp + num1;
        System.out.println(num2);
        }
    }
}