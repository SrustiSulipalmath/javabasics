public class BitwiseComplement {
    public static void main(String[] args) {
       int num1 = 7;
       int num2 = -8;
 
       // Perform bitwise complement
       int complementNum1 = ~num1;
       int complementNum2 = ~num2;
 
       System.out.println("Bitwise complement of " + num1 + " is " + complementNum1);
       System.out.println("Bitwise complement of " + num2 + " is " + complementNum2);
    }
 }