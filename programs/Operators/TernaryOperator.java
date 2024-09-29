public class TernaryOperator {
    public static void main(String args[]) {
       int a = 50;
       int b = 100;
       int minimum;
 
 
       // Printing the value of a and b
       System.out.println("First Number = " + a);
       System.out.println("Second Number = " + b);
      
       // Find the minimum number 
       minimum = (a < b) ? a : b;
 
 
      // Printing the minimum number
      System.out.println("Minimum Number = " + minimum);
    }
 }  
 
 //variable = expression1 ? expression2 : expression3
 //Java Ternary operator is also known as the conditional operator: This operator is the only conditional operator in java that takes three operands. 
 //We can use ternary operator in place of if-else statement or even switch statement. 