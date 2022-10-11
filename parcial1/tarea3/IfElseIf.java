class IsElseIf {
    public static void main(String[] args) {
  
      double number = -0.0000;
  
      // checks if number is greater than 0
      if (number > 0) {
        System.out.println("The number is positive.");
      }
  
      // checks if number is less than 0
      else if (number < 0) {
        System.out.println("The number is negative.");
      }
      
      // if both condition is false
      else {
        System.out.println("The number is 0.");
      }
    }
  }