package Basic;

public class Reverse_a_String {
    public static void main(String[] args) {
        String s = "sha";
        reverseString(s);
    }

    public static String reverseString(String s) {
        // code here
        StringBuilder str = new StringBuilder(s);
        String st =  new String (str.reverse());
         return st;
    }
}
