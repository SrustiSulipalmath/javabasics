public class UnsignedRightShift {
    public static void main(String args[]) {
       int a = 240;
 
 
       // Binary representation of 240 is 1 1 1 1 0 0 0 0
       // Unsigned right shift means remove 
       // number of bits to the right and 
       // append into the left 0 0 1 1 1 1 0 0 = 60.
       System.out.println("a >>> 2 = " + (a >>> 2));
    }
 }

 //This operator is used to shift the bits of the number to the right and fills 0 in the void spaces that are left as a result. 
 //The leftmost bit is set to be 0.


 //The left shift and right shift operators should not be used for negative numbers. If any of the operands is a negative number, 
 //it results in undefined behaviour. For example results of both -1 << 1 and 1 << -1 is undefined. Also, if the number is shifted more than 
 //the integer’s size, the behaviour is undefined. For example, 1 << 33 is undefined if integers are stored using 32 bits.


 //Signed right shift (>>) preserves the sign of the number by extending the sign bit.
//Unsigned right shift (>>>)ignores the sign and always shifts 0s into the leftmost bits. 
//This is particularly useful when working with bitwise operations on unsigned data.
 

 