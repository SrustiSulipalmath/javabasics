import java.util.*;
public class InputMismatchException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //sc.next();
        int a = sc.nextInt();
        System.out.println(str+" "+a);
    }
}

//input  : abc def 10
//output : abc 10


//java -d . classname