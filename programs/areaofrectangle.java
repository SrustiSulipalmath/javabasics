import java.util.*;
public class areaofrectangle {

	public static int area(int length,int breadth){
		return length*breadth;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int L=sc.nextInt();
		int B=sc.nextInt();
		System.out.println(area(L,B));
		
	}
}

