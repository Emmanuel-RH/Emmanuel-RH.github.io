class IfElse {
    public static void main(String[] args) {
      int number = 10;
  
      // checks if number is greater than 0
      if (number > 0) {
        System.out.println("The number is positive.");
      }
      
      // execute this block
      // if number is not greater than 0
      else {
        System.out.println("The number is not positive.");
      }
  
      System.out.println("Statement outside if...else block");
    }
  }