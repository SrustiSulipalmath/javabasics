public class SignedRightShift {
    public static void main(String args[]) {
       int a = 8;
  
       // Binary representation of 8 is 1 0 0 0
       // signed right shift means remove
       // the number of 0’s to the right. 1 0  = 2
       System.out.println("a >> 2 =  "+ (a >> 2));
    }
  }

  //It takes two numbers; the right shift operator shifts the bits of the first operand, 
  //the second operand decides the number of places to shift.