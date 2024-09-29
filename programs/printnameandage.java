import java.util.Scanner;

public class printnameandage {
    
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = sc.nextInt();
		System.out.print("The name of the person is "+s+" and the age is "+age+".");
		
	}
}
