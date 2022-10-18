// Program to find the sum of natural numbers from 1 to 1000.

class ForSum {
    public static void main(String[] args) {
        
      double sum = 0;
      double n = 5;
  
      // for loop
      for (double i = 1; i <= n; ++i) {
        // body inside for loop
        sum += i;     // sum = sum + i
        System.out.println(sum);
      }
         
      System.out.println("Sum = " + sum);
      System.out.println("Avg= " + sum / n);
    }
  }