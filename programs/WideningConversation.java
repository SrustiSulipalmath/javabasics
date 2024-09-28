public class WideningConversation {
    public static void main(String args[]) {

        // Automatic Type Conversion.
        int i = 2147483647; // Int max value in java.
        long l = i; // Automatically converted to long, now we can extend l's value.
        l = l + 1;
        double d = l; // Automatically converted to double.
        System.out.println("Int value : " + i);
        System.out.println("Long value : " + l);
        System.out.println("Double value : " + d);
    }
}
//byte -> short -> int -> long -> float -> double ( Widening or Automatic Type Conversion)
