 public class overflowunderflow{

	public static void main(String args[]) {
	
		// Overflow
		int overFlow = 2147483647;   //Integer.MAX_VALUE
		System.out.println("Overflow : "+ (overFlow + 1));         
		
		// Underflow
		int underFlow = -2147483648;  //INTERGER.MIN_VALUE
		System.out.println("Underflow : " + (underFlow - 1));
     	
 	}
} 
    

