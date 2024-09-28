public class UnaryNotOperator {
    public static void main(String args[]) {
        int a = 10, b = 20;
       
           // Without using NOT unary operator.
        System.out.println("(a < b) = "+ (a < b));//true
        
        // Using unary NOT operator.
        System.out.println("!(a < b) = " + !(a < b));//false
   }
 }
