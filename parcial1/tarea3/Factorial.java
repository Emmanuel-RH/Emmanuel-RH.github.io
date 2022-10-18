class Factorial {
    public static void main(String[] args) {
        
      double fact =1;
      double n = 4.5;
  
      // for loop
      for (int i = 1; i <= n; ++i) {
        // body inside for loop
        fact *= i;     // 
        System.out.println(fact);
      }
      System.out.println("Sum ="  + fact);
    }
  }