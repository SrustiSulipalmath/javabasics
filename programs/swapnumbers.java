import java.util.*;
public class swapnumbers {
   

    public static void swapNumber(int []a, int []b) {
       int[] temp={0};
       temp[0] = a[0];
       a[0]=b[0];
       b[0]=temp[0];
       
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a={0},b ={0};
        a[0] =sc.nextInt();
        b[0] =sc.nextInt();
        swapNumber(a,b); 
        System.out.println(a[0]+" "+b[0]);
    }
}

