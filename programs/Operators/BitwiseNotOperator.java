public class BitwiseNotOperator {
    public static void main(String args[]) {
       int a = 6;
 
       // Binary representation of 6 is 000000000000000000000000000000110                                           // 32 bit representation
       // complement is invert the bits 111111111111111111111111111111001, which is binary representation of -7      
       // Result is -7
       System.out.println("~a = "+ ~a);
    }
 }

 // ~1 = 0

 //~0 = 1
 //ComplementOperator

 // It takes one number and inverts all bits of it.